@file:OptIn(ExperimentalFluentApi::class)

package com.konyaco.fluent.gallery.screen.styles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.UrlAnnotation
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withAnnotation
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.background.Acrylic
import com.konyaco.fluent.background.AcrylicContainer
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@OptIn(ExperimentalTextApi::class)
@Component(
    index = 3,
    description = "A translucent material recommended for panel backgrounds.",
)
@Composable
fun AcrylicContainerScreen() {
    val linkTextColor = FluentTheme.colors.text.accent.primary
    GalleryPage(
        title = AnnotatedString("AcrylicContainer"),
        description = buildAnnotatedString {
            append("A translucent material recommended for panel backgrounds. ")
            append("supported by ")
            withAnnotation(UrlAnnotation("https://github.com/chrisbanes/haze")) {
                append(AnnotatedString("haze", spanStyle = SpanStyle(color = linkTextColor)))
            }
            append(".")
        },
        componentPath = FluentSourceFile.Acrylic,
        galleryPath = ComponentPagePath.AcrylicContainerScreen
    ) {
        Section(
            title = "A Basic Acrylic sample",
            sourceCode = sourceCodeOfBasicAcrylicSample,
            content = { BasicAcrylicSample() }
        )
    }
}

@Sample
@Composable
private fun BasicAcrylicSample() {
    AcrylicContainer {
        Box(modifier = Modifier.defaultMinSize(minWidth = 360.dp).height(250.dp).behindAcrylic()) {
            Box(Modifier.align(Alignment.TopStart).size(100.dp, 200.dp).background(Color.Cyan))
            Box(
                Modifier.align(Alignment.Center).size(152.dp)
                    .background(Color.Magenta, shape = CircleShape)
            )
            Box(Modifier.align(Alignment.BottomEnd).size(80.dp, 100.dp).background(Color.Yellow))
        }
        Acrylic(modifier = Modifier.align(Alignment.Center)) {
            Box(Modifier.width(336.dp).height(226.dp))
        }
    }
}