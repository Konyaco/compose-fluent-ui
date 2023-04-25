

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowForwardDownPerson: ImageVector
    get() {
        if (_arrowForwardDownPerson != null) {
            return _arrowForwardDownPerson!!
        }
        _arrowForwardDownPerson = fluentIcon(name = "Regular.ArrowForwardDownPerson") {
            fluentPath {
                moveToRelative(19.69f, 9.5f)
                lineToRelative(-2.96f, -2.96f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.97f, -1.14f)
                lineToRelative(0.09f, 0.08f)
                lineToRelative(4.24f, 4.24f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.68f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-4.24f, 4.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.14f, -0.97f)
                lineToRelative(0.08f, -0.09f)
                lineTo(19.69f, 11.0f)
                lineTo(14.0f, 11.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, -7.75f, -7.5f)
                verticalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 6.02f, 6.25f)
                lineTo(19.7f, 9.5f)
                close()
                moveTo(9.0f, 13.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(11.0f, 18.88f)
                curveTo(11.0f, 20.43f, 9.71f, 22.0f, 6.5f, 22.0f)
                reflectiveCurveTo(2.0f, 20.44f, 2.0f, 18.88f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.99f, 0.8f, -1.78f, 1.77f, -1.78f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.98f, 0.0f, 1.77f, 0.8f, 1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                close()
            }
        }
        return _arrowForwardDownPerson!!
    }

private var _arrowForwardDownPerson: ImageVector? = null
