

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarCancel: ImageVector
    get() {
        if (_calendarCancel != null) {
            return _calendarCancel!!
        }
        _calendarCancel = fluentIcon(name = "Filled.CalendarCancel") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(15.02f, 15.02f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.71f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(-1.76f, 1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.7f, 0.7f)
                lineToRelative(1.77f, -1.76f)
                lineToRelative(1.77f, 1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.7f, -0.71f)
                lineToRelative(-1.76f, -1.77f)
                lineToRelative(1.77f, -1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineToRelative(-1.78f, 1.76f)
                lineToRelative(-1.77f, -1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                close()
                moveTo(21.0f, 8.5f)
                verticalLineToRelative(3.52f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 12.02f, 21.0f)
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
            }
        }
        return _calendarCancel!!
    }

private var _calendarCancel: ImageVector? = null
