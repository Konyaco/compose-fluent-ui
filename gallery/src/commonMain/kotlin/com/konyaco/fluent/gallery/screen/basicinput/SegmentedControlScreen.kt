package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.SegmentedButton
import com.konyaco.fluent.component.SegmentedControl
import com.konyaco.fluent.component.SegmentedItemPosition
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Circle
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(index = 15, description = "A common Ul control to configure a view or setting.")
@Composable
fun SegmentedControlScreen() {
    GalleryPage(
        title = "SegmentedControl",
        description = "A common Ul control to configure a view or setting.",
        componentPath = FluentSourceFile.SegmentedControl,
        galleryPath = ComponentPagePath.SegmentedControlScreen
    ) {
        Section(
            title = "SegmentedControl",
            sourceCode = sourceCodeOfSegmentedControlSample,
            content = { SegmentedControlSample() }
        )
        Section(
            title = "SegmentedControl with Icon",
            sourceCode = sourceCodeOfSegmentedControlWithIconSample,
            content = { SegmentedControlWithIconSample() }
        )
        Section(
            title = "SegmentedControl Icon Only",
            sourceCode = sourceCodeOfSegmentedControlIconOnlySample,
            content = { SegmentedControlIconOnlySample() }
        )
    }
}

@Sample
@Composable
private fun SegmentedControlSample() {
    val checkedIndex = remember { mutableStateOf(0) }
    SegmentedControl {
        repeat(count) { index ->
            SegmentedButton(
                checked = index == checkedIndex.value,
                onCheckedChanged = { checkedIndex.value = index },
                position = when (index) {
                    0 -> SegmentedItemPosition.Start
                    count - 1 -> SegmentedItemPosition.End
                    else -> SegmentedItemPosition.Center
                },
                text = { Text("Text") }
            )
        }
    }
}

@Sample
@Composable
private fun SegmentedControlWithIconSample() {
    val checkedIndex = remember { mutableStateOf(0) }
    SegmentedControl {
        repeat(count) { index ->
            SegmentedButton(
                checked = index == checkedIndex.value,
                onCheckedChanged = { checkedIndex.value = index },
                position = when (index) {
                    0 -> SegmentedItemPosition.Start
                    count - 1 -> SegmentedItemPosition.End
                    else -> SegmentedItemPosition.Center
                },
                text = { Text("Text") },
                icon = { Icon(Icons.Default.Circle, null) }
            )
        }
    }
}

@Sample
@Composable
private fun SegmentedControlIconOnlySample() {
    val checkedIndex = remember { mutableStateOf(0) }
    SegmentedControl {
        repeat(count) { index ->
            SegmentedButton(
                checked = index == checkedIndex.value,
                onCheckedChanged = { checkedIndex.value = index },
                position = when (index) {
                    0 -> SegmentedItemPosition.Start
                    count - 1 -> SegmentedItemPosition.End
                    else -> SegmentedItemPosition.Center
                },
                icon = { Icon(Icons.Default.Circle, null) }
            )
        }
    }
}

private const val count = 5