

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CalendarMultiple: ImageVector
    get() {
        if (_calendarMultiple != null) {
            return _calendarMultiple!!
        }
        _calendarMultiple = fluentIcon(name = "Regular.CalendarMultiple") {
            fluentPath {
                moveTo(20.0f, 5.0f)
                verticalLineToRelative(11.35f)
                arcTo(3.65f, 3.65f, 0.0f, false, true, 16.35f, 20.0f)
                lineTo(5.01f, 20.0f)
                curveToRelative(0.57f, 0.9f, 1.59f, 1.5f, 2.74f, 1.5f)
                horizontalLineToRelative(8.6f)
                curveToRelative(2.84f, 0.0f, 5.15f, -2.3f, 5.15f, -5.15f)
                verticalLineToRelative(-8.6f)
                curveToRelative(0.0f, -1.15f, -0.6f, -2.17f, -1.5f, -2.74f)
                close()
                moveTo(5.24f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                verticalLineToRelative(10.5f)
                curveTo(2.0f, 17.55f, 3.46f, 19.0f, 5.25f, 19.0f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(19.0f, 5.25f)
                curveTo(19.0f, 3.45f, 17.54f, 2.0f, 15.75f, 2.0f)
                lineTo(5.25f, 2.0f)
                close()
                moveTo(3.5f, 7.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(5.25f, 17.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(3.5f, 7.5f)
                close()
                moveTo(5.25f, 3.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(17.5f, 6.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                close()
            }
        }
        return _calendarMultiple!!
    }

private var _calendarMultiple: ImageVector? = null
