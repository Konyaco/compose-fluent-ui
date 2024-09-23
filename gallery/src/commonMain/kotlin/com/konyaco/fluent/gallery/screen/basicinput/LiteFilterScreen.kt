package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.konyaco.fluent.component.LiteFilter
import com.konyaco.fluent.component.PillButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

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