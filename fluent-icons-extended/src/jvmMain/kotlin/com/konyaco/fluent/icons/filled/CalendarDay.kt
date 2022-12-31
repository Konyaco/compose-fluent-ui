

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarDay: ImageVector
    get() {
        if (_calendarDay != null) {
            return _calendarDay!!
        }
        _calendarDay = fluentIcon(name = "Filled.CalendarDay") {
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
                moveTo(16.25f, 11.0f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.74f)
                lineToRelative(0.1f, 0.01f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.74f, -0.65f)
                lineToRelative(0.01f, -0.1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.65f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                close()
                moveTo(15.5f, 12.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(16.25f, 7.25f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        return _calendarDay!!
    }

private var _calendarDay: ImageVector? = null
