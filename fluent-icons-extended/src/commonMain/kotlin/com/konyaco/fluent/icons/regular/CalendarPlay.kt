

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CalendarPlay: ImageVector
    get() {
        if (_calendarPlay != null) {
            return _calendarPlay!!
        }
        _calendarPlay = fluentIcon(name = "Regular.CalendarPlay") {
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
                curveToRelative(0.18f, 0.53f, 0.42f, 1.04f, 0.71f, 1.5f)
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
