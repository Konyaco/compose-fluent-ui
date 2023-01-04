

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BorderLeftRight: ImageVector
    get() {
        if (_borderLeftRight != null) {
            return _borderLeftRight!!
        }
        _borderLeftRight = fluentIcon(name = "Filled.BorderLeftRight") {
            fluentPath {
                moveTo(17.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(19.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(13.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(3.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
            }
        }
        return _borderLeftRight!!
    }

private var _borderLeftRight: ImageVector? = null
