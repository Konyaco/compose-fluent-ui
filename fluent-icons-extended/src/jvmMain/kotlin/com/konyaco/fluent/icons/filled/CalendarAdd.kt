

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarAdd: ImageVector
    get() {
        if (_calendarAdd != null) {
            return _calendarAdd!!
        }
        _calendarAdd = fluentIcon(name = "Filled.CalendarAdd") {
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
        return _calendarAdd!!
    }

private var _calendarAdd: ImageVector? = null
