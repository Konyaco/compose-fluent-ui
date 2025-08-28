package io.github.composefluent.gallery

import androidx.compose.ui.window.Window
import androidx.compose.ui.unit.dp
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.icon
import io.github.composefluent.gallery.component.rememberComponentNavigator
import io.github.composefluent.gallery.window.WindowFrame
import org.jetbrains.compose.resources.painterResource
import platform.AppKit.NSApplication
import platform.AppKit.NSApplicationActivationPolicy
import platform.AppKit.NSApplicationDelegateProtocol
import platform.darwin.NSObject

fun main() {
    val nsApplication = NSApplication.sharedApplication()
    nsApplication.setActivationPolicy(NSApplicationActivationPolicy.NSApplicationActivationPolicyRegular)
    nsApplication.delegate = object : NSObject(), NSApplicationDelegateProtocol {
        override fun applicationShouldTerminateAfterLastWindowClosed(sender: NSApplication): Boolean {
            return true
        }
    }
    val title = "Compose Fluent Design Gallery"
    Window(title) {
        val navigator = rememberComponentNavigator()
        val icon = painterResource(Res.drawable.icon)
        WindowFrame(
            backButtonVisible = false,
            backButtonEnabled = navigator.canNavigateUp,
            onBackButtonClick = { navigator.navigateUp() },
            title = title,
            icon = painterResource(Res.drawable.icon),
            captionBarHeight = 48.dp,

        ) { windowInset, captionBarInset ->
            App(
                windowInset = windowInset,
                contentInset = captionBarInset,
                navigator = navigator,
                title = title,
                icon = icon
            )
        }


    }
    nsApplication.run()
}