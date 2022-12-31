

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardMonth: ImageVector
    get() {
        if (_clipboardMonth != null) {
            return _clipboardMonth!!
        }
        _clipboardMonth = fluentIcon(name = "Filled.ClipboardMonth") {
            fluentPath {
                moveTo(13.75f, 2.0f)
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
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.24f, -2.0f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(8.25f, 12.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 2.5f)
                close()
                moveTo(8.25f, 16.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 2.5f)
                close()
                moveTo(17.5f, 11.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(12.25f, 12.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 2.5f)
                close()
                moveTo(13.5f, 15.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
            }
        }
        return _clipboardMonth!!
    }

private var _clipboardMonth: ImageVector? = null
