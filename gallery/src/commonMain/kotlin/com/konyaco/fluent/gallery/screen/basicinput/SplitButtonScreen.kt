package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.*
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryPage

@Component(index = 5, description = "A two-part button that displays a flyout when its secondary part is clicked.")
@Composable
fun SplitButtonScreen() {
    GalleryPage(
        title = "SplitButton",
        description = "The SplitButton is a dropdown button, but with an addition execution hit target."
    ) {
        Section(
            title = "A SplitButton controlling text color in a RichEditBox",
            sourceCode = sourceCodeOfBasicSplitButtonSample
        ) {
            BasicSplitButtonSample()
        }
        Section(
            title = "A SplitButton with text",
            sourceCode = sourceCodeOfSplitButtonWithTextSample
        ) {
            SplitButtonWithTextSample()
        }
    }
}

@Sample
@Composable
private fun BasicSplitButtonSample() {
    var currentColor by remember { mutableStateOf(colors.first()) }
    FlyoutContainer(
        flyout = {
            ColorList {
                currentColor = it
                isFlyoutVisible = false
            }
        },
        adaptivePlacement = true,
        placement = FlyoutPlacement.Bottom
    ) {
        SplitButton(
            flyoutClick = { isFlyoutVisible = true },
            onClick = {}
        ) {
            Box(modifier = Modifier.size(32.dp).background(currentColor))
        }
    }
}

@Sample
@Composable
private fun SplitButtonWithTextSample() {
    var currentColor by remember { mutableStateOf(colors.first()) }
    FlyoutContainer(
        flyout = {
            ColorList {
                currentColor = it
                isFlyoutVisible = false
            }
        },
        adaptivePlacement = true,
        placement = FlyoutPlacement.Bottom
    ) {
        SplitButton(
            flyoutClick = { isFlyoutVisible = true },
            onClick = {}
        ) {
            Text("Choose color", modifier = Modifier.padding(horizontal = 2.dp))
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ColorList(
    onColorSelected: (color: Color) -> Unit
) {
    FlowRow(
        maxItemsInEachRow = 3,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        colors.forEach {
            SubtleButton(
                onClick = {
                    onColorSelected(it)
                },
                iconOnly = true
            ) {
                Box(modifier = Modifier.size(32.dp).background(it, RoundedCornerShape(2.dp)))
            }
        }
    }
}

private val colors = listOf(Color.Red, Color.Blue, Color.Cyan, Color.Magenta, Color.Yellow, Color.Green, Color.Gray)