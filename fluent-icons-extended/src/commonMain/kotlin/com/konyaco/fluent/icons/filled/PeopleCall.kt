

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleCall: ImageVector
    get() {
        if (_peopleCall != null) {
            return _peopleCall!!
        }
        _peopleCall = fluentIcon(name = "Filled.PeopleCall") {
            fluentPath {
                moveTo(8.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(17.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
                moveTo(4.25f, 13.0f)
                curveTo(3.01f, 13.0f, 2.0f, 14.0f, 2.0f, 15.25f)
                verticalLineToRelative(0.25f)
                reflectiveCurveTo(2.0f, 20.0f, 8.0f, 20.0f)
                reflectiveCurveToRelative(6.0f, -4.5f, 6.0f, -4.5f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(18.19f, 14.0f)
                lineTo(18.67f, 12.79f)
                curveToRelative(0.24f, -0.61f, 0.92f, -0.93f, 1.55f, -0.73f)
                lineToRelative(0.43f, 0.14f)
                curveToRelative(0.72f, 0.24f, 1.32f, 0.8f, 1.35f, 1.57f)
                curveToRelative(0.1f, 3.11f, -2.48f, 7.58f, -5.22f, 9.06f)
                curveToRelative(-0.67f, 0.36f, -1.46f, 0.12f, -2.03f, -0.4f)
                lineToRelative(-0.34f, -0.3f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -0.14f, -1.7f)
                lineToRelative(0.8f, -1.02f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.22f, -0.42f)
                lineToRelative(1.3f, 0.32f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, false, 1.77f, -3.08f)
                lineToRelative(-0.92f, -0.96f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.25f, -1.28f)
                close()
            }
        }
        return _peopleCall!!
    }

private var _peopleCall: ImageVector? = null
