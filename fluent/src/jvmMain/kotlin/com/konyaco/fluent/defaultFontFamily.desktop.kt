package com.konyaco.fluent

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily

@Composable
actual fun defaultFontFamily(): FontFamily? {
    return null
}

/*
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
}*/
