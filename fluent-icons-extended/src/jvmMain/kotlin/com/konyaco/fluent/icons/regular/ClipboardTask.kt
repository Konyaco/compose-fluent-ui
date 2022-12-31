

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ClipboardTask: ImageVector
    get() {
        if (_clipboardTask != null) {
            return _clipboardTask!!
        }
        _clipboardTask = fluentIcon(name = "Regular.ClipboardTask") {
            fluentPath {
                moveTo(17.03f, 11.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(11.0f, 14.94f)
                lineToRelative(-1.97f, -1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(5.5f, -5.5f)
                close()
                moveTo(15.99f, 4.08f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 13.75f, 2.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.16f, 0.0f, -2.11f, 0.87f, -2.24f, 2.0f)
                lineTo(6.25f, 4.0f)
                curveTo(5.01f, 4.0f, 4.0f, 5.0f, 4.0f, 6.25f)
                verticalLineToRelative(13.5f)
                curveTo(4.0f, 20.99f, 5.0f, 22.0f, 6.25f, 22.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(20.0f, 6.25f)
                curveTo(20.0f, 5.01f, 19.0f, 4.0f, 17.75f, 4.0f)
                horizontalLineToRelative(-1.76f)
                verticalLineToRelative(0.08f)
                close()
                moveTo(15.99f, 4.1f)
                lineToRelative(0.01f, 0.15f)
                lineTo(16.0f, 4.1f)
                close()
                moveTo(10.25f, 6.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.78f, 0.0f, 1.47f, -0.4f, 1.87f, -1.0f)
                horizontalLineToRelative(2.13f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(6.25f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(5.5f, 6.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.13f)
                curveToRelative(0.4f, 0.6f, 1.09f, 1.0f, 1.87f, 1.0f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        return _clipboardTask!!
    }

private var _clipboardTask: ImageVector? = null
