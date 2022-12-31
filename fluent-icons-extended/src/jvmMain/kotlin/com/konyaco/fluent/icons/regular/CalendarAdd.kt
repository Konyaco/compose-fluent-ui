

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CalendarAdd: ImageVector
    get() {
        if (_calendarAdd != null) {
            return _calendarAdd!!
        }
        _calendarAdd = fluentIcon(name = "Regular.CalendarAdd") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
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
                moveTo(17.5f, 14.0f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.41f)
                lineToRelative(-0.01f, 0.09f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(-2.59f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.41f)
                lineToRelative(-0.01f, 0.09f)
                verticalLineToRelative(0.09f)
                curveToRelative(0.05f, 0.2f, 0.2f, 0.36f, 0.41f, 0.4f)
                lineToRelative(0.09f, 0.01f)
                lineTo(17.0f, 18.0f)
                verticalLineToRelative(2.59f)
                curveToRelative(0.05f, 0.2f, 0.2f, 0.36f, 0.41f, 0.4f)
                lineToRelative(0.09f, 0.01f)
                horizontalLineToRelative(0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.41f)
                lineToRelative(0.01f, -0.09f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(2.59f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.41f)
                lineToRelative(0.01f, -0.09f)
                verticalLineToRelative(-0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.41f, -0.4f)
                lineTo(20.5f, 17.0f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-2.59f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.41f, -0.4f)
                lineTo(17.5f, 14.0f)
                close()
                moveTo(17.75f, 4.5f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(4.5f, 7.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
            }
        }
        return _calendarAdd!!
    }

private var _calendarAdd: ImageVector? = null
