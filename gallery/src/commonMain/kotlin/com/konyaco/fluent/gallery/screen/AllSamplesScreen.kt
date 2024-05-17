package com.konyaco.fluent.gallery.screen

import androidx.compose.runtime.*
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.component.*
import com.konyaco.fluent.gallery.component._AllSamplesScreenComponent
import com.konyaco.fluent.gallery.component._HomeScreenComponent

@Component(icon = "AppsList", index = 1, name = "All samples")
@Composable
fun AllSamplesScreen(navigator: ComponentNavigator) {
    var allComponents by remember {
        mutableStateOf<List<ComponentItem>?>(null)
    }
    LaunchedEffect(flatMapComponents) {
        val excludeComponents = listOf(_HomeScreenComponent, _AllSamplesScreenComponent, Design_guidance_TypographyScreenComponent)
        allComponents = flatMapComponents.filter { it !in excludeComponents }
    }
    ComponentIndexScreen(
        name = "All samples",
        items = allComponents,
        navigator
    )
}