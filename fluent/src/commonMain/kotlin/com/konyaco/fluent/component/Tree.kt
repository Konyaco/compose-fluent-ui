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

// Represents a tree composed of multiple root elements
data class Tree<T>(val roots: List<TreeElement<T>>) {
    fun isEmpty() = roots.isEmpty()
}

// Represents an element in the tree (either a Leaf or a Node)
sealed class TreeElement<T> {
    abstract val data: T
    abstract val id: Any
    abstract val children: List<TreeElement<T>>
    abstract val depth: Int
    val isLeaf: Boolean get() = children.isEmpty()

    data class Leaf<T>(
        override val data: T,
        override val id: Any,
        override val depth: Int
    ) : TreeElement<T>() {
        override val children: List<TreeElement<T>> = emptyList()
    }

    data class Node<T>(
        override val data: T,
        override val id: Any,
        override val depth: Int,
        override val children: List<TreeElement<T>>
    ) : TreeElement<T>()
}

// Builder DSL to construct trees in a declarative manner
fun <T> buildTree(block: TreeBuilder<T>.() -> Unit): Tree<T> {
    val builder = TreeBuilder<T>()
    builder.block()
    return Tree(builder.buildRoots())
}

// Tree builder that helps create roots and their descendants
class TreeBuilder<T> {
    private val elements = mutableListOf<BuilderElement<T>>()

    fun node(data: T, id: Any = data.toString(), children: NodeBuilder<T>.() -> Unit) {
        val childBuilder = NodeBuilder<T>(0)
        childBuilder.children()
        elements.add(BuilderElement.Node(data, id, childBuilder.elements, 0))
    }

    fun leaf(data: T, id: Any = data.toString()) {
        elements.add(BuilderElement.Leaf(data, id, 0))
    }

    internal fun buildRoots(): List<TreeElement<T>> = elements.map { it.buildElement(depth = 0) }

    sealed class BuilderElement<T> {
        abstract fun buildElement(depth: Int): TreeElement<T>

        data class Leaf<T>(val data: T, val id: Any, val depthInit: Int) : BuilderElement<T>() {
            override fun buildElement(depth: Int): TreeElement<T> {
                return TreeElement.Leaf(data, id, depth)
            }
        }

        data class Node<T>(
            val data: T,
            val id: Any,
            val children: List<BuilderElement<T>>,
            val depthInit: Int
        ) : BuilderElement<T>() {
            override fun buildElement(depth: Int): TreeElement<T> {
                val builtChildren = children.map { it.buildElement(depth + 1) }
                return TreeElement.Node(data, id, depth, builtChildren)
            }
        }
    }
}

// Builder for adding children under a node
class NodeBuilder<T>(private val parentDepth: Int) {
    internal val elements = mutableListOf<TreeBuilder.BuilderElement<T>>()

    fun node(data: T, id: Any = data.toString(), children: NodeBuilder<T>.() -> Unit) {
        val childBuilder = NodeBuilder<T>(parentDepth + 1)
        childBuilder.children()
        elements.add(TreeBuilder.BuilderElement.Node(data, id, childBuilder.elements, parentDepth + 1))
    }

    fun leaf(data: T, id: Any = data.toString()) {
        elements.add(TreeBuilder.BuilderElement.Leaf(data, id, parentDepth + 1))
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

/**
 * Displays the entire tree recursively using a Column.
 * This approach removes code duplication and uses a single function to handle nodes and their children.
 */
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

/**
 * Recursively displays a tree element (node or leaf).
 * If it is a node, it can be expanded or collapsed to show its children.
 */
@Composable
fun <T> TreeElementView(
    element: TreeElement<T>,
    colors: VisualStateScheme<TreeNodeColor>
) {
    val isNode = element is TreeElement.Node<T>
    val expandedState = if (isNode) remember { mutableStateOf(false) } else null

    // Display the current node line
    TreeNodeView(
        element = element,
        colors = colors,
        onClick = {
            if (isNode) expandedState!!.value = !expandedState.value
        }
    )

    // If it's a node and expanded, show its children with animation
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

/**
 * Displays a single tree node/leaf line.
 * Handles the clickable area, indentation, and icon display.
 */
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

    // Local expanded state for icons only (true/false), not triggering recursion here directly
    val expandedState = if (isNode) remember { mutableStateOf(false) } else null

    Row(
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 32.dp)
            .clip(RoundedCornerShape(8.dp))
            .hoverable(interactionSource)
            .background(if (visualState == VisualState.Hovered) color.backgroundColor else Color.Transparent)
            .clickable(
                enabled = enabled && isNode,
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
