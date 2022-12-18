import svgtoxml.Svg2Vector
import java.io.File

fun main() {
    val outDir = File("fluent-icon-converter/icon_output_xml").also { it.mkdirs() }
    File("fluent-icon-converter/icon_output").listFiles()!!.forEach {
        println(it.name)
        Svg2Vector.parseSvgToXml(
            it,
            outDir.resolve(it.nameWithoutExtension + ".xml").outputStream()
        )
    }
}