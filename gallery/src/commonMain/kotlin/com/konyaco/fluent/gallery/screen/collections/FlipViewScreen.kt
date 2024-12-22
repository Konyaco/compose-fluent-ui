package com.konyaco.fluent.gallery.screen.collections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.HorizontalFlipView
import com.konyaco.fluent.component.VerticalFlipView
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(description = "Presents a collection of items that the user can flip through, one item at a time.")
@Composable
fun FlipViewScreen() {
    GalleryPage(
        title = "FlipView",
        description = "The FlipView lets you flip through a collection of items, one at a time. " +
                "It's great for displaying images from a gallery, pages of a magazine, or similar items.",
        componentPath = FluentSourceFile.FlipView,
        galleryPath = ComponentPagePath.FlipViewScreen
    ) {
        Section(
            title = "HorizontalFlipView sample",
            sourceCode = sourceCodeOfHorizontalFlipViewSample,
            content = { HorizontalFlipViewSample() }
        )

        Section(
            title = "VerticalFlipView sample",
            sourceCode = sourceCodeOfVerticalFlipViewSample,
            content = { VerticalFlipViewSample() }
        )
    }
}

@Sample
@Composable
private fun HorizontalFlipViewSample() {
    val items = randomBrushItems()
    HorizontalFlipView(
        state = rememberPagerState { items.size },
        modifier = Modifier
            .widthIn(max = 400.dp)
            .height(180.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize().background(items[it]))
    }
}

@Sample
@Composable
private fun VerticalFlipViewSample() {
    val items = randomBrushItems()
    VerticalFlipView(
        state = rememberPagerState { items.size },
        modifier = Modifier
            .widthIn(max = 400.dp)
            .height(180.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize().background(items[it]))
    }
}