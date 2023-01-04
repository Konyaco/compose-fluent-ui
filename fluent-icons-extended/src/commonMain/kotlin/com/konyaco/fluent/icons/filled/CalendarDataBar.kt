

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarDataBar: ImageVector
    get() {
        if (_calendarDataBar != null) {
            return _calendarDataBar!!
        }
        _calendarDataBar = fluentIcon(name = "Filled.CalendarDataBar") {
            fluentPath {
                moveTo(21.0f, 8.5f)
                verticalLineToRelative(4.55f)
                curveToRelative(-0.37f, 0.07f, -0.7f, 0.23f, -1.0f, 0.45f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.0f, 2.0f)
                lineTo(11.0f, 21.0f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 8.5f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(-0.75f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(17.5f, 12.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 16.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.0f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        return _calendarDataBar!!
    }

private var _calendarDataBar: ImageVector? = null
