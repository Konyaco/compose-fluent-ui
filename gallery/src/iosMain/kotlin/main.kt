import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.ComposeUIViewController
import com.konyaco.fluent.gallery.App
import com.konyaco.fluent.gallery.GalleryTheme
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController {
    Box(Modifier.windowInsetsPadding(WindowInsets.safeContent)) {
        GalleryTheme {
            App()
        }
    }
}
