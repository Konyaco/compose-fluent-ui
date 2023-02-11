

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarMultiple: ImageVector
    get() {
        if (_calendarMultiple != null) {
            return _calendarMultiple!!
        }
        _calendarMultiple = fluentIcon(name = "Filled.CalendarMultiple") {
            fluentPath {
                moveTo(20.0f, 5.0f)
                verticalLineToRelative(11.35f)
                arcTo(3.65f, 3.65f, 0.0f, false, true, 16.35f, 20.0f)
                horizontalLineTo(5.01f)
                curveToRelative(0.57f, 0.9f, 1.59f, 1.5f, 2.74f, 1.5f)
                horizontalLineToRelative(8.6f)
                curveToRelative(2.84f, 0.0f, 5.15f, -2.3f, 5.15f, -5.15f)
                verticalLineToRelative(-8.6f)
                curveToRelative(0.0f, -1.15f, -0.6f, -2.17f, -1.5f, -2.74f)
                close()
                moveTo(2.0f, 7.5f)
                verticalLineToRelative(8.25f)
                curveTo(2.0f, 17.55f, 3.46f, 19.0f, 5.25f, 19.0f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(2.0f)
                close()
                moveTo(5.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-0.75f)
                curveTo(19.0f, 3.45f, 17.54f, 2.0f, 15.75f, 2.0f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        return _calendarMultiple!!
    }

private var _calendarMultiple: ImageVector? = null
