

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextPositionLine: ImageVector
    get() {
        if (_textPositionLine != null) {
            return _textPositionLine!!
        }
        _textPositionLine = fluentIcon(name = "Filled.TextPositionLine") {
            fluentPath {
                moveTo(3.75f, 3.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(3.75f, 3.75f)
                close()
                moveTo(7.0f, 8.75f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(2.75f, 11.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 8.5f, 0.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(9.25f, 11.0f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                close()
                moveTo(13.75f, 14.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(3.75f, 17.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(3.75f, 17.75f)
                close()
            }
        }
        return _textPositionLine!!
    }

private var _textPositionLine: ImageVector? = null
