

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PositionForward: ImageVector
    get() {
        if (_positionForward != null) {
            return _positionForward!!
        }
        _positionForward = fluentIcon(name = "Filled.PositionForward") {
            fluentPath {
                moveTo(13.25f, 16.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-8.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(7.5f, 17.5f)
                lineTo(9.0f, 17.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(17.5f, 9.0f)
                lineTo(17.5f, 7.5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.25f, -3.25f)
                lineTo(7.5f, 17.5f)
                close()
            }
        }
        return _positionForward!!
    }

private var _positionForward: ImageVector? = null
