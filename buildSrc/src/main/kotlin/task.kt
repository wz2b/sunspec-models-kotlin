package edu.rit.gis.sunspec.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.InvalidUserDataException
import java.io.File

public open class SunSpecGen : DefaultTask() {

    @org.gradle.api.tasks.Input
    var inputDir = "models"

    @org.gradle.api.tasks.Input
    var pkg = ""

    @org.gradle.api.tasks.Input
    var annotationsPkg = ""

    @org.gradle.api.tasks.Input
    var outputDir = project.projectDir.toPath().resolve("src/main/kotlin").toString()

    @org.gradle.api.tasks.TaskAction
    fun runTask() {
        val dest = File(outputDir)
        if (dest.exists()) {
            if (dest.isDirectory == false) {
                throw InvalidUserDataException("${dest.absolutePath} exists but is not a directory")
            }
        } else {
            dest.mkdirs()
        }

        getLogger().info("Finding models")

        var input = File(inputDir)
        if (input.exists() == false or input.isDirectory == false) {
            throw InvalidUserDataException("$inputDir doesn't exist or is not a directory")
        }


        input.walkTopDown().filter { file ->  file.isFile && file.extension == "json" && file.name.startsWith("model_") }.forEach {
            file ->
            val outputFile = File(outputDir).resolve("${file.nameWithoutExtension}.kt")
            val code = SunSpecKotlinEmitter(file, pkg, annotationsPkg).generateModel()
            val fn = file.nameWithoutExtension + ".kt"
            val os = outputFile.outputStream()
            os.write(code.toByteArray())
            os.close()

        }

    }

}
