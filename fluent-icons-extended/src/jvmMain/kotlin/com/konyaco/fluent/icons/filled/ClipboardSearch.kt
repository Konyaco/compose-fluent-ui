

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardSearch: ImageVector
    get() {
        if (_clipboardSearch != null) {
            return _clipboardSearch!!
        }
        _clipboardSearch = fluentIcon(name = "Filled.ClipboardSearch") {
            fluentPath {
                moveTo(13.75f, 2.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.16f, 0.0f, -2.11f, 0.87f, -2.24f, 2.0f)
                lineTo(6.25f, 4.0f)
                curveTo(5.01f, 4.0f, 4.0f, 5.0f, 4.0f, 6.25f)
                verticalLineToRelative(3.85f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 7.25f, 7.67f)
                lineToRelative(2.24f, 2.24f)
                curveToRelative(0.53f, 0.54f, 0.65f, 1.34f, 0.34f, 1.99f)
                horizontalLineToRelative(3.92f)
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
                moveTo(9.95f, 17.89f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -1.15f, 0.98f)
                lineToRelative(2.92f, 2.91f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.83f, -2.83f)
                close()
                moveTo(6.5f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        return _clipboardSearch!!
    }

private var _clipboardSearch: ImageVector? = null
