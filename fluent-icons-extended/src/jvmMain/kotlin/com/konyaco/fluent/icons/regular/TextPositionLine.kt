

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextPositionLine: ImageVector
    get() {
        if (_textPositionLine != null) {
            return _textPositionLine!!
        }
        _textPositionLine = fluentIcon(name = "Regular.TextPositionLine") {
            fluentPath {
                moveTo(3.75f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.75f, 4.0f)
                close()
                moveTo(7.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 11.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(3.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(9.5f, 11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.0f, 8.5f)
                close()
                moveTo(13.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(3.75f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.75f, 18.0f)
                close()
            }
        }
        return _textPositionLine!!
    }

private var _textPositionLine: ImageVector? = null
