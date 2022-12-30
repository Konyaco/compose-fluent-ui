package generator

import org.jsoup.Jsoup

fun main() {
    val html = baseDir.resolve("icons.html").readText()
    val document = Jsoup.parse(html)
    val outputDir = baseDir.resolve("icon_output").also { it.mkdirs() }
    document.select(".root_dd5b789c li").forEach {
        val svg = it.select("span")[0]!!.html().replace("viewbox=", "viewBox=")
        val name = it.select("span")[1]!!.text()
        println(name)
        outputDir.resolve("$name.svg").writeText(svg)
    }
}