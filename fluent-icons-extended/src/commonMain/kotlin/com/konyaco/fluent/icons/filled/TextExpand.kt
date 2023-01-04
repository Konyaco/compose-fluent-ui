

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextExpand: ImageVector
    get() {
        if (_textExpand != null) {
            return _textExpand!!
        }
        _textExpand = fluentIcon(name = "Filled.TextExpand") {
            fluentPath {
                moveTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(7.0f, 18.0f)
                close()
                moveTo(13.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(6.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(7.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(13.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 11.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 9.0f, 0.0f)
                close()
                moveTo(7.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(6.0f, 11.0f)
                lineTo(4.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(6.0f, 12.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(7.0f, 12.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 9.5f)
                close()
            }
        }
        return _textExpand!!
    }

private var _textExpand: ImageVector? = null
