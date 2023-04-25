

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarShield: ImageVector
    get() {
        if (_calendarShield != null) {
            return _calendarShield!!
        }
        _calendarShield = fluentIcon(name = "Filled.CalendarShield") {
            fluentPath {
                moveTo(21.0f, 8.5f)
                verticalLineToRelative(4.11f)
                arcToRelative(3.16f, 3.16f, 0.0f, false, true, -1.0f, -0.38f)
                curveToRelative(-0.33f, -0.19f, -0.66f, -0.45f, -1.0f, -0.8f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.6f, 1.24f)
                curveToRelative(-0.81f, 0.0f, -1.4f, 0.67f, -1.4f, 1.41f)
                verticalLineToRelative(2.8f)
                curveToRelative(0.04f, 1.15f, 0.3f, 2.2f, 0.82f, 3.1f)
                curveToRelative(0.2f, 0.37f, 0.44f, 0.71f, 0.72f, 1.02f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 8.5f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(18.0f, 12.0f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.28f, 0.12f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -3.32f, 1.55f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.4f, 0.41f)
                verticalLineToRelative(2.77f)
                curveToRelative(0.04f, 1.01f, 0.27f, 1.9f, 0.69f, 2.65f)
                curveToRelative(0.32f, 0.58f, 0.76f, 1.08f, 1.31f, 1.5f)
                curveToRelative(0.52f, 0.4f, 1.15f, 0.73f, 1.87f, 0.98f)
                curveToRelative(0.09f, 0.03f, 0.18f, 0.03f, 0.26f, 0.0f)
                curveToRelative(2.56f, -0.89f, 3.87f, -2.71f, 3.87f, -5.4f)
                lineTo(22.0f, 14.0f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.4f, -0.33f)
                arcToRelative(4.21f, 4.21f, 0.0f, false, true, -2.1f, -0.57f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, true, -1.22f, -0.98f)
                arcTo(0.4f, 0.4f, 0.0f, false, false, 18.0f, 12.0f)
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
        return _calendarShield!!
    }

private var _calendarShield: ImageVector? = null
