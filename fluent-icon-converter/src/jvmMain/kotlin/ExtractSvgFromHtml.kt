import org.jsoup.Jsoup
import java.io.File

fun main() {
    val html = File("fluent-icon-converter/icons.html").readText()
    val document = Jsoup.parse(html)
    val outputDir = File("fluent-icon-converter/icon_output").also {
        it.mkdirs()
    }
    document.select(".root_dd5b789c li").forEach {
        val svg = it.select("span")[0]!!.html().replace("viewbox=", "viewBox=")
        val name = it.select("span")[1]!!.text()
        outputDir.resolve("$name.svg").writeText(svg)
    }
}