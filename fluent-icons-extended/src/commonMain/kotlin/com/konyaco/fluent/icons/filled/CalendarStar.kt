

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) {
            return _calendarStar!!
        }
        _calendarStar = fluentIcon(name = "Filled.CalendarStar") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(21.0f, 8.5f)
                verticalLineToRelative(3.52f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 12.02f, 21.0f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 8.5f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(16.98f, 14.05f)
                lineTo(16.94f, 14.15f)
                lineTo(16.39f, 15.93f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(-0.54f, 0.0f, -0.78f, 0.67f, -0.42f, 1.04f)
                lineToRelative(0.07f, 0.06f)
                lineToRelative(1.46f, 1.1f)
                lineToRelative(-0.56f, 1.8f)
                curveToRelative(-0.16f, 0.52f, 0.38f, 0.97f, 0.82f, 0.72f)
                lineToRelative(0.08f, -0.05f)
                lineToRelative(1.46f, -1.1f)
                lineToRelative(1.46f, 1.1f)
                curveToRelative(0.43f, 0.33f, 1.0f, -0.07f, 0.92f, -0.58f)
                lineToRelative(-0.02f, -0.1f)
                lineToRelative(-0.56f, -1.78f)
                lineToRelative(1.46f, -1.1f)
                curveToRelative(0.43f, -0.33f, 0.25f, -1.02f, -0.25f, -1.1f)
                lineTo(18.61f, 15.94f)
                lineToRelative(-0.55f, -1.8f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -1.08f, -0.1f)
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
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
