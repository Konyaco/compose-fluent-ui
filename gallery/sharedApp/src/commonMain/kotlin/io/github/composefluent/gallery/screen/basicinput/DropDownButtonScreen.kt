package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.composefluent.component.*
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.filled.Send
import io.github.composefluent.icons.regular.Mail
import io.github.composefluent.icons.regular.MailArrowDoubleBack
import io.github.composefluent.source.generated.FluentSourceFile

@Component(index = 1, description = "A button that displays a flyout of choices when clicked.")
@Composable
fun DropDownButtonScreen() {
    GalleryPage(
        title = "DropDownButton",
        description = "A control that drops down a flyout of choices from which one can be chosen.",
        componentPath = FluentSourceFile.Button,
        galleryPath = ComponentPagePath.DropDownButtonScreen
    ) {
        Section(
            title = "Simple DropDownButton",
            sourceCode = sourceCodeOfBasicDropDownButton,
            content = { BasicDropDownButton() }
        )
        Section(
            title = "DropDownButton with Icons",
            sourceCode = sourceCodeOfIconDropDownButton,
            content = { IconDropDownButton() }
        )
    }
}

@Sample
@Composable
private fun BasicDropDownButton() {
    MenuFlyoutContainer(
        flyout = {
            MenuFlyoutItem(text = { Text("Send") }, onClick = { isFlyoutVisible = false })
            MenuFlyoutItem(text = { Text("Reply") }, onClick = { isFlyoutVisible = false })
            MenuFlyoutItem(text = { Text("Reply All") }, onClick = { isFlyoutVisible = false })
        },
        content = { DropDownButton(onClick = { isFlyoutVisible = !isFlyoutVisible }, content = { Text("Email") }) },
        adaptivePlacement = true,
        placement = FlyoutPlacement.BottomAlignedStart
    )
}

@Sample
@Composable
private fun IconDropDownButton() {
    MenuFlyoutContainer(
        flyout = {
            MenuFlyoutItem(
                text = { Text("Send") },
                onClick = { isFlyoutVisible = false },
                icon = { Icon(Icons.Filled.Send, contentDescription = "Send", modifier = Modifier.size(20.dp)) })
            MenuFlyoutItem(
                text = { Text("Reply") },
                onClick = { isFlyoutVisible = false },
                icon = { Icon(Icons.Default.MailArrowDoubleBack, contentDescription = "Reply", modifier = Modifier.size(20.dp)) })
            MenuFlyoutItem(
                text = { Text("Reply All") },
                onClick = { isFlyoutVisible = false },
                icon = { Icon(Icons.Default.MailArrowDoubleBack, contentDescription = "Reply All", modifier = Modifier.size(20.dp)) })
        },
        content = {
            DropDownButton(
                onClick = { isFlyoutVisible = !isFlyoutVisible },
                content = { Icon(Icons.Default.Mail, contentDescription = null, modifier = Modifier.size(24.dp)) }
            )
        },
        adaptivePlacement = true,
        placement = FlyoutPlacement.BottomAlignedStart
    )
}