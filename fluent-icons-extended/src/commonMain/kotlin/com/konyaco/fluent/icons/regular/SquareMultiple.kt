

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SquareMultiple: ImageVector
    get() {
        if (_squareMultiple != null) {
            return _squareMultiple!!
        }
        _squareMultiple = fluentIcon(name = "Regular.SquareMultiple") {
            fluentPath {
                moveTo(7.52f, 5.0f)
                horizontalLineTo(6.0f)
                curveToRelative(0.13f, -1.68f, 1.53f, -3.0f, 3.24f, -3.0f)
                horizontalLineToRelative(8.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.0f, 3.24f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.85f, -0.13f, 1.5f, -0.86f, 1.5f, -1.74f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.88f, 0.0f, -1.61f, 0.65f, -1.73f, 1.5f)
                close()
                moveTo(5.25f, 6.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 9.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 20.55f, 3.46f, 22.0f, 5.25f, 22.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.5f)
                curveTo(18.0f, 7.45f, 16.55f, 6.0f, 14.75f, 6.0f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(3.5f, 9.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                close()
            }
        }
        return _squareMultiple!!
    }

private var _squareMultiple: ImageVector? = null
