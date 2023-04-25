

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.People: ImageVector
    get() {
        if (_people != null) {
            return _people!!
        }
        _people = fluentIcon(name = "Filled.People") {
            fluentPath {
                moveTo(8.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(17.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
                moveTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.25f)
                reflectiveCurveTo(2.0f, 21.0f, 8.0f, 21.0f)
                reflectiveCurveToRelative(6.0f, -4.5f, 6.0f, -4.5f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(17.0f, 19.5f)
                arcToRelative(7.33f, 7.33f, 0.0f, false, true, -2.75f, -0.46f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.75f, -2.49f)
                verticalLineToRelative(-0.3f)
                curveToRelative(0.0f, -0.87f, -0.34f, -1.66f, -0.9f, -2.25f)
                lineTo(19.8f, 14.0f)
                curveToRelative(1.22f, 0.0f, 2.2f, 0.98f, 2.2f, 2.2f)
                curveToRelative(0.0f, 0.0f, 0.0f, 3.3f, -5.0f, 3.3f)
                close()
            }
        }
        return _people!!
    }

private var _people: ImageVector? = null
