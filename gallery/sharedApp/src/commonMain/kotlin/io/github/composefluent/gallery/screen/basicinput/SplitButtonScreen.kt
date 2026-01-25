package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import io.github.composefluent.component.*
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(
    index = 5,
    description = "A two-part button that displays a flyout when its secondary part is clicked."
)
@Composable
fun SplitButtonScreen() {
    GalleryPage(
        title = "SplitButton",
        description = "The SplitButton is a dropdown button, but with an addition execution hit target.",
        componentPath = FluentSourceFile.Button,
        galleryPath = ComponentPagePath.SplitButtonScreen
    ) {
        //TODO TextField keep focus
        val textFieldValue = remember {
            mutableStateOf(
                TextFieldValue(
                    AnnotatedString(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                                " Tempor commodo ullamcorper a lacus.",
                        spanStyle = SpanStyle(color = colors.first())
                    )
                )
            )
        }
        Section(
            title = "A SplitButton controlling text color in a RichEditBox",
            sourceCode = sourceCodeOfBasicSplitButtonSample,
            content = {
                BasicSplitButtonSample {
                    textFieldValue.value = textFieldValue.value.copy(
                        buildAnnotatedString {
                            append(textFieldValue.value.annotatedString)
                            val selection = textFieldValue.value.selection

                            if (!selection.reversed && !selection.collapsed) {
                                addStyle(
                                    style = SpanStyle(color = it),
                                    start = selection.start,
                                    end = selection.length
                                )
                            }
                        }
                    )
                }
            },
            options = {
                val interactionSource = remember { MutableInteractionSource() }
                val isFocused by interactionSource.collectIsFocusedAsState()
                TextField(
                    value = textFieldValue.value,
                    onValueChange = {
                        if (isFocused) {
                            textFieldValue.value = it
                        }
                    },
                    modifier = Modifier.width(200.dp),
                    interactionSource = interactionSource
                )
            }
        )
        Section(
            title = "A SplitButton with text",
            sourceCode = sourceCodeOfSplitButtonWithTextSample,
            content = { SplitButtonWithTextSample() }
        )
    }
}

@Sample
@Composable
private fun BasicSplitButtonSample(onColorSelected: (color: Color) -> Unit) {
    var currentColor by remember { mutableStateOf(colors.first()) }
    FlyoutContainer(
        flyout = {
            ColorList {
                currentColor = it
                onColorSelected(it)
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

private val colors =
    listOf(Color.Red, Color.Blue, Color.Cyan, Color.Magenta, Color.Yellow, Color.Green, Color.Gray)