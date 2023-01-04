

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PeopleError: ImageVector
    get() {
        if (_peopleError != null) {
            return _peopleError!!
        }
        _peopleError = fluentIcon(name = "Filled.PeopleError") {
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
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.28f, -0.61f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 1.36f, -6.2f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, false, -0.89f, -0.19f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(17.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(17.5f, 21.13f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, false, 0.0f, -1.25f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, 0.0f, 1.25f)
                close()
            }
        }
        return _peopleError!!
    }

private var _peopleError: ImageVector? = null
