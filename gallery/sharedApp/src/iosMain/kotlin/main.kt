import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.safeContent
import androidx.compose.ui.window.ComposeUIViewController
import io.github.composefluent.gallery.App
import io.github.composefluent.gallery.GalleryTheme
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController {
    GalleryTheme {
        App(windowInset = WindowInsets.safeContent, collapseWindowInset = WindowInsets.safeContent)
    }
}
