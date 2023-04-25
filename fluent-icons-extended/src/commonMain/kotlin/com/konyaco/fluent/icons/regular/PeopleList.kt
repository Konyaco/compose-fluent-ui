

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PeopleList: ImageVector
    get() {
        if (_peopleList != null) {
            return _peopleList!!
        }
        _peopleList = fluentIcon(name = "Regular.PeopleList") {
            fluentPath {
                moveTo(5.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                close()
                moveTo(8.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(15.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(17.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.28f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, 0.01f, 0.2f)
                curveToRelative(0.02f, 0.14f, 0.04f, 0.32f, 0.1f, 0.53f)
                curveToRelative(0.09f, 0.42f, 0.29f, 0.98f, 0.68f, 1.55f)
                curveTo(3.61f, 19.97f, 5.17f, 21.0f, 8.0f, 21.0f)
                curveToRelative(1.82f, 0.0f, 3.11f, -0.42f, 4.02f, -1.04f)
                curveToRelative(0.07f, -0.37f, 0.25f, -0.7f, 0.5f, -0.96f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, true, -0.51f, -1.1f)
                lineToRelative(-0.03f, 0.04f)
                curveToRelative(-0.5f, 0.71f, -1.56f, 1.56f, -3.98f, 1.56f)
                reflectiveCurveToRelative(-3.49f, -0.85f, -3.98f, -1.56f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, true, -0.52f, -1.43f)
                verticalLineToRelative(-0.26f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.1f, 0.0f, 0.2f, 0.02f, 0.28f, 0.05f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 0.4f, -1.45f)
                curveToRelative(-0.22f, -0.06f, -0.44f, -0.1f, -0.68f, -0.1f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(12.53f, 16.5f)
                lineTo(12.5f, 16.53f)
                verticalLineToRelative(-0.06f)
                lineToRelative(0.03f, 0.03f)
                close()
                moveTo(13.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(13.75f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(13.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        return _peopleList!!
    }

private var _peopleList: ImageVector? = null
