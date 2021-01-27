import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    kotlin("jvm") version "1.4.20" apply true
    `kotlin-dsl`
}
repositories {
    mavenCentral()
    google()
    jcenter()
}

dependencies {
    implementation(gradleApi())
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.+")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
