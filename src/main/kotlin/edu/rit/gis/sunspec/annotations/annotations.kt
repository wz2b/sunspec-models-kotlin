package edu.rit.gis.sunspec.annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class SunSpecModel(val id: Int, val len: Int, val name: String)

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class SunSpecPoint(val id: String, val label: String, val offset: Int, val len: Int, val type: String,
                              val description: String, val notes: String)

