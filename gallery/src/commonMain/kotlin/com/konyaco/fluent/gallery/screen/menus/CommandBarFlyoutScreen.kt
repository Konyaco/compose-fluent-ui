package com.konyaco.fluent.gallery.screen.menus

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.CommandBarFlyout
import com.konyaco.fluent.component.CommandBarButton
import com.konyaco.fluent.component.FlyoutPlacement
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.LargeCommandBarFlyout
import com.konyaco.fluent.component.ListItem
import com.konyaco.fluent.component.MenuFlyoutItem
import com.konyaco.fluent.component.MenuFlyoutScope
import com.konyaco.fluent.component.MenuFlyoutSeparator
import com.konyaco.fluent.component.SubtleButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.commandBarIconButtonSize
import com.konyaco.fluent.component.rememberFlyoutPositionProvider
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ArrowMove
import com.konyaco.fluent.icons.regular.Delete
import com.konyaco.fluent.icons.regular.Resize
import com.konyaco.fluent.icons.regular.Save
import com.konyaco.fluent.icons.regular.Share
import com.konyaco.fluent.layout.overflow.OverflowRowScope
import com.konyaco.fluent.source.generated.FluentSourceFile
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.banner
import org.jetbrains.compose.resources.painterResource

@Component(description = "A mini-toolbar displaying proactive commands" +
        "and an optional menu of commands.")
@Composable
fun CommandBarFlyoutScreen() {
    GalleryPage(
        title = "CommandBarFlyout",
        description = "A mini-toolbar which displays a set of proactive commands, as well as a secondary menu of commands if desired.",
        componentPath = FluentSourceFile.CommandBarFlyout,
        galleryPath = ComponentPagePath.CommandBarFlyoutScreen
    ) {
        Section(
            title = "Basic CommandBarFlyout",
            sourceCode = sourceCodeOfBasicCommandBarFlyoutSample,
            content = { BasicCommandBarFlyoutSample() }
        )
        Section(
            title = "Large CommandBarFlyout",
            sourceCode = sourceCodeOfLargeCommandBarFlyoutSample,
            content = { LargeCommandBarFlyoutSample() }
        )
    }
}

@Sample
@Composable
private fun BasicCommandBarFlyoutSample() {
    val (visible, setVisible) = remember { mutableStateOf(false) }
    val (expanded, setExpanded) = remember { mutableStateOf(false) }
    Column {
        Text("Click the image to open the flyout")
        Image(
            painter = painterResource(Res.drawable.banner),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
                .clickable(
                    onClick = { setVisible(true) },
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() }
                )
        )
    }
    CommandBarFlyout(
        visible = visible,
        onDismissRequest = { setVisible(false) },
        expanded = expanded,
        onExpandedChanged = setExpanded,
        positionProvider = rememberFlyoutPositionProvider(FlyoutPlacement.BottomAlignedStart),
        secondary = { hasOverFlowItem ->
            secondaryItems(hasOverFlowItem) { setExpanded(false) }
        }
    ) {
        items(
            isLarge = false,
            onClick = { isOverflow, index ->
                if (isOverflow) {
                    setExpanded(false)
                }
            }
        )
    }
}

@Sample
@Composable
private fun LargeCommandBarFlyoutSample() {
    val (visible, setVisible) = remember { mutableStateOf(false) }
    val (expanded, setExpanded) = remember { mutableStateOf(false) }
    Column {
        Text("Click the image to open the flyout")
        Image(
            painter = painterResource(Res.drawable.banner),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
                .clickable(
                    onClick = { setVisible(true) },
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() }
                )
        )
    }
    LargeCommandBarFlyout(
        visible = visible,
        onDismissRequest = { setVisible(false) },
        expanded = expanded,
        onExpandedChanged = setExpanded,
        positionProvider = rememberFlyoutPositionProvider(FlyoutPlacement.BottomAlignedStart),
        secondary = { hasOverFlowItem ->
            secondaryItems(hasOverFlowItem) { setExpanded(false) }
        }
    ) {
        items(
            isLarge = true,
            onClick = { isOverflow, index ->
                if (isOverflow) {
                    setExpanded(false)
                }
            }
        )
    }

}

@Composable
private fun MenuFlyoutScope.secondaryItems(hasOverFlowItem: Boolean, onClick: () -> Unit) {
    if (hasOverFlowItem) {
        MenuFlyoutSeparator()
    }
    MenuFlyoutItem(
        text = { Text("Resize") },
        icon = { Icon(imageVector = Icons.Default.Resize, contentDescription = null) },
        onClick = onClick
    )
    MenuFlyoutItem(
        text = { Text("Move") },
        icon = { Icon(imageVector = Icons.Default.ArrowMove, contentDescription = null) },
        onClick = onClick
    )
}

private fun OverflowRowScope.items(isLarge: Boolean, onClick: (isOverflow: Boolean, index: Int) -> Unit) {
    items(3) {
        if (!isOverflow) {
            if (isLarge) {
                CommandBarButton(
                    onClick = { onClick(isOverflow, it) },
                    content = {
                        Icon(
                            imageVector = when (it) {
                                0 -> Icons.Default.Share
                                1 -> Icons.Default.Save
                                else -> Icons.Default.Delete
                            },
                            contentDescription = null
                        )
                        Text(
                            text = when (it) {
                                0 -> "Share"
                                1 -> "Save"
                                else -> "Delete"
                            }
                        )
                    }
                )
            } else {
                SubtleButton(
                    onClick = { onClick(isOverflow, it) },
                    content = {
                        Icon(
                            imageVector = when (it) {
                                0 -> Icons.Default.Share
                                1 -> Icons.Default.Save
                                else -> Icons.Default.Delete
                            },
                            contentDescription = null
                        )
                    },
                    iconOnly = true,
                    modifier = Modifier.commandBarIconButtonSize()
                )
            }
        } else {
            ListItem(
                onClick = { onClick(isOverflow, it) },
                text = {

                    Text(
                        text = when (it) {
                            0 -> "Share"
                            1 -> "Save"
                            else -> "Delete"
                        }
                    )
                },
                icon = {
                    Icon(
                        imageVector = when (it) {
                            0 -> Icons.Default.Share
                            1 -> Icons.Default.Save
                            else -> Icons.Default.Delete
                        },
                        contentDescription = null
                    )
                },
                trailing = {}
            )
        }
    }
}