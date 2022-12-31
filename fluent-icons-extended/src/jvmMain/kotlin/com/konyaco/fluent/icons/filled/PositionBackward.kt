

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PositionBackward: ImageVector
    get() {
        if (_positionBackward != null) {
            return _positionBackward!!
        }
        _positionBackward = fluentIcon(name = "Filled.PositionBackward") {
            fluentPath {
                moveTo(16.5f, 6.5f)
                horizontalLineToRelative(-5.75f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.25f, 4.25f)
                verticalLineToRelative(5.75f)
                lineTo(5.25f, 16.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 13.25f)
                verticalLineToRelative(-8.0f)
                curveTo(2.0f, 3.45f, 3.46f, 2.0f, 5.25f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                lineTo(16.5f, 6.5f)
                close()
                moveTo(22.0f, 18.75f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.25f, -3.25f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.8f, 1.46f, -3.25f, 3.25f, -3.25f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(18.75f, 20.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-8.0f)
                curveTo(9.78f, 9.0f, 9.0f, 9.78f, 9.0f, 10.75f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        return _positionBackward!!
    }

private var _positionBackward: ImageVector? = null
