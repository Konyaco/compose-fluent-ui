

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardError: ImageVector
    get() {
        if (_clipboardError != null) {
            return _clipboardError!!
        }
        _clipboardError = fluentIcon(name = "Filled.ClipboardError") {
            fluentPath {
                moveTo(10.25f, 2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.16f, 0.0f, 2.11f, 0.87f, 2.24f, 2.0f)
                horizontalLineToRelative(1.76f)
                curveTo(18.99f, 4.0f, 20.0f, 5.0f, 20.0f, 6.25f)
                verticalLineToRelative(5.25f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 12.81f, 22.0f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 6.25f)
                curveTo(4.0f, 5.01f, 5.0f, 4.0f, 6.25f, 4.0f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.13f, -1.13f, 1.08f, -2.0f, 2.24f, -2.0f)
                close()
                moveTo(13.75f, 3.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(17.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(17.5f, 21.13f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, false, 0.0f, -1.25f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, 0.0f, 1.25f)
                close()
            }
        }
        return _clipboardError!!
    }

private var _clipboardError: ImageVector? = null
