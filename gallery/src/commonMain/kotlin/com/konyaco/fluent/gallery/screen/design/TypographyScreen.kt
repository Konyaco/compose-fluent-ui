@file:OptIn(ExperimentalTextApi::class)

package com.konyaco.fluent.gallery.screen.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
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
import com.konyaco.fluent.source.generated.FluentSourceFile

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
        HeaderItemRow()
        typographyList().forEachIndexed { index, (name, style) ->
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
                    val content = when (style) {
                        FluentTheme.typography.caption -> "FluentTheme.typography.caption"
                        FluentTheme.typography.body -> "FluentTheme.typography.body"
                        FluentTheme.typography.bodyStrong -> "FluentTheme.typography.bodyStrong"
                        FluentTheme.typography.subtitle -> "FluentTheme.typography.subtitle"
                        FluentTheme.typography.title -> "FluentTheme.typography.title"
                        FluentTheme.typography.titleLarge -> "FluentTheme.typography.titleLarge"
                        FluentTheme.typography.display -> "FluentTheme.typography.display"
                        else -> ""
                    }
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

@Composable
private fun ItemRow(
    text: @Composable () -> Unit,
    secondary: @Composable () -> Unit,
    third: @Composable () -> Unit,
    fourth: @Composable () -> Unit,
    index: Int,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth().heightIn(68.dp).then(
            if (index.mod(2) == 1) {
                Modifier.background(
                    FluentTheme.colors.background.card.default,
                    shape = FluentTheme.shapes.control
                )
            } else {
                Modifier
            }
        )
    ) {
        Box(modifier = Modifier.width(272.dp).padding(horizontal = 16.dp, vertical = 16.dp)) {
            text()
        }
        Box(modifier = Modifier.width(136.dp)) {
            secondary()
        }
        Box(modifier = Modifier.width(112.dp)) {
            third()
        }
        fourth()
    }
}

@Composable
private fun HeaderItemRow() {
    val headerStyle =
        FluentTheme.typography.caption.copy(color = FluentTheme.colors.text.text.secondary)
    ItemRow(
        text = {
            Text("Example", style = headerStyle)
        },
        secondary = {
            Text("Variable Font", style = headerStyle)
        },
        third = {
            Text("Size/Line height", style = headerStyle)
        },
        fourth = {
            Text("Style", style = headerStyle)
        },
        index = 0
    )
}

@Stable
@Composable
private fun typographyList(): List<Pair<String, TextStyle>> {
    return listOf(
        "Caption" to FluentTheme.typography.caption,
        "Body" to FluentTheme.typography.body,
        "Body Strong" to FluentTheme.typography.bodyStrong,
        "Subtitle" to FluentTheme.typography.subtitle,
        "Title" to FluentTheme.typography.title,
        "Title Large" to FluentTheme.typography.titleLarge,
        "Display" to FluentTheme.typography.display
    )
}