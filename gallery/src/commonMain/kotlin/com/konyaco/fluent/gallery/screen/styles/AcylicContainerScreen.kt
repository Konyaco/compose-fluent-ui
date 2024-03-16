@file:OptIn(ExperimentalFluentApi::class)

package com.konyaco.fluent.gallery.screen.styles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.background.Acrylic
import com.konyaco.fluent.background.AcrylicContainer
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection

@OptIn(ExperimentalTextApi::class)
@Component(
    index = 3,
    description = "A translucent material recommended for panel backgrounds.",
)
@Composable
fun AcrylicContainerScreen() {
    Column(Modifier.fillMaxSize()) {
        val linkTextColor = FluentTheme.colors.text.accent.primary
        GalleryHeader(
            AnnotatedString("AcrylicContainer"),
            buildAnnotatedString {
                append("A translucent material recommended for panel backgrounds. ")
                append("supported by ")
                withAnnotation(UrlAnnotation("https://github.com/chrisbanes/haze")) {
                    append(AnnotatedString("haze", spanStyle = SpanStyle(color = linkTextColor)))
                }
                append(".")
            }
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A Basic Acrylic sample",
                sourceCode = sourceCodeOfBasicAcrylicSample
            ) {
                BasicAcrylicSample()
            }
        }
    }
}

@Sample
@Composable
private fun BasicAcrylicSample() {
    AcrylicContainer {
        Box(modifier = Modifier.defaultMinSize(minWidth = 360.dp).height(250.dp).behindAcrylic()) {
            Box(Modifier.align(Alignment.TopStart).size(100.dp, 200.dp).background(Color.Cyan))
            Box(Modifier.align(Alignment.Center).size(152.dp).background(Color.Magenta, shape = CircleShape))
            Box(Modifier.align(Alignment.BottomEnd).size(80.dp, 100.dp).background(Color.Yellow))
        }
        Acrylic(modifier = Modifier.align(Alignment.Center)) {
            Box(Modifier.width(336.dp).height(226.dp))
        }
    }
}