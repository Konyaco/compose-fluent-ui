import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.safeContent
import androidx.compose.ui.window.ComposeUIViewController
import com.konyaco.fluent.gallery.App
import com.konyaco.fluent.gallery.GalleryTheme
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController {
    GalleryTheme {
        App(windowInset = WindowInsets.safeContent, collapseWindowInset = WindowInsets.safeContent)
    }
}
