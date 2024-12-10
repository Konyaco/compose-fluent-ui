package com.konyaco.fluent.gallery.screen.navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.konyaco.fluent.component.TreeView
import com.konyaco.fluent.component.buildTree
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile


@Component(
    index = 2,
    description = "A control that displays a hierarchical structure of items that can be expanded or collapsed."
)
@Composable
fun TreeViewScreen() {
    GalleryPage(
        title = "TreeView",
        description = "A TreeView provides a hierarchical structure of items that can be expanded or collapsed.",
        componentPath = FluentSourceFile.Tree,
        galleryPath = ComponentPagePath.TreeViewScreen
    ) {
        Section(
            title = "Basic TreeView",
            sourceCode = sourceCodeOfTreeViewSample,
            content = { TreeViewSample() }
        )
    }
}


@Sample
@Composable
fun TreeViewSample() {
    val tree = remember {
        buildTree {
            node(data = "Root", onClick = { isExpanded ->
                println("Root clicked, expanded: $isExpanded")
            }) {
                node("Folder 1", onClick = { isExpanded ->
                    println("Folder 1 clicked, expanded: $isExpanded")
                }) {
                    leaf(data = "File 1-1", onClick = { _ -> println("File 1-1 clicked") })
                    leaf("File 1-2")
                    node("Folder 1-3", onClick = { isExpanded ->
                        println("Folder 1-3 clicked, expanded: $isExpanded")
                    }) {
                        leaf("File 1-3-1")
                    }
                }
                node("Folder 2", onClick = { isExpanded ->
                    println("Folder 2 clicked, expanded: $isExpanded")
                }) {
                    leaf("File 2-1")
                }
            }
        }
    }
    TreeView(
        tree = tree,
        modifier = Modifier.fillMaxWidth()
    )
}

