package edu.rit.gis.sunspec.gradle

class ModelFile(val modelClassName: String) {
    var comment: String = ""
    val imports = ImportsSection()
    val modelClass = ModelClass(modelClassName)
    var pkg: String = ""

    fun comment(c: String) {
        comment = c.trim()
    }

    fun modelPackage(p: String) {
        pkg = p
    }

    fun imports(init: ImportsSection.() -> Unit) {
        imports.init()
    }

    fun modelClass(init: ModelClass.() -> Unit) {
        modelClass.init()
    }

    fun render(): StringBuilder {
        var builder = StringBuilder()
        if (comment.isNotEmpty()) {
            builder.append("/* \n")
            comment.lines().forEach { builder.append(" * ").append(it.trim()).append('\n') }
            builder.append(" */\n")
        }
        if (pkg.isNotEmpty()) {
            builder.append("package ").append(pkg).append("\n\n")
        }
        imports.render(builder)
        modelClass.render(builder)

        return builder
    }

    companion object Builder {
        fun build(name: String, init: ModelFile.() -> Unit): ModelFile {
            val modelFile = ModelFile(name)
            modelFile.init()
            return modelFile
        }
    }
}

class ModelClass(val modelClassName: String) {
    val vars = arrayListOf<SunSpecPoint>()
    var comp = Companion(modelClassName)

    fun addVar(v: SunSpecPoint) = vars.add(v)

    fun companion(init: Companion.() -> Unit) {
        comp?.init()
    }

    fun render(builder: StringBuilder) {
        builder.append("data class ${modelClassName} (\n");

        val offset = 0
        vars.forEachIndexed { i: Int, v: SunSpecPoint ->
            val ktDef = SunSpecTypedef.get(v.type)
            if (ktDef == null) {
                builder.append("    /* no mapping for type ${v.type} */\n\n")
            } else {

                val ktTypeName = ktDef.kotlinType.simpleName

                val description = v.desc?.replace('\"', '\'')
                builder.append("    @SunSpecPoint(id=\"${v.name}\", ")
                        .append("label=\"${v.label}\", ")
                        .append("offset=${offset}, ")
                        .append("len=${v.size}, ")
                        .append("description=\"${description}\")")
                        .append("\n")

                builder.append("    var ${v.name} : ${ktTypeName}")
                builder.append(if (i == vars.lastIndex) "\n\n" else ",\n\n")
            }
        }

        builder.append(") {\n");
        comp.render(builder); /* render the company object (factory) */
        builder.append("}\n");


    }
}

class ImportsSection {

    val imports = arrayListOf<String>()

    fun add(s: String) {
        imports.add(s)
    }

    fun render(builder: StringBuilder) {
        imports.forEach {
            builder.append("import ").append(it).append("\n")
        }
        if (imports.isNotEmpty()) {
            builder.append('\n')
        }
    }
}


class Companion(val modelClassName: String) {
    val vars = arrayListOf<SunSpecPoint>()
    fun addVar(v: SunSpecPoint) = vars.add(v)

    fun render(builder: StringBuilder) {
        if (vars.isNotEmpty()) {
            builder.append("    companion object {\n")
                    .append("        fun parse(bytes: ByteArray) : ${modelClassName} {\n")
                    .append("            SunSpecByteBuffer(bytes).apply {\n")
                    .append("                return ${modelClassName}(\n")

            var offset = 0
            vars.forEach { v ->
                val t = SunSpecTypedef.get(v.type)
                if (t != null) {
                    builder.append("                ")

                    if (v.size > 0) {
                        builder.append("${v.name} = { val size=${v.size}; ${t.initString} }(),")

                    } else {
                        builder.append("${v.name} = ${t.initString},")
                    }

                    builder.append("\n")
                    offset = offset + v.size
                }
            }
            builder.append("                )\n")
            builder.append("            }\n")
            builder.append("        }\n")
            builder.append("    }\n")
        }
    }
}



