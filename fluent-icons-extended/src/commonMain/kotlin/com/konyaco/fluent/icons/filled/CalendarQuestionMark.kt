

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalendarQuestionMark: ImageVector
    get() {
        if (_calendarQuestionMark != null) {
            return _calendarQuestionMark!!
        }
        _calendarQuestionMark = fluentIcon(name = "Filled.CalendarQuestionMark") {
            fluentPath {
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(21.0f, 12.02f)
                lineTo(21.0f, 8.5f)
                lineTo(3.0f, 8.5f)
                verticalLineToRelative(9.25f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(5.77f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 21.0f, 12.02f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(16.88f, 20.38f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, true, 1.24f, 0.0f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -1.24f, 0.0f)
                close()
                moveTo(15.65f, 15.83f)
                curveToRelative(-0.01f, -1.14f, 0.8f, -1.96f, 1.85f, -1.96f)
                curveToRelative(1.03f, 0.0f, 1.85f, 0.85f, 1.85f, 1.95f)
                curveToRelative(0.0f, 0.51f, -0.15f, 0.85f, -0.52f, 1.3f)
                lineToRelative(-0.14f, 0.15f)
                lineToRelative(-0.27f, 0.3f)
                lineToRelative(-0.1f, 0.1f)
                lineToRelative(-0.08f, 0.11f)
                curveToRelative(-0.18f, 0.23f, -0.24f, 0.39f, -0.24f, 0.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                curveToRelative(0.0f, -0.53f, 0.15f, -0.86f, 0.53f, -1.32f)
                lineToRelative(0.14f, -0.16f)
                lineToRelative(0.27f, -0.29f)
                lineToRelative(0.1f, -0.1f)
                lineToRelative(0.09f, -0.12f)
                curveToRelative(0.17f, -0.22f, 0.22f, -0.37f, 0.22f, -0.57f)
                curveToRelative(0.0f, -0.55f, -0.38f, -0.95f, -0.85f, -0.95f)
                curveToRelative(-0.5f, 0.0f, -0.86f, 0.37f, -0.85f, 0.95f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                close()
            }
        }
        return _calendarQuestionMark!!
    }

private var _calendarQuestionMark: ImageVector? = null
