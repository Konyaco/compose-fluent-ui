

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BatteryCharge: ImageVector
    get() {
        if (_batteryCharge != null) {
            return _batteryCharge!!
        }
        _batteryCharge = fluentIcon(name = "Regular.BatteryCharge") {
            fluentPath {
                moveTo(10.75f, 6.0f)
                lineTo(17.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 2.82f)
                lineTo(20.0f, 10.0f)
                lineToRelative(1.0f, 0.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineToRelative(2.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.87f, 0.99f)
                lineTo(21.0f, 14.01f)
                lineTo(20.0f, 14.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.82f, 3.0f)
                lineTo(8.0f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(17.0f, 16.5f)
                curveToRelative(0.78f, 0.0f, 1.42f, -0.6f, 1.5f, -1.36f)
                lineTo(18.5f, 9.0f)
                curveToRelative(0.0f, -0.78f, -0.6f, -1.42f, -1.36f, -1.5f)
                horizontalLineToRelative(-6.39f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(17.0f, 6.0f)
                horizontalLineToRelative(-6.25f)
                close()
                moveTo(6.25f, 11.0f)
                verticalLineToRelative(6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(4.75f, 11.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(2.78f, 11.0f, 2.0f, 10.22f, 2.0f, 9.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(0.75f)
                lineTo(3.5f, 4.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 4.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                curveToRelative(0.38f, 0.0f, 0.69f, 0.28f, 0.74f, 0.65f)
                lineTo(7.49f, 6.0f)
                horizontalLineToRelative(0.76f)
                curveToRelative(0.42f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                curveTo(9.0f, 10.22f, 8.22f, 11.0f, 7.25f, 11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.25f)
                lineTo(6.25f, 11.0f)
                close()
                moveTo(7.5f, 7.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                lineTo(7.5f, 7.5f)
                close()
            }
        }
        return _batteryCharge!!
    }

private var _batteryCharge: ImageVector? = null
