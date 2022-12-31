

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) {
            return _batteryWarning!!
        }
        _batteryWarning = fluentIcon(name = "Regular.BatteryWarning") {
            fluentPath {
                moveTo(8.24f, 11.2f)
                curveToRelative(0.24f, 0.13f, 0.43f, 0.32f, 0.56f, 0.56f)
                lineToRelative(4.0f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 21.0f)
                lineTo(3.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.3f, -2.25f)
                lineToRelative(4.0f, -7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.05f, -0.55f)
                close()
                moveTo(7.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
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
                horizontalLineToRelative(-3.47f)
                lineToRelative(-0.86f, -1.5f)
                lineTo(17.0f, 16.5f)
                curveToRelative(0.78f, 0.0f, 1.42f, -0.6f, 1.5f, -1.36f)
                lineTo(18.5f, 9.0f)
                curveToRelative(0.0f, -0.78f, -0.6f, -1.42f, -1.36f, -1.5f)
                lineTo(5.0f, 7.5f)
                curveToRelative(-0.78f, 0.0f, -1.42f, 0.6f, -1.5f, 1.36f)
                verticalLineToRelative(5.59f)
                lineToRelative(-1.14f, 1.98f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 2.0f, 15.0f)
                lineTo(2.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(7.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.41f)
                lineTo(7.0f, 16.59f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.99f, 0.0f)
                lineTo(7.99f, 13.41f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.41f)
                close()
            }
        }
        return _batteryWarning!!
    }

private var _batteryWarning: ImageVector? = null
