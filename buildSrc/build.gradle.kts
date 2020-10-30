import org.gradle.kotlin.dsl.`kotlin-dsl`
plugins {
    kotlin("jvm") version "1.4.10" apply true
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

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
