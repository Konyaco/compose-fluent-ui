

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarError: ImageVector
    get() {
        if (_calendarError != null) {
            return _calendarError!!
        }
        _calendarError = fluentIcon(name = "Filled.CalendarError") {
            fluentPath {
                moveTo(21.0f, 12.02f)
                lineTo(21.0f, 8.5f)
                lineTo(3.0f, 8.5f)
                verticalLineToRelative(9.25f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(5.77f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 21.0f, 12.02f)
                close()
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(17.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.13f, 20.5f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, true, -1.25f, 0.0f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 1.25f, 0.0f)
                close()
            }
        }
        return _calendarError!!
    }

private var _calendarError: ImageVector? = null
