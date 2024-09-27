@file:OptIn(ExperimentalTextApi::class)

package com.konyaco.fluent.gallery.screen.design

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.UrlAnnotation
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withAnnotation
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.CopyButton
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.gallery.component.HeaderItemRow
import com.konyaco.fluent.gallery.component.ItemRow
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(index = 1, icon = "TextFont", iconGlyph = '\uE8D2')
@OptIn(ExperimentalTextApi::class)
@Component(index = 1, icon = "TextFont")
@Composable
fun TypographyScreen() {
    val linkTextColor = FluentTheme.colors.text.accent.primary
    GalleryPage(
        title = AnnotatedString("Typography"),
        description = buildAnnotatedString {
            append("Type helps provide structure and hierarchy to UI. ")
            append("The default font for Windows is ")
            withAnnotation(UrlAnnotation("https://learn.microsoft.com/zh-cn/windows/apps/design/downloads/#fonts")) {
                append(
                    AnnotatedString(
                        "Segoe UI Variable",
                        spanStyle = SpanStyle(
                            color = linkTextColor,
                            textDecoration = TextDecoration.Underline
                        )
                    )
                )
            }
            append(". ")
            append("Best practice is to use Regular weight for most text, use Semibold for titles. ")
            append("The minimum values should be 12px Regular, 14px Semibold.")
        },
        componentPath = FluentSourceFile.Typography,
        galleryPath = ComponentPagePath.TypographyScreen
    ) {
        Section(
            title = "Type ramp",
            sourceCode = sourceCodeOfBasicTypographySample,
            content = {
                TypographySample()
            }
        )
    }
}

@Sample
@Composable
private fun BasicTypographySample() {
    Column {
        Text("Caption", style = FluentTheme.typography.caption)
        Text("Body", style = FluentTheme.typography.body)
        Text("Body Strong", style = FluentTheme.typography.bodyStrong)
        Text("Subtitle", style = FluentTheme.typography.subtitle)
        Text("Title", style = FluentTheme.typography.title)
        Text("Title Large", style = FluentTheme.typography.titleLarge)
        Text("Display", style = FluentTheme.typography.display)
    }
}

@Composable
private fun TypographySample() {
    Column {
        HeaderItemRow(
            text = "Example",
            secondary = "Variable Font",
            third = "Size/Line height",
            fourth = "Style"
        )
        typographyList().forEachIndexed { index, (name, property, style) ->
            ItemRow(
                text = { Text(text = name, style = style) },
                secondary = {
                    Text(
                        text = when (style.fontWeight) {
                            FontWeight.Normal -> "Regular"
                            FontWeight.SemiBold -> "Semibold"
                            else -> ""
                        },
                        style = FluentTheme.typography.caption
                    )
                },
                third = {
                    Text(
                        text = "${style.fontSize.value.toInt()}/${style.lineHeight.value.toInt()} sp",
                        style = FluentTheme.typography.caption
                    )
                },
                fourth = {
                    val content = "FluentTheme.typography.$property"
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = content,
                            modifier = Modifier.width(240.dp)
                        )
                        CopyButton(content)
                    }
                },
                index = index + 1
            )
        }
    }
}

@Stable
@Composable
private fun typographyList(): List<Triple<String, String, TextStyle>> {
    val typography = FluentTheme.typography
    return listOf(
        Triple("Caption", typography::caption.name, typography.caption),
        Triple("Body", typography::body.name, typography.body),
        Triple("Body Strong", typography::bodyStrong.name, typography.bodyStrong),
        Triple("Subtitle", typography::subtitle.name, typography.subtitle),
        Triple("Title", typography::title.name, typography.title),
        Triple("Title Large", typography::titleLarge.name, typography.titleLarge),
        Triple("Display", typography::display.name, typography.display)
    )
}