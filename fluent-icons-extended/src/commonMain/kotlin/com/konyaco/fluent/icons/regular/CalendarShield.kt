

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CalendarShield: ImageVector
    get() {
        if (_calendarShield != null) {
            return _calendarShield!!
        }
        _calendarShield = fluentIcon(name = "Regular.CalendarShield") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(6.36f)
                arcToRelative(3.16f, 3.16f, 0.0f, false, true, -1.5f, -0.72f)
                lineTo(19.5f, 8.5f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(9.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(7.32f)
                arcToRelative(5.89f, 5.89f, 0.0f, false, false, 0.97f, 1.5f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(14.69f, 19.5f)
                curveToRelative(0.32f, 0.58f, 0.76f, 1.08f, 1.31f, 1.5f)
                curveToRelative(0.52f, 0.4f, 1.15f, 0.73f, 1.87f, 0.98f)
                curveToRelative(0.09f, 0.03f, 0.18f, 0.03f, 0.26f, 0.0f)
                curveToRelative(2.56f, -0.89f, 3.87f, -2.71f, 3.87f, -5.4f)
                lineTo(22.0f, 14.0f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.4f, -0.33f)
                arcToRelative(4.21f, 4.21f, 0.0f, false, true, -2.1f, -0.57f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, true, -1.22f, -0.98f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, -0.56f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -3.32f, 1.55f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.4f, 0.41f)
                verticalLineToRelative(2.77f)
                curveToRelative(0.04f, 1.01f, 0.27f, 1.9f, 0.69f, 2.65f)
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
        return _calendarShield!!
    }

private var _calendarShield: ImageVector? = null
