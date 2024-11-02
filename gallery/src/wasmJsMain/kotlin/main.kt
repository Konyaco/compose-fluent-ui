import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.konyaco.fluent.gallery.App
import com.konyaco.fluent.gallery.GalleryTheme

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("Compose Fluent Design Gallery") {
        GalleryTheme {
            App()
        }
    }
}
