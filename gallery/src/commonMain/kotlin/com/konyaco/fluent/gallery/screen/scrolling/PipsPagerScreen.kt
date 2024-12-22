package com.konyaco.fluent.gallery.screen.scrolling

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.DropDownButton
import com.konyaco.fluent.component.HorizontalFlipView
import com.konyaco.fluent.component.HorizontalPipsPager
import com.konyaco.fluent.component.MenuFlyoutContainer
import com.konyaco.fluent.component.MenuFlyoutItem
import com.konyaco.fluent.component.PageButtonVisibleStrategy
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.VerticalPipsPager
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.gallery.screen.collections.randomBrushItems
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(description = "A control to let the user navigate through a paginated collection when the page numbers do not need to be visually known.")
@Composable
fun PipsPagerScreen() {
    GalleryPage(
        title = "PipsPager",
        description = "A PipsPager allows the user to navigate through a paginated collection and is independent of the content shown. " +
                "Use this control when the content in the layout is not explicitly ordered by relevancy or you desire a glyph-based representation of numbered pages. " +
                "PipsPagers are commonly used in photo viewers, app lists, carousels, and when display space is limited.",
        componentPath = FluentSourceFile.PipsPager,
        galleryPath = ComponentPagePath.PipsPagerScreen
    ) {
        Section(
            title = "PipsPager integrated with FlipView sample",
            sourceCode = sourceCodeOfPipsPagerIntegratedWithFlipViewSample,
            content = { PipsPagerIntegratedWithFlipViewSample() }
        )

        var isVertical = remember { mutableStateOf(false) }
        var pageButtonVisibleStrategy = remember { mutableStateOf(PageButtonVisibleStrategy.Never) }
        Section(
            title = "PipsPager with options",
            sourceCode = sourceCodeOfPipsPagerWithOptions,
            content = {
                PipsPagerWithOptions(
                    isVertical = isVertical.value,
                    pageButtonVisibleStrategy = pageButtonVisibleStrategy.value
                )
            },
            options = {
                Text("Orientation")
                MenuFlyoutContainer(
                    flyout = {
                        MenuFlyoutItem(
                            selected = isVertical.value,
                            onSelectedChanged = {
                                isVertical.value = true
                                isFlyoutVisible = false
                            },
                            text = { Text("Vertical") },
                        )
                        MenuFlyoutItem(
                            selected = !isVertical.value,
                            onSelectedChanged = {
                                isVertical.value = false
                                isFlyoutVisible = false
                            },
                            text = { Text("Horizontal") }
                        )
                    },
                    content = {
                        DropDownButton(
                            onClick = { isFlyoutVisible = true },
                            content = { Text(if (isVertical.value) "Vertical" else "Horizontal") }
                        )
                    }
                )
                Text("Page button visibility")
                MenuFlyoutContainer(
                    flyout = {
                        PageButtonVisibleStrategy.entries.forEach { item ->
                            MenuFlyoutItem(
                                selected = pageButtonVisibleStrategy.value == item,
                                onSelectedChanged = {
                                    pageButtonVisibleStrategy.value = item
                                    isFlyoutVisible = false
                                },
                                text = { Text(item.name) }
                            )
                        }
                    },
                    content = {
                        DropDownButton(
                            onClick = { isFlyoutVisible = true },
                            content = { Text(pageButtonVisibleStrategy.value.name) }
                        )
                    }
                )
            }
        )
    }
}

@Sample
@Composable
private fun PipsPagerIntegratedWithFlipViewSample() {
    val items = randomBrushItems()
    val pagerState = rememberPagerState { items.size }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalFlipView(
            state = pagerState,
            modifier = Modifier
                .widthIn(max = 400.dp)
                .height(180.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize().background(items[it]))
        }
        HorizontalPipsPager(state = pagerState)
    }
}

@Sample
@Composable
private fun PipsPagerWithOptions(
    isVertical: Boolean,
    pageButtonVisibleStrategy: PageButtonVisibleStrategy
) {
    val count = 7
    var selectedIndex by remember { mutableIntStateOf(0) }
    if (isVertical) {
        VerticalPipsPager(
            selectedIndex = selectedIndex,
            onSelectedIndexChange = { selectedIndex = it },
            count = count,
            pageButtonVisibleStrategy = pageButtonVisibleStrategy
        )
    } else {
        HorizontalPipsPager(
            selectedIndex = selectedIndex,
            onSelectedIndexChange = { selectedIndex = it },
            count = count,
            pageButtonVisibleStrategy = pageButtonVisibleStrategy
        )
    }
}