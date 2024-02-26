package com.konyaco.fluent.gallery.component

import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import com.konyaco.fluent.component.Text

@Composable
fun SourceCode(
    code: String
) {
    SelectionContainer {
        Text(
            text = code,
            fontFamily = FontFamily.Monospace
        )
    }
}