

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarWeekNumbers: ImageVector
    get() {
        if (_calendarWeekNumbers != null) {
            return _calendarWeekNumbers!!
        }
        _calendarWeekNumbers = fluentIcon(name = "Filled.CalendarWeekNumbers") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(8.49f, 7.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.49f, 0.1f)
                verticalLineToRelative(1.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                verticalLineToRelative(-1.1f)
                close()
                moveTo(8.49f, 15.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.49f, 0.1f)
                verticalLineToRelative(1.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                verticalLineToRelative(-1.1f)
                close()
                moveTo(7.76f, 10.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(7.0f, 12.57f)
                verticalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                verticalLineToRelative(-1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.74f, -0.65f)
                close()
            }
        }
        return _calendarWeekNumbers!!
    }

private var _calendarWeekNumbers: ImageVector? = null
