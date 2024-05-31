package com.konyaco.fluent.gallery.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

interface ComponentNavigator {

    fun navigate(componentItem: ComponentItem)

    fun navigateUp()

    val currentBackstack: List<ComponentItem>

    val latestBackEntry: ComponentItem?

}

@Composable
fun rememberComponentNavigator(startItem: ComponentItem = components.first()): ComponentNavigator {
    return remember { ComponentNavigatorImpl(startItem) }
}

private class ComponentNavigatorImpl(startItem: ComponentItem) : ComponentNavigator {

    private val backstack = mutableStateListOf<ComponentItem>().apply { add(startItem) }

    override fun navigate(componentItem: ComponentItem) {
        backstack.add(componentItem)
    }

    override fun navigateUp() {
        if (backstack.isNotEmpty()) {
            do {
                backstack.removeLast()
            } while (backstack.lastOrNull().let { it != null && it.content == null })
        }
    }

    override val currentBackstack: List<ComponentItem>
        get() = backstack

    override val latestBackEntry: ComponentItem?
        get() = backstack.lastOrNull()
}