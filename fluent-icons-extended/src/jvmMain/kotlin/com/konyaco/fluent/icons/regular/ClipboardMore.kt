

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ClipboardMore: ImageVector
    get() {
        if (_clipboardMore != null) {
            return _clipboardMore!!
        }
        _clipboardMore = fluentIcon(name = "Regular.ClipboardMore") {
            fluentPath {
                moveTo(15.99f, 4.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.24f, -2.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.16f, 0.0f, -2.11f, 0.87f, -2.24f, 2.0f)
                lineTo(6.25f, 4.0f)
                curveTo(5.01f, 4.0f, 4.0f, 5.0f, 4.0f, 6.25f)
                verticalLineToRelative(13.5f)
                curveTo(4.0f, 20.99f, 5.0f, 22.0f, 6.25f, 22.0f)
                lineTo(8.5f, 22.0f)
                curveToRelative(-0.31f, -0.42f, -0.5f, -0.94f, -0.5f, -1.5f)
                lineTo(6.25f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(5.5f, 6.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.13f)
                curveToRelative(0.4f, 0.6f, 1.09f, 1.0f, 1.87f, 1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.78f, 0.0f, 1.47f, -0.4f, 1.87f, -1.0f)
                horizontalLineToRelative(2.13f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(18.5f, 19.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.5f, -0.95f)
                lineTo(20.0f, 6.25f)
                curveTo(20.0f, 5.01f, 19.0f, 4.0f, 17.75f, 4.0f)
                horizontalLineToRelative(-1.76f)
                close()
                moveTo(15.99f, 4.1f)
                lineToRelative(0.01f, 0.15f)
                lineTo(16.0f, 4.1f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(15.5f, 22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(20.5f, 22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
        }
        return _clipboardMore!!
    }

private var _clipboardMore: ImageVector? = null
