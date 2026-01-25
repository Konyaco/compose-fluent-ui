import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import io.github.composefluent.gallery.App
import io.github.composefluent.gallery.GalleryTheme

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        GalleryTheme {
            App()
        }
    }
}
