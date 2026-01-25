package io.github.composefluent.gallery.screen.navigation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import io.github.composefluent.component.Button
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.window.WindowFrame
import io.github.composefluent.gallery.component.GalleryPageScope

@Composable
internal actual fun GalleryPageScope.PlatformTabViewSection() {
    Section(
        title = "TabView Window",
        sourceCode = sourceCodeOfTabViewSample,
        content = {
            Button(
                onClick = {
                    Window(title = "TabView Window") {
                        WindowFrame(
                            backButtonVisible = false,
                            backButtonEnabled = false,
                            onBackButtonClick = {},
                            title = "",
                            icon = null,
                            captionBarHeight = 40.dp
                        ) { _, captionBarInset ->
                            TabViewWindowContent(
                                header = {
                                    Spacer(
                                        modifier = Modifier.heightIn(
                                            40.dp
                                        ).windowInsetsPadding(
                                            captionBarInset.only(
                                                WindowInsetsSides.Left
                                            ).add(WindowInsets(right = 0.dp))
                                        )
                                    )
                                }
                            )
                        }
                    }
                },
                content = {
                    Text("Open TabView Window")
                }
            )
        }
    )
}