

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowForwardDownPerson: ImageVector
    get() {
        if (_arrowForwardDownPerson != null) {
            return _arrowForwardDownPerson!!
        }
        _arrowForwardDownPerson = fluentIcon(name = "Filled.ArrowForwardDownPerson") {
            fluentPath {
                moveTo(16.3f, 5.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.41f, -1.4f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.41f, -1.4f)
                lineToRelative(3.29f, -3.3f)
                lineTo(13.0f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -7.75f)
                lineTo(5.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.78f, 6.0f)
                horizontalLineToRelative(6.81f)
                lineToRelative(-3.3f, -3.3f)
                close()
                moveTo(9.0f, 13.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(11.0f, 18.88f)
                curveTo(11.0f, 20.43f, 9.71f, 22.0f, 6.5f, 22.0f)
                reflectiveCurveTo(2.0f, 20.44f, 2.0f, 18.87f)
                verticalLineToRelative(-0.1f)
                curveTo(2.0f, 17.8f, 2.8f, 17.0f, 3.77f, 17.0f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.98f, 0.0f, 1.77f, 0.8f, 1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                close()
            }
        }
        return _arrowForwardDownPerson!!
    }

private var _arrowForwardDownPerson: ImageVector? = null
