package com.konyaco.fluent

import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.text.platform.Font
import org.jetbrains.skiko.AwtFontManager

@Composable
actual fun defaultFontFamily(): FontFamily? {
    val state = remember {
        mutableStateOf<FontFamily?>(null)
    }
    LaunchedEffect(state) {
        state.value = AwtFontManager.DEFAULT.findFontFamilyFile("Segoe UI Variable")?.let {
            Font(it).toFontFamily()
        }
    }
    return state.value
}