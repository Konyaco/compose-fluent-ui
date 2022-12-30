package generator

import svgtoxml.Svg2Vector

fun main() {
    val outDir = baseDir.resolve("icon_output_xml").also { it.mkdirs() }
    val filled = outDir.resolve("filled").also { it.mkdirs() }
    val regular = outDir.resolve("regular").also { it.mkdirs() }

    val error = mutableListOf<String>()

    baseDir.resolve("icon_output").listFiles()!!.forEach { file ->
        val filename = file.nameWithoutExtension
        val theme = when {
            filename.endsWith("Regular") -> "regular"
            filename.endsWith("Filled") -> "filled"
            else -> error("Unknown theme")
        }
        val outputDir = when (theme) {
            "regular" -> regular
            "filled" -> filled
            else -> regular
        }

        val size =
            filename.substring(filename.length - theme.length - 2, filename.length - theme.length)
        val iconName = filename.substringBeforeLast(size)

        println(iconName)
        val outputFile = outputDir.resolve("$iconName.xml")
        outputFile.outputStream().use { stream ->
            Svg2Vector.parseSvgToXml(file, stream)
        }
        if (outputFile.length() == 0L) {
            error.add(filename)
            System.err.println("Error: $filename")
            outputFile.delete()
        }
    }

    error.forEach {
        println("Error: $it")
    }
}