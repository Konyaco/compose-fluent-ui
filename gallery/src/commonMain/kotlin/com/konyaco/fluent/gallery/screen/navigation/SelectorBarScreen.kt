package com.konyaco.fluent.gallery.screen.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.SelectorBar
import com.konyaco.fluent.component.SelectorBarItem
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.History
import com.konyaco.fluent.icons.regular.Share
import com.konyaco.fluent.icons.regular.Star
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(description = "Presents information from a small set of different sources. The user can pick one of them.")
@Composable
fun SelectorBarScreen() {
    GalleryPage(
        title = "SelectorBar",
        description = "SelectorBar is used to modify the content shown by allowing users to select and switch between a small, finite set of data.",
        componentPath = FluentSourceFile.SelectorBar,
        galleryPath = ComponentPagePath.SelectorBarScreen
    ) {
        Section(
            title = "Basic SelectorBar sample",
            sourceCode = sourceCodeOfBasicSelectorBarSample,
            content = { BasicSelectorBarSample() }
        )
    }
}

@Sample
@Composable
private fun BasicSelectorBarSample() {
    var selectedIndex by remember { mutableIntStateOf(-1) }
    SelectorBar {
        SelectorBarItem(
            selected = selectedIndex == 0,
            onSelectedChange = { selectedIndex = 0 },
            text = { Text("Recent") },
            icon = { Icon(Icons.Default.History, contentDescription = null) }
        )

        SelectorBarItem(
            selected = selectedIndex == 1,
            onSelectedChange = { selectedIndex = 1 },
            text = { Text("Shared") },
            icon = { Icon(Icons.Default.Share, contentDescription = null) }
        )

        SelectorBarItem(
            selected = selectedIndex == 2,
            onSelectedChange = { selectedIndex = 2 },
            text = { Text("Favorites") },
            icon = { Icon(Icons.Default.Star, contentDescription = null) }
        )
    }
}