

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarPerson: ImageVector
    get() {
        if (_calendarPerson != null) {
            return _calendarPerson!!
        }
        _calendarPerson = fluentIcon(name = "Filled.CalendarPerson") {
            fluentPath {
                moveTo(21.0f, 12.05f)
                lineTo(21.0f, 8.5f)
                lineTo(3.0f, 8.5f)
                verticalLineToRelative(9.25f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(6.92f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, -0.17f, -1.13f)
                verticalLineToRelative(-0.1f)
                arcTo(2.77f, 2.77f, 0.0f, false, true, 15.77f, 17.0f)
                horizontalLineToRelative(0.28f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, 2.45f, -6.0f)
                curveToRelative(0.98f, 0.0f, 1.86f, 0.4f, 2.5f, 1.05f)
                close()
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(21.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(23.0f, 19.88f)
                curveToRelative(0.0f, 1.55f, -1.29f, 3.12f, -4.5f, 3.12f)
                reflectiveCurveTo(14.0f, 21.44f, 14.0f, 19.87f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.98f, 0.8f, -1.77f, 1.77f, -1.77f)
                horizontalLineToRelative(5.46f)
                curveToRelative(0.98f, 0.0f, 1.77f, 0.8f, 1.77f, 1.77f)
                verticalLineToRelative(0.1f)
                close()
            }
        }
        return _calendarPerson!!
    }

private var _calendarPerson: ImageVector? = null
