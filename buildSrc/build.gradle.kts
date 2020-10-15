import org.gradle.kotlin.dsl.`kotlin-dsl`
plugins {
    `kotlin-dsl`
}
repositories {
    mavenCentral()
    google()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx.dom:0.0.10")
    implementation(gradleApi())
}