

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ProjectionScreenText: ImageVector
    get() {
        if (_projectionScreenText != null) {
            return _projectionScreenText!!
        }
        _projectionScreenText = fluentIcon(name = "Regular.ProjectionScreenText") {
            fluentPath {
                moveTo(9.0f, 7.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.0f, 7.75f)
                close()
                moveTo(9.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(8.75f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(2.0f, 4.5f)
                curveTo(2.0f, 3.67f, 2.67f, 3.0f, 3.5f, 3.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.5f, 2.91f)
                verticalLineToRelative(7.34f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 17.25f, 17.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.5f)
                lineTo(11.25f, 17.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 3.0f, 13.25f)
                lineTo(3.0f, 5.91f)
                curveToRelative(-0.58f, -0.2f, -1.0f, -0.76f, -1.0f, -1.41f)
                close()
                moveTo(19.5f, 6.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(7.25f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(19.5f, 6.0f)
                close()
            }
        }
        return _projectionScreenText!!
    }

private var _projectionScreenText: ImageVector? = null
