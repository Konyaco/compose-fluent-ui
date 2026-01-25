package io.github.composefluent.gallery.screen.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.github.composefluent.component.Icon
import io.github.composefluent.component.SelectorBar
import io.github.composefluent.component.SelectorBarItem
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.History
import io.github.composefluent.icons.regular.Share
import io.github.composefluent.icons.regular.Star
import io.github.composefluent.source.generated.FluentSourceFile

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