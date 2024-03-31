package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.*
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.List
import com.konyaco.fluent.icons.regular.TextBulletListLtr

@Component(index = 6, description = "A version of the SplitButton where the activation target toggles on/off.")
@Composable
fun ToggleSplitButtonScreen() {
    GalleryPage(
        title = "ToggleSplitButton",
        description = "A version of the SplitButton where the activation target toggles on/off."
    ) {
        Section(
            title = "Using ToggleSplitButton to control bulleted list functionality in RichEditBox",
            sourceCode = sourceCodeOfBasicToggleSplitButtonSample,
            content = { BasicToggleSplitButtonSample() }
        )
    }
}

@Sample
@Composable
private fun BasicToggleSplitButtonSample() {
    val (checked, setChecked) = remember { mutableStateOf(false) }
    var currentIcon by remember { mutableStateOf(icons.first()) }
    FlyoutContainer(
        flyout = {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(horizontal = 4.dp)) {
                icons.forEach {
                    Button(
                        onClick = {
                            currentIcon = it
                            setChecked(true)
                            isFlyoutVisible = false
                        },
                        iconOnly = true
                    ) {
                        Icon(it, null)
                    }
                }

            }
        },
        adaptivePlacement = true,
        placement = FlyoutPlacement.Bottom
    ) {
        ToggleSplitButton(
            flyoutClick = {
                isFlyoutVisible = true
            },
            onClick = { setChecked(!checked) },
            checked = checked
        ) {
            Icon(currentIcon, null, modifier = Modifier.widthIn(32.dp).wrapContentWidth(Alignment.CenterHorizontally))
        }
    }
}

private val icons = listOf(Icons.Default.List, Icons.Default.TextBulletListLtr)