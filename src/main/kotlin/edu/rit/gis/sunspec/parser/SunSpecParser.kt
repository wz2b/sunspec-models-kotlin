package edu.rit.gis.sunspec.parser

import java.nio.ByteBuffer
import java.nio.ByteOrder


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