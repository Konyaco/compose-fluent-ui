package generator

import androidx.compose.material.icons.generator.CoreIcons
import androidx.compose.material.icons.generator.IconProcessor
import androidx.compose.material.icons.generator.IconWriter

fun main() {
    val icons = IconProcessor(
        listOf(baseDir.resolve("icon_output_xml/filled"), baseDir.resolve("icon_output_xml/regular")),
        baseDir.resolve("expApis.txt"),
        baseDir.resolve("genApis.txt"),
        false
    ).process()
    val outDir = baseDir.resolve("icon_output_kt_core").also {
        it.mkdirs()
    }
    IconWriter(icons).generateTo(outDir) { it in CoreIcons }

    val extendedDir = baseDir.resolve("icon_output_kt_extended").also {
        it.mkdirs()
    }
    IconWriter(icons).generateTo(extendedDir) { it !in CoreIcons }
}