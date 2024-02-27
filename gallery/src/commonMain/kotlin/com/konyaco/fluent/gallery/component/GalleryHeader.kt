package com.konyaco.fluent.gallery.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.component.Text

@Composable
fun GalleryHeader(title: String, description: String) {
    Column(Modifier.padding(top = 32.dp, bottom = 12.dp, start = 32.dp, end = 32.dp)) {
        Text(
            text = title,
            style = FluentTheme.typography.title
        )
        // TODO: Dropdown button
        Spacer(Modifier.height(24.dp))
        Text(description)
    }
}