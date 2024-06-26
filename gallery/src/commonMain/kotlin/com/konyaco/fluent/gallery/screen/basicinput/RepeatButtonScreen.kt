package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.CheckBox
import com.konyaco.fluent.component.RepeatButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(index = 3, description = "A button that raises its Click event repeatedly from the time it's pressed until it's released.")
@Composable
fun RepeatButtonScreen() {
    GalleryPage(
        title = "RepeatButton",
        description = "The RepeatButton control is like a standard Button, except that the Click event occurs continuously while the user presses the RepeatButton.",
        componentPath = FluentSourceFile.Button,
        galleryPath = ComponentPagePath.RepeatButtonScreen
    ) {
        val enabled = remember { mutableStateOf(true) }
        Section(
            title = "A simple RepeatButton with text content.",
            sourceCode = sourceCodeOfBasicRepeatButtonSample,
            content = { BasicRepeatButtonSample(enabled.value) },
            options = {
                CheckBox(
                    checked = !enabled.value,
                    onCheckStateChange = { enabled.value = !it },
                    label = "Disable repeat button"
                )
            }
        )
    }
}

@Sample
@Composable
private fun BasicRepeatButtonSample(enabled: Boolean) {
    val clickCount = remember { mutableIntStateOf(0) }
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        RepeatButton(onClick = { clickCount.value += 1 }, disabled = !enabled) {
            Text("Click and hold")
        }
        Text("Number of clicks: ${clickCount.value}")
    }

}