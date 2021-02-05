package edu.rit.gis.sunspec.parser

import java.nio.ByteBuffer
import java.nio.ByteOrder


class SunSpecByteBuffer constructor(val data: ByteArray) {
    val bb = ByteBuffer.wrap(data)
    private var index = 0


    init {
        bb.order(ByteOrder.BIG_ENDIAN)
    }


    fun getString(size: Int): String {
        val temp = data.slice(index until (index + size))
        index += size
        return String(temp.toByteArray()).trimEnd()
    }


    fun getUInt16(): UShort {
        val result = bb.getShort(index).toUShort()
        index += 2
        return result
    }


    fun getInt16(): Short {
        val result = bb.getShort(index)
        index += 2
        return result
    }

    fun getUInt32(): UInt {
        val result = bb.getInt(index).toUInt()
        index += 4
        return result
    }

    fun getInt32(): Int {
        val result = bb.getInt(index).toInt()
        index += 4
        return result
    }

    fun getUInt64(): ULong {
        val result = bb.getLong(index).toULong()
        index += 4
        return result
    }

    fun getInt64(): Long {
        val result = bb.getLong(index).toLong()
        index += 8
        return result
    }

    fun getFloat32(): Float {
        val temp = bb.getFloat(index)
        index += 4
        return temp
    }

    fun getFloat65(): Double {
        val temp = bb.getDouble(index)
        index += 8
        return temp
    }

    fun getIpAddress4(): ByteArray {
        val temp = ByteArray(4)
        bb.get(temp, index, 4)
        index += 4
        return temp
    }


    fun getIpAddress6(): ByteArray {
        val temp = ByteArray(16)
        bb.get(temp, index, 16)
        index += 16
        return temp
    }


    fun getMac48(): ByteArray {
        val temp = ByteArray(6)
        bb.get(temp, index, 6)
        index += 6
        return temp
    }

}
