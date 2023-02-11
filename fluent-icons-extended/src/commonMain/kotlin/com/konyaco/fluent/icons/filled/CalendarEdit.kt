

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarEdit: ImageVector
    get() {
        if (_calendarEdit != null) {
            return _calendarEdit!!
        }
        _calendarEdit = fluentIcon(name = "Filled.CalendarEdit") {
            fluentPath {
                moveTo(11.52f, 19.58f)
                lineTo(11.16f, 21.0f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 8.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.51f)
                curveToRelative(-0.93f, -0.08f, -1.9f, 0.24f, -2.6f, 0.95f)
                lineToRelative(-5.91f, 5.9f)
                curveToRelative(-0.47f, 0.48f, -0.8f, 1.07f, -0.97f, 1.72f)
                close()
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(19.1f, 12.67f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.34f, -0.6f, 0.78f, -0.71f, 1.25f)
                lineToRelative(-0.46f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.52f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _calendarEdit!!
    }

private var _calendarEdit: ImageVector? = null
