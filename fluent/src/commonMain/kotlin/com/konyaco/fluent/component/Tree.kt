package com.konyaco.fluent.component

import androidx.compose.animation.*
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ChevronDown
import com.konyaco.fluent.icons.regular.ChevronRight
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualState
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState

// -------------------------------------
// Data structures and tree builder
// -------------------------------------

data class Tree<T>(val roots: List<TreeElement<T>>) {
    fun isEmpty() = roots.isEmpty()
}

sealed class TreeElement<T> {
    abstract val data: T
    abstract val id: Any
    abstract val children: List<TreeElement<T>>
    abstract val depth: Int
    abstract val onClick: ((Boolean) -> Unit)?
    val isLeaf: Boolean get() = children.isEmpty()

    data class Leaf<T>(
        override val data: T,
        override val id: Any,
        override val depth: Int,
        override val onClick: ((Boolean) -> Unit)?
    ) : TreeElement<T>() {
        override val children: List<TreeElement<T>> = emptyList()
    }

    data class Node<T>(
        override val data: T,
        override val id: Any,
        override val depth: Int,
        override val children: List<TreeElement<T>>,
        override val onClick: ((Boolean) -> Unit)?
    ) : TreeElement<T>()
}

fun <T> buildTree(block: TreeBuilder<T>.() -> Unit): Tree<T> {
    val builder = TreeBuilder<T>()
    builder.block()
    return Tree(builder.buildRoots())
}

class TreeBuilder<T> {
    private val elements = mutableListOf<BuilderElement<T>>()

    fun node(data: T, id: Any = data.toString(), onClick: ((Boolean) -> Unit)? = null, children: NodeBuilder<T>.() -> Unit) {
        val childBuilder = NodeBuilder<T>(0)
        childBuilder.children()
        elements.add(BuilderElement.Node(data, id, onClick, childBuilder.elements, 0))
    }

    fun leaf(data: T, id: Any = data.toString(), onClick: ((Boolean) -> Unit)? = null) {
        elements.add(BuilderElement.Leaf(data, id, onClick, 0))
    }

    internal fun buildRoots(): List<TreeElement<T>> = elements.map { it.buildElement(depth = 0) }

    sealed class BuilderElement<T> {
        abstract fun buildElement(depth: Int): TreeElement<T>

        data class Leaf<T>(val data: T, val id: Any, val onClick: ((Boolean) -> Unit)?, val depthInit: Int) : BuilderElement<T>() {
            override fun buildElement(depth: Int): TreeElement<T> {
                return TreeElement.Leaf(data, id, depth, onClick)
            }
        }

        data class Node<T>(
            val data: T,
            val id: Any,
            val onClick: ((Boolean) -> Unit)?,
            val children: List<BuilderElement<T>>,
            val depthInit: Int
        ) : BuilderElement<T>() {
            override fun buildElement(depth: Int): TreeElement<T> {
                val builtChildren = children.map { it.buildElement(depth + 1) }
                return TreeElement.Node(data, id, depth, builtChildren, onClick)
            }
        }
    }
}

class NodeBuilder<T>(private val parentDepth: Int) {
    internal val elements = mutableListOf<TreeBuilder.BuilderElement<T>>()

    fun node(data: T, id: Any = data.toString(), onClick: ((Boolean) -> Unit)? = null, children: NodeBuilder<T>.() -> Unit) {
        val childBuilder = NodeBuilder<T>(parentDepth + 1)
        childBuilder.children()
        elements.add(TreeBuilder.BuilderElement.Node(data, id, onClick, childBuilder.elements, parentDepth + 1))
    }

    fun leaf(data: T, id: Any = data.toString(), onClick: ((Boolean) -> Unit)? = null) {
        elements.add(TreeBuilder.BuilderElement.Leaf(data, id, onClick, parentDepth + 1))
    }
}

// -------------------------------------
// Tree Node Color Scheme
// -------------------------------------

@Immutable
data class TreeNodeColor(
    val backgroundColor: Color,
    val contentColor: Color,
    val borderColor: Color,
    val labelTextColor: Color
)

typealias TreeNodeColorScheme = PentaVisualScheme<TreeNodeColor>

object TreeNodeDefaults {
    @Stable
    @Composable
    fun defaultNodeColors(
        default: TreeNodeColor = TreeNodeColor(
            backgroundColor = Color.Transparent,
            contentColor = FluentTheme.colors.text.onAccent.primary,
            borderColor = FluentTheme.colors.controlStrong.default,
            labelTextColor = FluentTheme.colors.text.text.primary
        ),
        hovered: TreeNodeColor = TreeNodeColor(
            backgroundColor = FluentTheme.colors.controlAlt.tertiary,
            contentColor = FluentTheme.colors.text.onAccent.primary,
            borderColor = FluentTheme.colors.controlStrong.default,
            labelTextColor = FluentTheme.colors.text.text.primary
        ),
        pressed: TreeNodeColor = TreeNodeColor(
            backgroundColor = FluentTheme.colors.controlAlt.quaternary,
            contentColor = FluentTheme.colors.text.onAccent.secondary,
            borderColor = FluentTheme.colors.controlStrong.default,
            labelTextColor = FluentTheme.colors.text.text.primary
        ),
        disabled: TreeNodeColor = TreeNodeColor(
            backgroundColor = FluentTheme.colors.controlAlt.disabled,
            contentColor = FluentTheme.colors.text.onAccent.disabled,
            borderColor = FluentTheme.colors.controlStrong.disabled,
            labelTextColor = FluentTheme.colors.text.text.disabled
        )
    ) = TreeNodeColorScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )
}

@Composable
fun <T> TreeNodeColorScheme.schemeFor(state: VisualState): TreeNodeColor {
    return when (state) {
        VisualState.Default -> default
        VisualState.Hovered -> hovered
        VisualState.Pressed -> pressed
        VisualState.Disabled -> disabled
        VisualState.Focused -> focused
    }
}

// -------------------------------------
// Tree composables
// -------------------------------------

@Composable
fun <T> TreeView(
    tree: Tree<T>,
    modifier: Modifier = Modifier,
    nodeColors: VisualStateScheme<TreeNodeColor> = TreeNodeDefaults.defaultNodeColors()
) {
    Column(modifier) {
        tree.roots.forEach { element ->
            TreeElementView(element, nodeColors)
        }
    }
}

@Composable
fun <T> TreeElementView(
    element: TreeElement<T>,
    colors: VisualStateScheme<TreeNodeColor>
) {
    val isNode = element is TreeElement.Node<T>
    val expandedState = if (isNode) remember { mutableStateOf(false) } else null

    TreeNodeView(
        element = element,
        colors = colors,
        onClick = {
            if (isNode) expandedState!!.value = !expandedState.value
            element.onClick?.invoke(expandedState?.value ?: false)
        }
    )

    if (isNode) {
        val node = element as TreeElement.Node<T>
        AnimatedVisibility(
            visible = expandedState!!.value,
            enter = fadeIn() + expandVertically(
                animationSpec = tween(
                    durationMillis = FluentDuration.QuickDuration,
                    easing = EaseInOut
                )
            ),
            exit = fadeOut() + shrinkVertically(
                animationSpec = tween(
                    durationMillis = FluentDuration.QuickDuration,
                    easing = EaseInOut
                )
            )
        ) {
            Column {
                node.children.forEach { child ->
                    TreeElementView(child, colors)
                }
            }
        }
    }
}

@Composable
fun <T> TreeNodeView(
    element: TreeElement<T>,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: VisualStateScheme<TreeNodeColor>,
    onClick: (() -> Unit)? = null
) {
    val interactionSource = remember { MutableInteractionSource() }
    val visualState = interactionSource.collectVisualState(!enabled)
    val color = colors.schemeFor(visualState)

    val indentation = (element.depth * 16).dp
    val isNode = element is TreeElement.Node && element.children.isNotEmpty()

    val expandedState = if (isNode) remember { mutableStateOf(false) } else null

    Row(
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 32.dp)
            .clip(RoundedCornerShape(8.dp))
            .hoverable(interactionSource)
            .background(if (visualState == VisualState.Hovered) color.backgroundColor else Color.Transparent)
            .clickable(
                enabled = enabled,
                role = Role.Button,
                indication = null,
                interactionSource = interactionSource
            ) {
                expandedState?.value = !(expandedState?.value ?: false)
                onClick?.invoke()
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(Modifier.padding(start = 4.dp).width(indentation))

        val icon = when {
            isNode -> if (expandedState?.value == true) Icons.Regular.ChevronDown else Icons.Regular.ChevronRight
            else -> null
        }

        if (icon != null) {
            Box(Modifier.size(20.dp), contentAlignment = Alignment.Center) {
                Icon(imageVector = icon, contentDescription = null)
            }
        } else {
            Spacer(Modifier.size(20.dp))
        }

        Spacer(Modifier.width(8.dp))
        Text(
            text = element.data.toString(),
            style = FluentTheme.typography.body.copy(color = color.labelTextColor)
        )
    }
}
