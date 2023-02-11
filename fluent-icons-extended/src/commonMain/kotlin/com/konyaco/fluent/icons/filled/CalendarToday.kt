

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarToday: ImageVector
    get() {
        if (_calendarToday != null) {
            return _calendarToday!!
        }
        _calendarToday = fluentIcon(name = "Filled.CalendarToday") {
            fluentPath {
                moveTo(13.25f, 11.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(21.0f, 8.5f)
                verticalLineToRelative(9.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.75f, 19.43f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.66f, -2.99f)
                lineToRelative(-2.25f, -2.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -2.32f, 0.0f)
                lineToRelative(-2.25f, 2.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.66f, 2.99f)
                lineTo(10.25f, 21.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 8.5f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(-0.75f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(14.81f, 18.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.06f)
                lineToRelative(-1.0f, -0.89f)
                verticalLineToRelative(3.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.83f)
                lineToRelative(-1.0f, 0.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.0f, -1.13f)
                lineToRelative(2.25f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.0f, 0.0f)
                lineToRelative(2.25f, 2.0f)
                curveToRelative(0.3f, 0.27f, 0.34f, 0.75f, 0.06f, 1.06f)
                close()
            }
        }
        return _calendarToday!!
    }

private var _calendarToday: ImageVector? = null
