

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardImage: ImageVector
    get() {
        if (_clipboardImage != null) {
            return _clipboardImage!!
        }
        _clipboardImage = fluentIcon(name = "Filled.ClipboardImage") {
            fluentPath {
                moveTo(13.75f, 3.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(10.25f, 2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.16f, 0.0f, 2.11f, 0.87f, 2.24f, 2.0f)
                horizontalLineToRelative(1.76f)
                curveTo(18.99f, 4.0f, 20.0f, 5.0f, 20.0f, 6.25f)
                lineTo(20.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.73f, 0.2f, 1.41f, 0.54f, 2.0f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 6.25f)
                curveTo(4.0f, 5.01f, 5.0f, 4.0f, 6.25f, 4.0f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.13f, -1.13f, 1.08f, -2.0f, 2.24f, -2.0f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.56f, 0.15f, 1.08f, 0.42f, 1.52f)
                lineToRelative(3.49f, -3.49f)
                curveToRelative(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.26f, -0.45f, 0.41f, -0.97f, 0.41f, -1.53f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(15.0f, 23.0f)
                curveToRelative(-0.56f, 0.0f, -1.08f, -0.15f, -1.52f, -0.42f)
                lineToRelative(3.49f, -3.49f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(-0.45f, 0.26f, -0.97f, 0.41f, -1.53f, 0.41f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(20.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        return _clipboardImage!!
    }

private var _clipboardImage: ImageVector? = null
