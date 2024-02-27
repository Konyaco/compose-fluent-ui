package com.konyaco.fluent.gallery.component

import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import com.konyaco.fluent.component.Text

@Composable
fun SourceCode(code: String, modifier: Modifier = Modifier) {
    SelectionContainer {
        Text(
            modifier = modifier,
            text = code,
            fontFamily = FontFamily.Monospace,
            overflow = TextOverflow.Visible
        )
    }
}