package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.RepeatButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryPage

@Component(index = 3, description = "A button that raises its Click event repeatedly from the time it's pressed until it's released.")
@Composable
fun RepeatButtonScreen() {
    GalleryPage(
        title = "RepeatButton",
        description = "The RepeatButton control is like a standard Button, except that the Click event occurs continuously while the user presses the RepeatButton."
    ) {
        Section(
            title = "A simple RepeatButton with text content.",
            sourceCode = sourceCodeOfBasicRepeatButtonSample
        ) {
            BasicRepeatButtonSample()
        }
    }
}

@Sample
@Composable
private fun BasicRepeatButtonSample() {
    val clickCount = remember { mutableIntStateOf(0) }
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        RepeatButton(onClick = { clickCount.value += 1 }) {
            Text("Click and hold")
        }
        Text("Number of clicks: ${clickCount.value}")
    }

}