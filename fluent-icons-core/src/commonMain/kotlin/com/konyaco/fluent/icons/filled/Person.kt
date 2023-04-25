

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = fluentIcon(name = "Filled.Person") {
            fluentPath {
                moveTo(17.75f, 14.0f)
                curveTo(19.0f, 14.0f, 20.0f, 15.0f, 20.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, -0.18f, 1.13f, -0.5f, 1.6f)
                curveTo(17.93f, 20.93f, 15.41f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(-5.94f, -1.07f, -7.49f, -3.24f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.5f, -1.6f)
                verticalLineToRelative(-0.91f)
                curveTo(4.0f, 15.0f, 5.0f, 14.0f, 6.24f, 14.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
            }
        }
        return _person!!
    }

private var _person: ImageVector? = null
