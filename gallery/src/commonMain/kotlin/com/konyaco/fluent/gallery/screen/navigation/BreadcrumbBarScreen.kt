package com.konyaco.fluent.gallery.screen.navigation

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.BreadcrumbBar
import com.konyaco.fluent.component.BreadcrumbBarDefaults
import com.konyaco.fluent.component.BreadcrumbBarItem
import com.konyaco.fluent.component.LargeBreadcrumbBarItem
import com.konyaco.fluent.component.OverflowBreadcrumbBarItem
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.layout.overflow.OverflowFlyoutContainer
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(description = "Shows the trail of navigation taken to the current location.")
@Composable
fun BreadcrumbBarScreen() {
    GalleryPage(
        title = "BreadcrumbBar",
        description = "The BreadcrumbBar control provides a common horizontal layout " +
                "to display the trail of navigation taken to the current location Resize " +
                "to see the nodes crumble,starting at the root.",
        componentPath = FluentSourceFile.BreadcrumbBar,
        galleryPath = ComponentPagePath.BreadcrumbBarScreen
    ) {
        Section(
            title = "Basic BreadcrumbBar",
            sourceCode = sourceCodeOfBasicBreadcrumbBarSample,
            content = { BasicBreadcrumbBarSample() }
        )

        Section(
            title = "Large BreadcrumbBar",
            sourceCode = sourceCodeOfLargeBreadcrumbBarSample,
            content = { LargeBreadcrumbBarSample() }
        )
    }
}

@Sample
@Composable
private fun BasicBreadcrumbBarSample() {
    val defaultItems = defaultItems()
    BreadcrumbBar(modifier = Modifier.height(60.dp)) {
        items(defaultItems.size) {
            val item = defaultItems[it]
            if (isOverflow) {
                OverflowBreadcrumbBarItem(
                    onClick = { }
                ) {
                    Text(item)
                }
            } else {
                BreadcrumbBarItem(
                    onClick = {},
                    content = {
                        Text(item)
                    },
                    chevronVisible = it < defaultItems.size - 1,
                )
            }
        }
    }
}

@Sample
@Composable
private fun LargeBreadcrumbBarSample() {
    val defaultItems = defaultItems()
    BreadcrumbBar(
        modifier = Modifier.height(60.dp),
        overflowAction = {
            OverflowFlyoutContainer {
                BreadcrumbBarDefaults.LargeOverflowTag { isFlyoutVisible = true }
            }
        }
    ) {
        items(defaultItems.size) {
            val item = defaultItems[it]
            if (isOverflow) {
                OverflowBreadcrumbBarItem(
                    onClick = { }
                ) {
                    Text(item)
                }
            } else {
                LargeBreadcrumbBarItem(
                    onClick = {},
                    content = {
                        Text(item)
                    },
                    chevronVisible = it < defaultItems.size - 1,
                    inactive = it != defaultItems.lastIndex
                )
            }
        }
    }
}

@Composable
private fun defaultItems(): List<String> {
    return remember {
        listOf(
            "Home",
            "Documents",
            "Design",
            "Northwind",
            "Images",
            "Folder1",
            "Folder2",
            "Folder3"
        )
    }
}