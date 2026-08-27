package io.github.composefluent.gallery.screen.collections

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableStateSetOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.Icon
import io.github.composefluent.component.Text
import io.github.composefluent.component.TreeViewItem
import io.github.composefluent.component.TriStateCheckBox
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.Document
import io.github.composefluent.icons.regular.Folder
import io.github.composefluent.source.generated.FluentSourceFile

private data class TreeNode(
    val id: String,
    val title: String,
    val children: List<TreeNode> = emptyList(),
)

private data class TreeNodePosition(
    val parentId: String?,
    val index: Int,
)

private val treeViewSampleNodes = listOf(
    TreeNode(
        id = "work-documents",
        title = "Work Documents",
        children = listOf(
            TreeNode("xyz-functional-spec", "XYZ Functional Spec"),
            TreeNode("feature-schedule", "Feature Schedule"),
        ),
    ),
    TreeNode(
        id = "personal-documents",
        title = "Personal Documents",
        children = listOf(
            TreeNode(
                id = "home-remodel",
                title = "Home Remodel",
                children = listOf(
                    TreeNode("contractor-contact-info", "Contractor Contact Info"),
                    TreeNode("paint-color-scheme", "Paint Color Scheme"),
                ),
            ),
        ),
    ),
)

private val treeViewSampleExpandedIds = buildSet {
    fun addParentIds(nodes: List<TreeNode>) {
        nodes.forEach { node ->
            if (node.children.isNotEmpty()) {
                add(node.id)
                addParentIds(node.children)
            }
        }
    }
    addParentIds(treeViewSampleNodes)
}

private val treeViewSampleNodePositions = buildMap {
    fun indexNodes(nodes: List<TreeNode>, parentId: String?) {
        nodes.forEachIndexed { index, node ->
            put(node.id, TreeNodePosition(parentId = parentId, index = index))
            indexNodes(node.children, parentId = node.id)
        }
    }

    indexNodes(treeViewSampleNodes, parentId = null)
}

private fun LazyListScope.treeViewSampleItems(
    expandedIds: Set<String>,
    itemContent: @Composable LazyItemScope.(node: TreeNode, level: Int) -> Unit,
) {
    val expandedNodeIndicesByParent = mutableMapOf<String?, MutableList<Int>>()
    expandedIds.forEach { nodeId ->
        val position = treeViewSampleNodePositions[nodeId] ?: return@forEach
        expandedNodeIndicesByParent
            .getOrPut(position.parentId) { mutableListOf() }
            .add(position.index)
    }
    expandedNodeIndicesByParent.values.forEach { indices -> indices.sort() }

    fun addRange(nodes: List<TreeNode>, level: Int, startIndex: Int, endIndex: Int) {
        val count = endIndex - startIndex
        if (count <= 0) return
        this@treeViewSampleItems.items(
            count = count,
            key = { offset -> nodes[startIndex + offset].id },
        ) { offset ->
            itemContent(nodes[startIndex + offset], level)
        }
    }

    fun addNodes(nodes: List<TreeNode>, parentId: String?, level: Int) {
        var rangeStart = 0
        expandedNodeIndicesByParent[parentId].orEmpty().forEach { expandedIndex ->
            if (expandedIndex !in rangeStart..<nodes.size) return@forEach
            addRange(nodes, level, rangeStart, expandedIndex)
            val node = nodes[expandedIndex]
            addRange(nodes, level, expandedIndex, expandedIndex + 1)
            addNodes(node.children, parentId = node.id, level = level + 1)
            rangeStart = expandedIndex + 1
        }
        addRange(nodes, level, rangeStart, nodes.size)
    }

    addNodes(treeViewSampleNodes, parentId = null, level = 0)
}

private val treeViewSampleLeafIdsByNodeId = buildMap {
    fun indexNode(node: TreeNode): Set<String> {
        val leafIds = if (node.children.isEmpty()) {
            setOf(node.id)
        } else {
            node.children.flatMap { child -> indexNode(child) }.toSet()
        }
        put(node.id, leafIds)
        return leafIds
    }

    treeViewSampleNodes.forEach { node -> indexNode(node) }
}

private fun TreeNode.descendantLeafIds(): Set<String> = treeViewSampleLeafIdsByNodeId[id].orEmpty()

private fun treeViewSampleCheckboxState(
    node: TreeNode,
    checkedLeafIds: Set<String>,
): ToggleableState {
    val descendantLeafIds = node.descendantLeafIds()
    val checkedCount = descendantLeafIds.count(checkedLeafIds::contains)
    return when {
        descendantLeafIds.isEmpty() || checkedCount == 0 -> ToggleableState.Off
        checkedCount == descendantLeafIds.size -> ToggleableState.On
        else -> ToggleableState.Indeterminate
    }
}

@Component(description = "Compact, hierarchical items for caller-owned tree lists.")
@Composable
fun TreeViewItemScreen() {
    GalleryPage(
        title = "TreeViewItem",
        description = "Compact hierarchical list items with expansion, selection, icons, and optional checkboxes.",
        componentPath = FluentSourceFile.TreeViewItem,
        galleryPath = ComponentPagePath.TreeViewItemScreen,
    ) {
        Section(
            title = "Standard TreeViewItem",
            sourceCode = sourceCodeOfStandardTreeViewItemSample,
            content = { StandardTreeViewItemSample() },
        )
        Section(
            title = "TreeViewItem with checkbox states",
            sourceCode = sourceCodeOfCheckboxTreeViewItemSample,
            content = { CheckboxTreeViewItemSample() },
        )
        val showCheckbox = remember { mutableStateOf(false) }
        val showIcon = remember { mutableStateOf(true) }
        val enabled = remember { mutableStateOf(true) }
        Section(
            title = "TreeViewItem Options Sample",
            sourceCode = sourceCodeOfTreeViewItemOptionsSample,
            options = {
                CheckBox(
                    checked = showCheckbox.value,
                    onCheckStateChange = { showCheckbox.value = it },
                    label = "Checkbox",
                )
                CheckBox(
                    checked = showIcon.value,
                    onCheckStateChange = { showIcon.value = it },
                    label = "Icon",
                )
                CheckBox(
                    checked = enabled.value,
                    onCheckStateChange = { enabled.value = it },
                    label = "Enabled",
                )
            },
            content = {
                TreeViewItemOptionsSample(
                    showCheckbox = showCheckbox.value,
                    showIcon = showIcon.value,
                    enabled = enabled.value,
                )
            },
        )
    }
}

@Sample
@Composable
private fun StandardTreeViewItemSample() {
    val expandedIds = remember { mutableStateSetOf<String>().also { it.addAll(treeViewSampleExpandedIds) } }
    var selectedId by remember { mutableStateOf<String?>(null) }

    LazyColumn(modifier = Modifier.height(220.dp).widthIn(max = TreeViewListMaxWidth)) {
        treeViewSampleItems(expandedIds) { node, level ->
            val icon = if (node.children.isNotEmpty()) Icons.Default.Folder else Icons.Default.Document
            if (node.children.isNotEmpty()) {
                TreeViewItem(
                    selected = selectedId == node.id,
                    onClick = {
                        selectedId = if (selectedId == node.id) null else node.id
                    },
                    expanded = node.id in expandedIds,
                    onExpandedChanged = { expanded ->
                        if (expanded) {
                            expandedIds += node.id
                        } else {
                            expandedIds -= node.id
                        }
                    },
                    level = level,
                    icon = { Icon(icon, contentDescription = null) },
                    text = { Text(text = node.title, maxLines = 1, overflow = TextOverflow.Ellipsis) },
                    modifier = Modifier.fillMaxWidth().animateItem(),
                )
            } else {
                TreeViewItem(
                    selected = selectedId == node.id,
                    onClick = {
                        selectedId = if (selectedId == node.id) null else node.id
                    },
                    level = level,
                    icon = { Icon(icon, contentDescription = null) },
                    text = { Text(text = node.title, maxLines = 1, overflow = TextOverflow.Ellipsis) },
                    modifier = Modifier.fillMaxWidth().animateItem(),
                )
            }
        }
    }
}

@Sample
@Composable
private fun CheckboxTreeViewItemSample() {
    val expandedIds = remember { mutableStateSetOf<String>().also { it.addAll(treeViewSampleExpandedIds) } }
    val checkedLeafIds = remember { mutableStateSetOf("feature-schedule") }

    LazyColumn(modifier = Modifier.height(220.dp).widthIn(max = TreeViewListMaxWidth)) {
        treeViewSampleItems(expandedIds) { node, level ->
            val icon = if (node.children.isNotEmpty()) Icons.Default.Folder else Icons.Default.Document
            val parentState = if (node.children.isNotEmpty()) {
                treeViewSampleCheckboxState(node, checkedLeafIds)
            } else {
                null
            }
            if (node.children.isNotEmpty()) {
                TreeViewItem(
                    selected = parentState == ToggleableState.On,
                    onClick = {},
                    expanded = node.id in expandedIds,
                    onExpandedChanged = { expanded ->
                        if (expanded) {
                            expandedIds += node.id
                        } else {
                            expandedIds -= node.id
                        }
                    },
                    level = level,
                    checkbox = {
                        TriStateCheckBox(
                            state = parentState ?: ToggleableState.Off,
                            onClick = {
                                val descendantLeafIds = node.descendantLeafIds()
                                val shouldCheck = parentState == ToggleableState.Off
                                if (shouldCheck) {
                                    checkedLeafIds += descendantLeafIds
                                } else {
                                    checkedLeafIds -= descendantLeafIds.toSet()
                                }
                            },
                        )
                    },
                    icon = { Icon(icon, contentDescription = null) },
                    text = { Text(text = node.title, maxLines = 1, overflow = TextOverflow.Ellipsis) },
                    modifier = Modifier.fillMaxWidth().animateItem(),
                )
            } else {
                TreeViewItem(
                    selected = node.id in checkedLeafIds,
                    onClick = {},
                    level = level,
                    checkbox = {
                        CheckBox(
                            checked = node.id in checkedLeafIds,
                            onCheckStateChange = { checked ->
                                if (checked) {
                                    checkedLeafIds += node.id
                                } else {
                                    checkedLeafIds -= node.id
                                }
                            },
                        )
                    },
                    icon = { Icon(icon, contentDescription = null) },
                    text = { Text(text = node.title, maxLines = 1, overflow = TextOverflow.Ellipsis) },
                    modifier = Modifier.fillMaxWidth().animateItem(),
                )
            }
        }
    }
}

@Sample
@Composable
private fun TreeViewItemOptionsSample(
    showCheckbox: Boolean,
    showIcon: Boolean,
    enabled: Boolean,
) {
    val expandedIds = remember { mutableStateSetOf<String>().also { it.addAll(treeViewSampleExpandedIds) } }
    var selectedId by remember { mutableStateOf<String?>(null) }
    val checkedLeafIds = remember { mutableStateSetOf<String>() }

    LazyColumn(modifier = Modifier.height(220.dp).widthIn(max = TreeViewListMaxWidth)) {
        treeViewSampleItems(expandedIds) { node, level ->
            val icon = if (node.children.isNotEmpty()) Icons.Default.Folder else Icons.Default.Document
            val iconContent: (@Composable () -> Unit)? = if (showIcon) {
                { Icon(icon, contentDescription = null) }
            } else {
                null
            }
            val parentState = if (node.children.isNotEmpty()) {
                treeViewSampleCheckboxState(node, checkedLeafIds)
            } else {
                null
            }
            val checkboxContent: (@Composable () -> Unit)? = if (showCheckbox) {
                if (node.children.isNotEmpty()) {
                    {
                        TriStateCheckBox(
                            state = parentState ?: ToggleableState.Off,
                            enabled = enabled,
                            onClick = {
                                val descendantLeafIds = node.descendantLeafIds()
                                val shouldCheck = parentState == ToggleableState.Off
                                if (shouldCheck) {
                                    checkedLeafIds += descendantLeafIds
                                } else {
                                    checkedLeafIds -= descendantLeafIds.toSet()
                                }
                            },
                        )
                    }
                } else {
                    {
                        CheckBox(
                            checked = node.id in checkedLeafIds,
                            enabled = enabled,
                            onCheckStateChange = { checked ->
                                if (checked) {
                                    checkedLeafIds += node.id
                                } else {
                                    checkedLeafIds -= node.id
                                }
                            },
                        )
                    }
                }
            } else {
                null
            }
            val selected = if (showCheckbox) {
                if (node.children.isNotEmpty()) {
                    parentState == ToggleableState.On
                } else {
                    node.id in checkedLeafIds
                }
            } else {
                selectedId == node.id
            }
            val itemOnClick: () -> Unit = if (showCheckbox) {
                {}
            } else {
                {
                    selectedId = if (selectedId == node.id) null else node.id
                }
            }
            if (node.children.isNotEmpty()) {
                TreeViewItem(
                    selected = selected,
                    onClick = itemOnClick,
                    expanded = node.id in expandedIds,
                    onExpandedChanged = { expanded ->
                        if (expanded) expandedIds += node.id else expandedIds -= node.id
                    },
                    level = level,
                    enabled = enabled,
                    checkbox = checkboxContent,
                    icon = iconContent,
                    text = { Text(text = node.title, maxLines = 1, overflow = TextOverflow.Ellipsis) },
                    modifier = Modifier.fillMaxWidth().animateItem(),
                )
            } else {
                TreeViewItem(
                    selected = selected,
                    onClick = itemOnClick,
                    level = level,
                    enabled = enabled,
                    checkbox = checkboxContent,
                    icon = iconContent,
                    text = { Text(text = node.title, maxLines = 1, overflow = TextOverflow.Ellipsis) },
                    modifier = Modifier.fillMaxWidth().animateItem(),
                )
            }
        }
    }
}

private val TreeViewListMaxWidth = 380.dp
