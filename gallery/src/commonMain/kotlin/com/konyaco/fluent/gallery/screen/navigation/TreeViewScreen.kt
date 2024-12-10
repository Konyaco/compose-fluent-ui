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
            node("Root") {
                node("Folder 1") {
                    leaf("File 1-1")
                    leaf("File 1-2")
                    node("Folder 1-3") {
                        leaf("File 1-3-1")
                    }
                }
                node("Folder 2") {
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
