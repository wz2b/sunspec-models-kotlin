import edu.rit.gis.sunspec.gradle.SunSpecGen

group = "edu.rit.gis.sunspec"
version = "1.0-SNAPSHOT"


/*
 * TO PUBLISH:  gradle publishToMavenLocal
 */
plugins {
    kotlin("jvm") version "1.4.20" apply true
    `java-library` apply true
    java
    `maven-publish` apply true
    kotlin("plugin.serialization") version "1.4.20"
}

repositories {
    mavenCentral()
    jcenter()
}



dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.21")

    constraints {
        implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.21")
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xuse-experimental=kotlin.ExperimentalUnsignedTypes"
    }
}

tasks.register<SunSpecGen>("generate-models") {
    inputDir = "$projectDir/models"
    pkg = "edu.rit.gis.sunspec.models"
    annotationsPkg = "edu.rit.gis.sunspec.annotations.*"
    outputDir = "$projectDir/src/main/kotlin/edu/rit/gis/sunspec/models"
}

/* To publish locally, run: gradle publishToMavenLocal */

publishing {
    publications {

        create<MavenPublication>("mavenJava") {
            from(components["java"])
            pom {
                name.set("Kotlin SunSpec Models")
                description.set("Annotated kotlin implementation of SunSpec register definitions")
                artifactId = "sunspec-kotlin"

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("cepasp")
                        name.set("Christopher Piggott")
                        email.set("cepasp@rit.edu")
                    }
                }
//                scm {
//                    connection.set("scm:git:git://example.com/my-library.git")
//                    developerConnection.set("scm:git:ssh://example.com/my-library.git")
//                    url.set("http://example.com/my-library/")
//                }
            }
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}



defaultTasks("generate-models", "build", "publishToMavenLocal")