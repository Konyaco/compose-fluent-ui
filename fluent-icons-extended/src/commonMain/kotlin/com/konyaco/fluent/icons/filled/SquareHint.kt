

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SquareHint: ImageVector
    get() {
        if (_squareHint != null) {
            return _squareHint!!
        }
        _squareHint = fluentIcon(name = "Filled.SquareHint") {
            fluentPath {
                moveTo(10.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(17.5f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 21.0f, 6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                curveTo(5.67f, 5.0f, 5.0f, 5.67f, 5.0f, 6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 6.5f, 3.0f)
                close()
                moveTo(4.0f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 17.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(3.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        return _squareHint!!
    }

private var _squareHint: ImageVector? = null
