

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarPlay: ImageVector
    get() {
        if (_calendarPlay != null) {
            return _calendarPlay!!
        }
        _calendarPlay = fluentIcon(name = "Filled.CalendarPlay") {
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
                moveTo(17.5f, 23.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(16.6f, 15.0f)
                curveToRelative(0.11f, 0.0f, 0.22f, 0.03f, 0.31f, 0.1f)
                lineToRelative(2.81f, 1.84f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.28f, 0.52f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, -0.11f, 0.36f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.16f, 0.16f)
                lineToRelative(-2.8f, 1.92f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, -0.17f, 0.07f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.4f, -0.02f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.18f, -0.13f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.18f, -0.44f)
                verticalLineToRelative(-3.76f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.37f, -0.57f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.23f, -0.05f)
                close()
            }
        }
        return _calendarPlay!!
    }

private var _calendarPlay: ImageVector? = null
