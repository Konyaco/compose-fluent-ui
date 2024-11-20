package com.konyaco.fluent.gallery.component

import androidx.compose.animation.AnimatedContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.FontIcon
import com.konyaco.fluent.component.FontIconPrimitive
import kotlinx.coroutines.delay

@Composable
fun CopyButton(
    copyData: String,
    modifier: Modifier = Modifier
) {
    var isCopy by remember { mutableStateOf(false) }
    LaunchedEffect(isCopy) {
        if (isCopy) {
            delay(1000)
            isCopy = false
        }
    }
    val clipboard = LocalClipboardManager.current
    Button(
        onClick = {
            clipboard.setText(AnnotatedString(copyData))
            isCopy = true
        },
        iconOnly = true,
        content = {
            AnimatedContent(isCopy) { target ->
                FontIcon(
                    type = if (target) {
                        FontIconPrimitive.Accept
                    } else {
                        FontIconPrimitive.Copy
                    },
                    contentDescription = null
                )
            }
        },
        modifier = modifier
    )
}