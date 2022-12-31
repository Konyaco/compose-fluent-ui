

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarAgenda: ImageVector
    get() {
        if (_calendarAgenda != null) {
            return _calendarAgenda!!
        }
        _calendarAgenda = fluentIcon(name = "Filled.CalendarAgenda") {
            fluentPath {
                moveTo(21.0f, 17.75f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(17.0f, 7.75f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.65f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(17.0f, 16.25f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.65f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.65f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.7f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 17.0f, 12.0f)
                close()
            }
        }
        return _calendarAgenda!!
    }

private var _calendarAgenda: ImageVector? = null
