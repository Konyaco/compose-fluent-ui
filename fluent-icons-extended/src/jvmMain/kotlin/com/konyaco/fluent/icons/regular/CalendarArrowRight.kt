

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CalendarArrowRight: ImageVector
    get() {
        if (_calendarArrowRight != null) {
            return _calendarArrowRight!!
        }
        _calendarArrowRight = fluentIcon(name = "Regular.CalendarArrowRight") {
            fluentPath {
                moveTo(21.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(6.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(6.02f)
                curveToRelative(-0.3f, -0.46f, -0.53f, -0.97f, -0.7f, -1.5f)
                lineTo(6.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 18.0f)
                lineTo(4.5f, 8.5f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.81f)
                curveToRelative(0.53f, 0.18f, 1.04f, 0.42f, 1.5f, 0.71f)
                lineTo(21.0f, 6.0f)
                close()
                moveTo(6.0f, 4.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-15.0f)
                lineTo(4.5f, 6.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(17.65f, 15.35f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, -0.7f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.5f, 0.0f, 0.7f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.7f, -0.7f)
                lineTo(19.29f, 18.0f)
                lineTo(14.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, -1.65f)
                close()
            }
        }
        return _calendarArrowRight!!
    }

private var _calendarArrowRight: ImageVector? = null
