package generator

import org.jsoup.Jsoup

fun main() {
    val html = baseDir.resolve("icons-catalog.html").readText()
    val document = Jsoup.parse(html)
    val outputDir = baseDir.resolve("icon_output").also {
        it.mkdirs()
    }
    document.select(".sbdocs-content > div:last-child > div > div").asSequence().map {
        val name = it.select("code")[0]!!.text()
        val svg = it.select("svg")[0].toString()
        name to svg
    }.forEach { (name, svg) ->
        println(svg)
        val converted = svg.replace(Regex("""\sclass="[\s\S]+?""""), "")
            .replace(Regex("""\saria-hidden="true""""), "")
            .replace(" fill=\"currentColor\"", "")
            .replace("viewbox", "viewBox")

        println(converted)
        outputDir.resolve("$name.svg").writeText(converted)
    }
}