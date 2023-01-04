

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardMore: ImageVector
    get() {
        if (_clipboardMore != null) {
            return _clipboardMore!!
        }
        _clipboardMore = fluentIcon(name = "Filled.ClipboardMore") {
            fluentPath {
                moveTo(10.25f, 3.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(13.75f, 2.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.16f, 0.0f, -2.11f, 0.87f, -2.24f, 2.0f)
                lineTo(6.25f, 4.0f)
                curveTo(5.01f, 4.0f, 4.0f, 5.0f, 4.0f, 6.25f)
                verticalLineToRelative(13.5f)
                curveTo(4.0f, 20.99f, 5.0f, 22.0f, 6.25f, 22.0f)
                lineTo(8.5f, 22.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 4.5f, -1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                curveToRelative(0.0f, -1.2f, 0.86f, -2.22f, 2.0f, -2.45f)
                lineTo(20.0f, 6.25f)
                curveTo(20.0f, 5.01f, 19.0f, 4.0f, 17.75f, 4.0f)
                horizontalLineToRelative(-1.76f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.24f, -2.0f)
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
