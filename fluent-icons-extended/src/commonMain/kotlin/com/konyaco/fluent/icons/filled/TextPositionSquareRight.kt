

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextPositionSquareRight: ImageVector
    get() {
        if (_textPositionSquareRight != null) {
            return _textPositionSquareRight!!
        }
        _textPositionSquareRight = fluentIcon(name = "Filled.TextPositionSquareRight") {
            fluentPath {
                moveTo(20.25f, 3.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(3.75f, 5.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(16.5f)
                close()
                moveTo(10.75f, 7.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(11.75f, 15.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(10.75f, 10.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(21.25f, 18.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(3.75f, 17.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(19.25f, 11.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -4.5f, 0.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(12.75f, 11.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 8.5f, 0.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(19.25f, 11.0f)
                close()
            }
        }
        return _textPositionSquareRight!!
    }

private var _textPositionSquareRight: ImageVector? = null
