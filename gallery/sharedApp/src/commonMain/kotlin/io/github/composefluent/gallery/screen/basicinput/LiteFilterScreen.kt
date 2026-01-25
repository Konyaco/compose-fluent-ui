package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.composefluent.component.LiteFilter
import io.github.composefluent.component.PillButton
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(index = 17, description = "An filter container for displaying a list of items.")
@Composable
fun LiteFilterScreen() {
    GalleryPage(
        title = "LiteFilter",
        description = "An filter container for displaying a list of items.",
        componentPath = FluentSourceFile.LiteFilter,
        galleryPath = ComponentPagePath.LiteFilterScreen
    ) {
        Section(
            title = "LiteFilter",
            sourceCode = sourceCodeOfLiteFilterSample,
            content = { LiteFilterSample() }
        )
    }
}

@Sample
@Composable
private fun LiteFilterSample() {
    val selectedItem = remember { mutableStateOf("") }
    LiteFilter {
        items().forEach { name ->
            PillButton(
                selected = selectedItem.value == name,
                onSelectedChanged = {
                    if (selectedItem.value != name) {
                        selectedItem.value = name
                    } else {
                        selectedItem.value = ""
                    }
                },
            ) {
                Text(name)
            }
        }
    }
}

@Stable
private fun items() = listOf(
    "All",
    "Apps",
    "Documents",
    "Web",
    "People",
    "IMG",
    "JPG",
    "OneDrive",
    "SkyDrive",
    "Pictures",
    "Songs",
    "Videos",
)