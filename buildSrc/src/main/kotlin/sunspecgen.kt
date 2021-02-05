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

    fun generateModel(): String {
        val model = mapper.readValue(file.readText(), SunSpecModelDefinition::class.java)

        val modelVars = model.group.points

        return ModelFile.build("Model_${model.id}") {
            comment("""
                Model ${model.id} - ${model.group.name}
            """.trimIndent())
            modelPackage("edu.rit.gis.sunspec.models");
            imports {
                add(importAnnotations)
                add("edu.rit.gis.sunspec.parser.SunSpecByteBuffer")
            }

            modelClass {
                modelVars.forEach { addVar(it) }
                companion {
                    modelVars.forEach { addVar(it) }
                }
            }
        }.render().toString()
    }
}

data class SunSpecTypedef(val sunspecType: String, val kotlinType: KClass<out Any>, val numRegisters: Int,
                          val initString: String) {
    companion object {
        private val types = arrayOf<SunSpecTypedef>(
                SunSpecTypedef("int16", Short::class, 1, "getInt16()"),
                SunSpecTypedef("uint16", UShort::class, 1, "getUInt16()"),
                SunSpecTypedef("count", UShort::class, 1, "getUInt16()"),
                SunSpecTypedef("acc16", UShort::class, 1, "getUInt16()"),
                SunSpecTypedef("string", String::class, 0, "getString(size)"),
                SunSpecTypedef("int32", Int::class, 2, "getInt32()"),
                SunSpecTypedef("uint32", UInt::class, 2, "getUInt32()"),
                SunSpecTypedef("float32", Float::class, 2, "getFloat32()"),
                SunSpecTypedef("acc32", UInt::class, 2, "getUInt32()"),
                SunSpecTypedef("int64", Long::class, 4, "getInt64()"),
                SunSpecTypedef("uint64", ULong::class, 4, "getUInt64()"),
                SunSpecTypedef("float64", Double::class, 4, "getFloat64()"),
                SunSpecTypedef("bitfield16", UShort::class, 1, "getUInt16()"),
                SunSpecTypedef("bitfield32", UInt::class, 2, "getUInt32()"),
                SunSpecTypedef("sunssf", UShort::class, 1, "getUInt16()"),
                SunSpecTypedef("pad", Any::class, 1, "getUInt16()"),
                SunSpecTypedef("ipaddr", ByteArray::class, 2, "getIpAddress4()"),
                SunSpecTypedef("ipv6addr", ByteArray::class, 4, "getIpAddress6()"),
                SunSpecTypedef("eui48", ByteArray::class, 3, "getMac48()"))
        private val typeMap = types.map { it.sunspecType to it }.toMap()

        fun get(sunSpecTypeString: String): SunSpecTypedef? = typeMap.get(sunSpecTypeString)
    }
}
