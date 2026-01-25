package io.github.composefluent.gallery.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSerializable
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.serialization.NavBackStackSerializer
import androidx.savedstate.serialization.SavedStateConfiguration

interface ComponentNavigator {

    fun navigate(componentItem: ComponentItem)

    fun navigateUp()

    val currentBackstack: List<ComponentItem>

    val latestBackEntry: ComponentItem?

    val canNavigateUp: Boolean

}

@Composable
fun rememberComponentNavigator(startItem: ComponentItem = components.first()): ComponentNavigator {
    val navBackStack = rememberSerializable(
        configuration = SavedStateConfiguration.DEFAULT,
        serializer = NavBackStackSerializer(ComponentItem.serializer()),
    ) {
        NavBackStack(startItem)
    }
    return remember { ComponentNavigatorImpl(navBackStack) }
}

private class ComponentNavigatorImpl(private val backstack: MutableList<ComponentItem>) :
    ComponentNavigator {

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

    override val canNavigateUp: Boolean by derivedStateOf {
        backstack.count { it.content != null } > 1
    }

    override val currentBackstack: List<ComponentItem>
        get() = backstack

    override val latestBackEntry: ComponentItem?
        get() = backstack.lastOrNull()
}