package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.Slider
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection
import com.konyaco.fluent.gallery.component.TodoComponent

@Composable
fun SliderScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "Slider",
            "Use a Slider when you want your users to be able to set defined, contiguous values (such as volume or brightness) or a range of discrete values (such as screen resolution settings)."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                Modifier.fillMaxWidth(), "A simple Slider.",
                """
                    var value by remember { mutableStateOf(0f) }
                    Slider(value, { value = it })
                """.trimIndent()
            ) {
                var value by remember { mutableStateOf(0f) }
                Slider(modifier = Modifier.width(200.dp), value = value, onValueChange = { value = it })
            }
            Spacer(Modifier.height(32.dp))
            GallerySection(
                Modifier.fillMaxWidth(), "A Slider with range and steps specified.", ""
            ) {
                TodoComponent()
            }
            Spacer(Modifier.height(32.dp))
            GallerySection(
                Modifier.fillMaxWidth(), "A Slider with tick marks.", ""
            ) {
                TodoComponent()
            }
            Spacer(Modifier.height(32.dp))
            GallerySection(
                Modifier.fillMaxWidth(), "A vertical slider with range and tick marks specified.", ""
            ) {
                TodoComponent()
            }
        }
    }
}