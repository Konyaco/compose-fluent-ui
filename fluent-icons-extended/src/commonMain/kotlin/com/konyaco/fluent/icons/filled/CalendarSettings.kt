

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarSettings: ImageVector
    get() {
        if (_calendarSettings != null) {
            return _calendarSettings!!
        }
        _calendarSettings = fluentIcon(name = "Filled.CalendarSettings") {
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
                moveTo(14.28f, 13.98f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.44f, 2.5f)
                lineToRelative(-0.58f, 0.14f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, 0.0f, 1.8f)
                lineToRelative(0.54f, 0.13f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.45f, 2.51f)
                lineToRelative(-0.18f, 0.64f)
                curveToRelative(0.43f, 0.38f, 0.93f, 0.7f, 1.48f, 0.92f)
                lineToRelative(0.5f, -0.52f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.9f, 0.0f)
                lineToRelative(0.5f, 0.52f)
                arcToRelative(5.28f, 5.28f, 0.0f, false, false, 1.47f, -0.9f)
                lineToRelative(-0.2f, -0.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.45f, -2.5f)
                lineToRelative(0.58f, -0.14f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, 0.0f, -1.8f)
                lineToRelative(-0.55f, -0.13f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.45f, -2.51f)
                lineToRelative(0.2f, -0.63f)
                curveToRelative(-0.45f, -0.39f, -0.95f, -0.7f, -1.5f, -0.93f)
                lineToRelative(-0.49f, 0.52f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.9f, 0.0f)
                lineToRelative(-0.5f, -0.52f)
                curveToRelative(-0.54f, 0.22f, -1.04f, 0.53f, -1.48f, 0.91f)
                lineToRelative(0.2f, 0.69f)
                close()
                moveTo(17.5f, 19.0f)
                curveToRelative(-0.8f, 0.0f, -1.45f, -0.67f, -1.45f, -1.5f)
                reflectiveCurveTo(16.7f, 16.0f, 17.5f, 16.0f)
                curveToRelative(0.8f, 0.0f, 1.45f, 0.67f, 1.45f, 1.5f)
                reflectiveCurveTo(18.3f, 19.0f, 17.5f, 19.0f)
                close()
            }
        }
        return _calendarSettings!!
    }

private var _calendarSettings: ImageVector? = null
