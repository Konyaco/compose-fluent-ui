package io.github.composefluent.gallery.screen

import androidx.compose.runtime.*
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.component.*
import io.github.composefluent.gallery.component._AllSamplesScreenComponent
import io.github.composefluent.gallery.component._HomeScreenComponent

@Component(icon = "AppsList", index = 1, name = "All samples")
@Composable
fun AllSamplesScreen(navigator: ComponentNavigator) {
    var allComponents by remember {
        mutableStateOf<List<ComponentItem>?>(null)
    }
    LaunchedEffect(flatMapComponents) {
        val excludeComponents = listOf(
            _HomeScreenComponent,
            _AllSamplesScreenComponent
        )
        allComponents = flatMapComponents.filter { it !in excludeComponents && !it.group.startsWith("/" + _Design_guidanceComponents.name) }
    }
    ComponentIndexScreen(
        name = "All samples",
        items = allComponents,
        navigator
    )
}