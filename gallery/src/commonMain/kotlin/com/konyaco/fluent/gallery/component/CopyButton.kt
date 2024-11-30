package com.konyaco.fluent.gallery.component

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TooltipBox
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Checkmark
import com.konyaco.fluent.icons.regular.Copy
import kotlinx.coroutines.delay

@OptIn(ExperimentalFoundationApi::class, ExperimentalFluentApi::class)
@Composable
fun CopyButton(
    copyData: String,
    modifier: Modifier = Modifier,
    tooltip: String = "Copy to clipboard"
) {
    var isCopy by remember { mutableStateOf(false) }
    LaunchedEffect(isCopy) {
        if (isCopy) {
            delay(1000)
            isCopy = false
        }
    }
    val clipboard = LocalClipboardManager.current
    TooltipBox(
        tooltip = { Text(tooltip) }
    ){
        Button(
            onClick = {
                clipboard.setText(AnnotatedString(copyData))
                isCopy = true
            },
            iconOnly = true,
            content = {
                AnimatedContent(isCopy) { target ->
                    if (target) {
                        Icon(Icons.Default.Checkmark, contentDescription = null)
                    } else {
                        Icon(Icons.Default.Copy, contentDescription = null)
                    }
                }
            },
            modifier = modifier
        )
    }
}