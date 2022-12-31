

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardHeart: ImageVector
    get() {
        if (_clipboardHeart != null) {
            return _clipboardHeart!!
        }
        _clipboardHeart = fluentIcon(name = "Filled.ClipboardHeart") {
            fluentPath {
                moveTo(10.25f, 2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.16f, 0.0f, 2.11f, 0.87f, 2.24f, 2.0f)
                horizontalLineToRelative(1.76f)
                curveTo(18.99f, 4.0f, 20.0f, 5.0f, 20.0f, 6.25f)
                verticalLineToRelative(4.98f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, false, -2.99f, 0.73f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, false, -5.64f, 6.87f)
                lineTo(14.54f, 22.0f)
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
                moveTo(17.01f, 22.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.53f, -0.22f)
                lineToRelative(-4.4f, -4.4f)
                arcToRelative(3.47f, 3.47f, 0.0f, true, true, 4.9f, -4.91f)
                lineToRelative(0.03f, 0.04f)
                lineToRelative(0.04f, -0.04f)
                arcToRelative(3.47f, 3.47f, 0.0f, true, true, 4.9f, 4.9f)
                lineToRelative(-4.4f, 4.41f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, 0.22f)
                close()
            }
        }
        return _clipboardHeart!!
    }

private var _clipboardHeart: ImageVector? = null
