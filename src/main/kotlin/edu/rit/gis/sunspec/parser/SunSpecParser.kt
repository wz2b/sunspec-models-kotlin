package edu.rit.gis.sunspec.parser

import edu.rit.gis.sunspec.annotations.SunSpecPoint
import edu.rit.gis.sunspec.models.Model_1
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.experimental.and
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty
import kotlin.reflect.full.memberProperties

class SunSpecParser {

    fun <T> parse(modelClass: Class<T>, data: ByteArray): T {

        /*
         * Create an instance of the model into which to load our data
         */

        val dest = modelClass.newInstance()
        modelClass.declaredFields
                .filter { field -> field.isAnnotationPresent(SunSpecPoint::class.java) }
                .forEach { field ->
                    val a = field.getAnnotation(SunSpecPoint::class.java)
                    val type = a.type
                    val startByteIndex = a.offset * 2
                    val lenInBytes = a.len * 2

                    if (startByteIndex + lenInBytes <= data.size) {

                        val properties: Collection<KProperty<*>> = Model_1::class.memberProperties
                        when (type) {
                            "string" -> {
                                val temp = data.slice(startByteIndex until (startByteIndex + lenInBytes))
                                val property = properties.find { property -> property.name == field.name }
                                if (property is KMutableProperty<*>) {
                                    property.setter.call(dest, String(temp.toByteArray()))
                                }
                            }

                            "uint16" -> {
                                val temp = data.slice(startByteIndex until (startByteIndex + lenInBytes) )
                                val property = properties.find { property -> property.name == field.name }
                                if (property is KMutableProperty<*>) {

                                    println("Set property ${property.name} type ${property.javaClass.canonicalName}")
                                    val b1 = temp[0].toUInt().shl(8)
                                    val b2 = temp[1].toUInt()
                                    val i = (b1 or b2).toInt()
                                    val setter = property.setter
                                    setter.call(dest, i)
                                }

                            }
                            else -> {
//                                log.debug("I don't know how to map type ${type}")
                            }
                        }
                    } else {
//                        log.debug("Cannot map field ${field.name} because the response was too short")
                    }
                }
        return dest

    }


}

class SunSpecBytes constructor(val data: ByteArray) {
    val bb = ByteBuffer.wrap(data)
    init {
        bb.order(ByteOrder.BIG_ENDIAN)
    }

    fun toUInt16(offset: Int): Int {
        return bb.getShort(offset).toUShort().toInt()
    }

    fun toString(offset: Int, size: Int): String {
        val temp = data.slice(offset until (offset + size))
        return String(temp.toByteArray()).trimEnd()
    }

    fun toInt16(offset: Int): Int {
        return bb.getShort(offset).toInt()
    }
}