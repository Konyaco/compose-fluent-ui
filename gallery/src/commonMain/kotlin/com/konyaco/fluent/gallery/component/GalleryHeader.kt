package com.konyaco.fluent.gallery.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.component.Text

@Composable
fun GalleryHeader(title: String, description: String) {
    GalleryHeader(AnnotatedString(title), AnnotatedString(description))
}

@OptIn(ExperimentalTextApi::class, ExperimentalFoundationApi::class)
@Composable
fun GalleryHeader(title: AnnotatedString, description: AnnotatedString) {
    Column(Modifier.padding(top = 32.dp, bottom = 24.dp, start = 32.dp, end = 32.dp)) {
        val uriHandle = LocalUriHandler.current
        Text(
            text = title,
            style = FluentTheme.typography.title
        )
        // TODO: Dropdown button
        Spacer(Modifier.height(24.dp))
        var isOnHoverLink by remember {
            mutableStateOf(false)
        }
        ClickableText(
            text = description,
            onHover = {
                val index = it ?: return@ClickableText
                isOnHoverLink = description.getUrlAnnotations(index, index + 1).firstOrNull() != null
            },
            style = LocalTextStyle.current.copy(LocalContentColor.current.copy(alpha = LocalContentAlpha.current)),
            modifier = Modifier.pointerHoverIcon(
                icon = if (isOnHoverLink) PointerIcon.Hand else PointerIcon.Default
            )
        ) {
            description.getUrlAnnotations(it, it + 1).firstOrNull()?.let { urlAnnotation ->
                uriHandle.openUri(urlAnnotation.item.url)
            }
        }
    }
}