package com.konyaco.fluent.gallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import com.konyaco.fluent.gallery.component.rememberComponentNavigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val componentNavigator = rememberComponentNavigator()
            BackHandler(componentNavigator.canNavigateUp) {
                componentNavigator.navigateUp()
            }
            GalleryTheme {
                App(componentNavigator)
            }
        }
    }
}