package com.konyaco.fluent.gallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.systemBars
import com.konyaco.fluent.gallery.component.rememberComponentNavigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val componentNavigator = rememberComponentNavigator()
            BackHandler(componentNavigator.canNavigateUp) {
                componentNavigator.navigateUp()
            }
            GalleryTheme {
                App(
                    navigator = componentNavigator,
                    windowInset = WindowInsets.systemBars,
                    collapseWindowInset = WindowInsets.systemBars
                )
            }
        }
    }
}