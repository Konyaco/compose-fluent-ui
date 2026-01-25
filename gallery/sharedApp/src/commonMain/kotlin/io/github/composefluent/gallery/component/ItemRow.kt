package io.github.composefluent.gallery.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.component.Text

@Composable
internal fun ItemRow(
    index: Int,
    text: @Composable () -> Unit,
    secondary: @Composable () -> Unit,
    third: @Composable () -> Unit,
    fourth: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    textWidth: Dp = 272.dp,
    secondaryWidth: Dp = 136.dp,
    thirdWidth: Dp = 112.dp
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth().heightIn(68.dp).then(
            if (index.mod(2) == 1) {
                Modifier.background(
                    FluentTheme.colors.background.card.default,
                    shape = FluentTheme.shapes.control
                )
            } else {
                Modifier
            }
        )
    ) {
        Box(modifier = Modifier.width(textWidth).padding(horizontal = 16.dp, vertical = 16.dp)) {
            text()
        }
        Box(modifier = Modifier.width(secondaryWidth).padding(horizontal = 16.dp, vertical = 16.dp)) {
            secondary()
        }
        Box(modifier = Modifier.width(thirdWidth).padding(horizontal = 16.dp, vertical = 16.dp)) {
            third()
        }
        fourth()
    }
}

@Composable
internal fun HeaderItemRow(
    text: String,
    secondary: String,
    third: String,
    fourth: String,
    modifier: Modifier = Modifier,
    textWidth: Dp = 272.dp,
    secondaryWidth: Dp = 136.dp,
    thirdWidth: Dp = 112.dp
) {
    val headerStyle = FluentTheme.typography.caption.copy(color = FluentTheme.colors.text.text.secondary)
    ItemRow(
        text = {
            Text(text, style = headerStyle)
        },
        secondary = {
            Text(secondary, style = headerStyle)
        },
        third = {
            Text(third, style = headerStyle)
        },
        fourth = {
            Text(fourth, style = headerStyle)
        },
        index = 0,
        modifier = modifier,
        textWidth = textWidth,
        secondaryWidth = secondaryWidth,
        thirdWidth = thirdWidth
    )
}
