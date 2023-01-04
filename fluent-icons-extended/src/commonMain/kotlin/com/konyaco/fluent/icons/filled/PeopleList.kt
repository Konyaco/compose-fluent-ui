

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleList: ImageVector
    get() {
        if (_peopleList != null) {
            return _peopleList!!
        }
        _peopleList = fluentIcon(name = "Filled.PeopleList") {
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
                curveToRelative(1.85f, 0.0f, 3.14f, -0.43f, 4.02f, -1.02f)
                curveToRelative(0.06f, -0.38f, 0.24f, -0.72f, 0.5f, -0.98f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, true, 0.0f, -2.5f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, true, -0.1f, -2.4f)
                curveToRelative(-0.2f, -0.06f, -0.43f, -0.1f, -0.67f, -0.1f)
                horizontalLineToRelative(-7.5f)
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
