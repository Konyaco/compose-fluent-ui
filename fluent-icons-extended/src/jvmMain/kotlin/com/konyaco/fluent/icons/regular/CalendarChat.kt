

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CalendarChat: ImageVector
    get() {
        if (_calendarChat != null) {
            return _calendarChat!!
        }
        _calendarChat = fluentIcon(name = "Regular.CalendarChat") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(5.77f)
                curveToRelative(-0.46f, -0.3f, -0.97f, -0.53f, -1.5f, -0.7f)
                lineTo(19.5f, 8.5f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(9.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(5.06f)
                curveToRelative(0.09f, 0.26f, 0.19f, 0.52f, 0.3f, 0.76f)
                lineToRelative(-0.22f, 0.74f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(17.75f, 4.5f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(4.5f, 7.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(19.5f, 12.37f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -4.67f, 9.94f)
                lineToRelative(-2.18f, 0.67f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.63f, -0.62f)
                lineToRelative(0.67f, -2.2f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.48f, 12.0f)
                lineToRelative(0.02f, 0.01f)
                curveToRelative(0.7f, 0.0f, 1.38f, 0.13f, 2.0f, 0.37f)
                close()
                moveTo(19.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(15.5f, 19.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                close()
            }
        }
        return _calendarChat!!
    }

private var _calendarChat: ImageVector? = null
