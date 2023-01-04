

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShiftsCheckmark: ImageVector
    get() {
        if (_shiftsCheckmark != null) {
            return _shiftsCheckmark!!
        }
        _shiftsCheckmark = fluentIcon(name = "Regular.ShiftsCheckmark") {
            fluentPath {
                moveTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-5.06f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, -0.71f, 1.5f)
                horizontalLineToRelative(5.77f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(5.77f)
                curveToRelative(0.46f, -0.3f, 0.97f, -0.53f, 1.5f, -0.7f)
                lineTo(4.5f, 6.24f)
                close()
                moveTo(12.5f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(12.5f, 12.0f)
                lineTo(12.5f, 6.75f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(8.85f, 15.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineTo(5.5f, 18.29f)
                lineToRelative(-0.9f, -0.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.71f)
                lineToRelative(1.25f, 1.25f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                close()
            }
        }
        return _shiftsCheckmark!!
    }

private var _shiftsCheckmark: ImageVector? = null
