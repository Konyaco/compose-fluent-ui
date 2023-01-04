

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarEmpty: ImageVector
    get() {
        if (_calendarEmpty != null) {
            return _calendarEmpty!!
        }
        _calendarEmpty = fluentIcon(name = "Filled.CalendarEmpty") {
            fluentPath {
                moveTo(21.0f, 8.5f)
                verticalLineToRelative(9.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineTo(6.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-0.75f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
            }
        }
        return _calendarEmpty!!
    }

private var _calendarEmpty: ImageVector? = null
