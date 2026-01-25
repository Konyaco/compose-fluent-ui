@file:Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
package io.github.composefluent.gallery.component

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.internal.toClipEntry
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboard
import androidx.compose.ui.text.AnnotatedString
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.component.Button
import io.github.composefluent.component.ButtonColorScheme
import io.github.composefluent.component.ButtonDefaults
import io.github.composefluent.component.Text
import io.github.composefluent.component.TooltipBox
import io.github.composefluent.component.FontIcon
import io.github.composefluent.component.FontIconPrimitive
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class, ExperimentalFluentApi::class)
@Composable
fun CopyButton(
    copyData: String,
    modifier: Modifier = Modifier,
    colors: ButtonColorScheme = ButtonDefaults.buttonColors(),
    tooltip: String = "Copy to clipboard"
) {
    var isCopy by remember { mutableStateOf(false) }
    LaunchedEffect(isCopy) {
        if (isCopy) {
            delay(1000)
            isCopy = false
        }
    }
    val clipboard = LocalClipboard.current

    Box(modifier = modifier, propagateMinConstraints = true) {
        TooltipBox(
            tooltip = { Text(tooltip) }
        ) {
            val coroutineScope = rememberCoroutineScope()
            Button(
                onClick = {
                    coroutineScope.launch {
                        clipboard.setClipEntry(AnnotatedString(copyData).toClipEntry())
                        isCopy = true
                    }
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
                buttonColors = colors
            )
        }
    }
}