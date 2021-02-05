package edu.rit.gis.sunspec.gradle

import java.util.*


data class group(val name: String,
                 val desc: String = name,
                 val points: Array<point> = emptyArray())

data class point(val name: String,
                 val desc: String = name,
                 val label: String = name,
                 val type: String,
                 val size: Int)

data class SunSpecModelDefinition(
        val id: Int,
        val group: group)


typealias SunSpecPoint = point
