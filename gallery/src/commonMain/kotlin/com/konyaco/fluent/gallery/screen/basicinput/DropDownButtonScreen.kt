package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.*
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.filled.Send
import com.konyaco.fluent.icons.regular.Mail
import com.konyaco.fluent.icons.regular.MailArrowDoubleBack
import com.konyaco.fluent.source.generated.FluentSourceFile

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