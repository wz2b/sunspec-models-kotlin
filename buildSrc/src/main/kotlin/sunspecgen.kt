package edu.rit.gis.sunspec.gradle

import kotlinx.dom.asElementList
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory


fun Node.getAttributeAsString(name: String): String? {
    val attr = attributes.getNamedItem(name)
    if (attr != null) {
        return attr.nodeValue
    } else {
        return null
    }
}


class SunSpecKotlinEmitter {
    val file: File
    val builder = StringBuilder()
    val xpath = XPathFactory.newInstance().newXPath()
    val doc: Document
    val pkg: String
    val importAnnotations: String

    constructor(file: File, pkg: String, importPkg: String) {
        this.file = file
        this.pkg = pkg
        this.importAnnotations = importPkg
        doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file)
        doc.documentElement.normalize()
    }


    fun parse(): SunSpecKotlinEmitter {
        /*
         * Per schema, only one model allowed per document
         */
        val model = xpath.evaluate("/sunSpecModels/model", doc, XPathConstants.NODE) as Node
        val modelId = model.getAttributeAsString("id")?.toInt()
        val len = model.getAttributeAsString("len")?.toInt()
        val modelName = model.getAttributeAsString("name") ?: "model_${modelId}"


        val modelLabel = xpath.evaluate("/sunSpecModels/strings/model/label", model, XPathConstants.STRING) as String
        val modelDescr =
            xpath.evaluate("/sunSpecModels/strings/model/description", model, XPathConstants.STRING) as String?
        val modelNotes =
            xpath.evaluate("/sunSpecModels/strings/model/notes", model, XPathConstants.STRING) as String?

        builder.append("/*\n")
        if (modelLabel != null) builder.append(" * $modelLabel\n")
        if (modelDescr != null) builder.append(" *\n * $modelDescr\n")
        if (modelNotes != null) builder.append(" *\n * $modelNotes\n")
        builder.append(" */\n")


        /*
         * Add the package name, if provided
         */
        if((pkg != null) and (pkg.length > 0)) {
            builder.append("package $pkg\n")
        }

        /*
         * Add an import line for the annotations, if provided
         */
        if((importAnnotations != null) and (importAnnotations.length > 0)) {
            builder.append("\nimport $importAnnotations\n")
        }

        builder.append("\n@SunSpecModel(id=${modelId}, len=${len}, name=\"${modelName}\")\n")
        builder.append("class Model_$modelId {\n")


        (xpath.evaluate("block", model, XPathConstants.NODESET) as NodeList)
            .asElementList().forEach(::parseBlock)

        builder.append("}\n")
        return this
    }

    fun parseBlock(block: Node) {
        val type = block.getAttributeAsString("type") ?: "fixed"

        when (type) {
            "fixed" -> {
                (xpath.evaluate("point", block, XPathConstants.NODESET) as NodeList)
                    .asElementList().forEach(::parsePoint)
            }
            "repeating" -> {
            }
        }
    }


    fun parsePoint(point: Node) {
        val id = point.getAttributeAsString("id")
        val offset = point.getAttributeAsString("offset")?.toInt()
        val type = point.getAttributeAsString("type") ?: ""
        val len = point.getAttributeAsString("len")?.toInt() ?: inferLength(type)

        /* Try to find a label for this field */
        val pointLabel =
            xpath.evaluate("/sunSpecModels/strings/point[@id='$id']/label", doc, XPathConstants.STRING) as String? ?: id
        val pointDescription =
            xpath.evaluate("/sunSpecModels/strings/point[@id='$id']/description", doc, XPathConstants.STRING) as String?
                ?: pointLabel
        val pointNotes =
            xpath.evaluate("/sunSpecModels/strings/point[@id='$id']/description", doc, XPathConstants.STRING) as String?

        builder.append(
            """   @SunSpecPoint(id="$id", label="$pointLabel", offset=$offset, len=$len, type="$type",
                 description="${pointDescription?.replace('\"', '\'')}",
                 notes="${pointNotes?.replace('\"', '\'')}")
            """
        ).trimToSize()

        /*
         * Many of these should actually be unsigned but because Kotlin's UShort, etc. classes
         * are inline that breaks reflection, so use Ints here for those
         */
        val kt = when (type) {
            "int16" -> Short::class
            "uint16" -> Int::class
            "count" -> Int::class
            "acc16" -> Int::class
            "string" -> String::class
            "int32" -> Int::class
            "uint32" -> Int::class
            "float32" -> Float::class
            "acc32" -> Long::class
            "int64" -> Long::class
            "uint64" -> Long::class
            "float64" -> Double::class
            "bitfield16" -> Short::class
            "bitfield32" -> Int::class
            "sunssf" -> Any::class
            "pad" -> Any::class
            "ipaddr" -> String::class
            "ipv6addr" -> String::class
            "eui48" -> ByteArray::class
            else -> Any::class
        }


        builder.append("\n   var $id: ${kt.simpleName}? = null\n\n")
    }

    fun emit(): String {
        return builder.toString()
    }

    fun inferLength(type: String): Int {
        return when (type) {
            "int16" -> 1
            "uint16" -> 1
            "count" -> 1
            "acc16" -> 1
            "string" -> 0
            "int32" -> 2
            "uint32" -> 2
            "float32" -> 2
            "acc32" -> 2
            "int64" -> 4
            "uint64" -> 4
            "float64" -> 4
            "bitfield16" -> 1
            "bitfield32" -> 2
            "sunssf" -> 1
            "pad" -> 1
            "ipaddr" -> 2
            "ipv6addr" -> 8
            "eui48" -> 3
            else -> 0
        }
    }

}