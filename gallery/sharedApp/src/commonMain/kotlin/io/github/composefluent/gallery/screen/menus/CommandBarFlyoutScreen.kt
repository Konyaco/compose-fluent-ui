package io.github.composefluent.gallery.screen.menus

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
import io.github.composefluent.component.CommandBarFlyout
import io.github.composefluent.component.CommandBarButton
import io.github.composefluent.component.FlyoutPlacement
import io.github.composefluent.component.Icon
import io.github.composefluent.component.LargeCommandBarFlyout
import io.github.composefluent.component.ListItem
import io.github.composefluent.component.MenuFlyoutItem
import io.github.composefluent.component.MenuFlyoutScope
import io.github.composefluent.component.MenuFlyoutSeparator
import io.github.composefluent.component.SubtleButton
import io.github.composefluent.component.Text
import io.github.composefluent.component.commandBarIconButtonSize
import io.github.composefluent.component.rememberFlyoutPositionProvider
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.ArrowMove
import io.github.composefluent.icons.regular.Delete
import io.github.composefluent.icons.regular.Resize
import io.github.composefluent.icons.regular.Save
import io.github.composefluent.icons.regular.Share
import io.github.composefluent.layout.overflow.OverflowRowScope
import io.github.composefluent.source.generated.FluentSourceFile
import io.github.composefluent.gallery.resources.Res
import io.github.composefluent.gallery.resources.banner
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