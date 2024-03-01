package com.konyaco.fluent.gallery.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

class ComponentItem(
    val name: String = "",
    val group: String,
    val description: String,
    val items: List<ComponentItem>? = null,
    val icon: ImageVector? = null,
    val content: (@Composable ComponentItem.(navigator: ComponentNavigator) -> Unit)?
)
