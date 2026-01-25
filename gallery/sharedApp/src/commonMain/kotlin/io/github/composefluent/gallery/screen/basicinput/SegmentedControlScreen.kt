package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.composefluent.component.Icon
import io.github.composefluent.component.SegmentedButton
import io.github.composefluent.component.SegmentedControl
import io.github.composefluent.component.SegmentedItemPosition
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.Circle
import io.github.composefluent.source.generated.FluentSourceFile

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