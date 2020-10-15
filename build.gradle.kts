import edu.rit.gis.sunspec.gradle.SunSpecGen

plugins {
    kotlin("jvm") version "1.4.10" apply true
    `java-library` apply true
    java
}

repositories {
    mavenCentral()
    jcenter()
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}


tasks.register<SunSpecGen>("generate-models") {
    inputDir = "$projectDir/models"
    pkg = "edu.rit.gis.sunspec.models"
    annotationsPkg = "edu.rit.gis.sunspec.annotations.*"
    outputDir = "$projectDir/src/main/kotlin/edu/rit/gis/sunspec/models"
}

