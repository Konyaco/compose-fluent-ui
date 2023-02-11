

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarSync: ImageVector
    get() {
        if (_calendarSync != null) {
            return _calendarSync!!
        }
        _calendarSync = fluentIcon(name = "Filled.CalendarSync") {
            fluentPath {
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
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -11.0f, 0.0f)
                close()
                moveTo(20.5f, 14.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.03f, 0.04f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.8f, -0.59f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 5.33f, -0.4f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(15.0f, 19.95f)
                verticalLineToRelative(0.55f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.91f, 0.11f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.77f, 0.65f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -5.18f, 0.19f)
                close()
            }
        }
        return _calendarSync!!
    }

private var _calendarSync: ImageVector? = null
