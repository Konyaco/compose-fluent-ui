

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarChat: ImageVector
    get() {
        if (_calendarChat != null) {
            return _calendarChat!!
        }
        _calendarChat = fluentIcon(name = "Filled.CalendarChat") {
            fluentPath {
                moveTo(21.0f, 8.5f)
                verticalLineToRelative(3.52f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, -10.0f, 5.48f)
                curveToRelative(0.0f, 0.99f, 0.22f, 1.92f, 0.61f, 2.76f)
                lineToRelative(-0.22f, 0.74f)
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
                moveTo(21.0f, 13.26f)
                arcTo(5.48f, 5.48f, 0.0f, false, false, 17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -4.81f, 8.17f)
                lineToRelative(-0.67f, 2.19f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.63f, 0.62f)
                lineToRelative(2.18f, -0.67f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 21.0f, 13.25f)
                close()
                moveTo(15.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(17.5f, 19.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                close()
            }
        }
        return _calendarChat!!
    }

private var _calendarChat: ImageVector? = null
