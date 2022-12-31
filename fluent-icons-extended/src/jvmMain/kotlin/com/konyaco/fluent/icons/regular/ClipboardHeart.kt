

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ClipboardHeart: ImageVector
    get() {
        if (_clipboardHeart != null) {
            return _clipboardHeart!!
        }
        _clipboardHeart = fluentIcon(name = "Regular.ClipboardHeart") {
            fluentPath {
                moveTo(20.0f, 6.25f)
                verticalLineToRelative(4.98f)
                curveToRelative(-0.5f, -0.05f, -1.0f, -0.03f, -1.5f, 0.09f)
                lineTo(18.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(-0.4f, 0.6f, -1.09f, 1.0f, -1.87f, 1.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.78f, 0.0f, -1.47f, -0.4f, -1.87f, -1.0f)
                lineTo(6.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(6.79f)
                lineToRelative(1.5f, 1.5f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 6.25f)
                curveTo(4.0f, 5.01f, 5.0f, 4.0f, 6.25f, 4.0f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.13f, -1.13f, 1.08f, -2.0f, 2.24f, -2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.16f, 0.0f, 2.11f, 0.87f, 2.24f, 2.0f)
                horizontalLineToRelative(1.76f)
                curveTo(18.99f, 4.0f, 20.0f, 5.0f, 20.0f, 6.25f)
                close()
                moveTo(16.0f, 4.1f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(10.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(16.48f, 22.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(4.41f, -4.4f)
                arcToRelative(3.47f, 3.47f, 0.0f, true, false, -4.9f, -4.91f)
                lineToRelative(-0.04f, 0.04f)
                lineToRelative(-0.03f, -0.04f)
                arcToRelative(3.47f, 3.47f, 0.0f, true, false, -4.9f, 4.9f)
                lineToRelative(4.4f, 4.41f)
                close()
            }
        }
        return _clipboardHeart!!
    }

private var _clipboardHeart: ImageVector? = null
