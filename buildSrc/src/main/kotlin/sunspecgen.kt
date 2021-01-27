package edu.rit.gis.sunspec.gradle

import java.io.File
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.DeserializationFeature
import org.gradle.api.InvalidUserDataException
import kotlin.reflect.KClass

class SunSpecKotlinEmitter {
    val file: File
    val builder = StringBuilder()
    val pkg: String
    val importAnnotations: String
    val mapper: ObjectMapper

    companion object {
        val TAB = "    "
    }

    constructor(file: File, pkg: String, importPkg: String) {
        this.file = file
        this.pkg = pkg
        this.importAnnotations = importPkg
        mapper = jacksonObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    }

    fun parse(): SunSpecKotlinEmitter {

        val initBuilder = StringBuilder()

        val model = mapper.readValue(file.readText(), SunSpecModelDefinition::class.java)
        builder.append("""
            /*
             * Model ${model.id}
             * ${model.group.name}
             * ${model.group.desc}
             */
            
            package ${pkg}
            import ${importAnnotations}
            
            data class Model_${model.id} (
            
        """.trimIndent())


        var offset = 0
        model.group.points.iterator().forEach { point ->

            val kt = getTypeFromString(point.type)
            val ktTypeName = kt.simpleName
            val typeLen = getLengthFromTypeString(point.type)

            if (typeLen == 0 && point.size == 0) {
                throw InvalidUserDataException("In file ${file.path} type ${point.type} does not specify a length and there is no size parameter")
            }

            val len = if (point.size > 0) point.size else typeLen
            if (ktTypeName != null) {
                when (point.type) {
                    "uint16" -> {
                        builder.append(makePoint(point, offset, typeLen, ktTypeName))
                        initBuilder.append(TAB.repeat(4)).append("${point.name} = bb.toUInt16(${offset*2}),\n")
                    }

                    "string" -> {
                        builder.append(makePoint(point, offset, typeLen, ktTypeName))
                        initBuilder.append(TAB.repeat(4)).append("${point.name} = bb.toString(${offset*2}, $len),\n")
                    }

                    else -> {
                        builder.append(TAB).append("/* ${point.name} (${point.type}) ignored */\n")
                    }
                }
            }





            offset = offset + len
        }

        builder.append(") {\n")
                .append("""
                        |companion object {
                        |    fun parse(bytes: ByteArray): Model_${model.id} {
                        |        val bb = SunSpecBytes(bytes)
                        |""".trimMargin().prependIndent())
                .append('\n')
                .append("            return Model_${model.id}(\n")
                .append(initBuilder)
                .append("            )").append("\n")
                .append("        }").append('\n') /* end parser function */
                .append("    }").append('\n') /* end companion object */
                .append("} /* end class */\n") /* end class */
        return this
    }

    fun makePoint(point: point, offset: Int, len: Int, ktTypeName: String): String {
        return """
                    |/** ${point.name} ${point.desc} */
                    |@SunSpecPoint(id="${point.name}", label="${point.label}", offset=${offset}, len=${len}, description="${point.desc?.replace('\"', '\'')}")
                    |val ${point.name}: ${ktTypeName},
                    |""".trimMargin().prependIndent()
    }

    fun emit(): String {
        return builder.toString()
    }

    fun getLengthFromTypeString(type: String): Int {
        return when (type) {
            "int16" -> 1
            "uint16" -> 1
            "count" -> 1
            "acc16" -> 1
            "enum16" -> 2
            "string" -> 0
            "int32" -> 2
            "enum32" -> 2
            "uint32" -> 2
            "float32" -> 2
            "acc32" -> 2
            "int64" -> 4
            "acc64" -> 4
            "enum64" -> 4
            "uint64" -> 4
            "float64" -> 4
            "bitfield16" -> 1
            "bitfield32" -> 2
            "sunssf" -> 1
            "pad" -> 1
            "ipaddr" -> 2
            "ipv6addr" -> 8
            "eui48" -> 3
            else -> 0
        }
    }

    fun getTypeFromString(type: String): KClass<out Any> {
        val kotlinType = when (type) {
            "int16" -> Short::class
            "uint16" -> Int::class
            "count" -> Int::class
            "acc16" -> Int::class
            "string" -> String::class
            "int32" -> Int::class
            "uint32" -> Int::class
            "float32" -> Float::class
            "acc32" -> Long::class
            "int64" -> Long::class
            "uint64" -> Long::class
            "float64" -> Double::class
            "bitfield16" -> Short::class
            "bitfield32" -> Int::class
            "sunssf" -> Any::class
            "pad" -> Any::class
            "ipaddr" -> String::class
            "ipv6addr" -> String::class
            "eui48" -> ByteArray::class
            else -> Any::class
        }

        return kotlinType
    }
}
