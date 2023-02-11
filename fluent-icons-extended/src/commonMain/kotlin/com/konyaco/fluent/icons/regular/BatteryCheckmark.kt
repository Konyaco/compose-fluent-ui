

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BatteryCheckmark: ImageVector
    get() {
        if (_batteryCheckmark != null) {
            return _batteryCheckmark!!
        }
        _batteryCheckmark = fluentIcon(name = "Regular.BatteryCheckmark") {
            fluentPath {
                moveTo(17.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-4.17f)
                curveToRelative(0.11f, -0.48f, 0.17f, -0.98f, 0.17f, -1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.78f, 0.0f, 1.42f, -0.6f, 1.5f, -1.36f)
                lineTo(18.5f, 9.0f)
                curveToRelative(0.0f, -0.78f, -0.6f, -1.42f, -1.36f, -1.5f)
                lineTo(5.0f, 7.5f)
                curveToRelative(-0.78f, 0.0f, -1.42f, 0.6f, -1.5f, 1.36f)
                verticalLineToRelative(1.87f)
                curveToRelative(-0.55f, 0.29f, -1.06f, 0.65f, -1.5f, 1.08f)
                lineTo(2.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(12.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(9.85f, 14.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineTo(5.5f, 17.79f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                close()
            }
        }
        return _batteryCheckmark!!
    }

private var _batteryCheckmark: ImageVector? = null
