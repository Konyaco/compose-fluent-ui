

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BatteryCharge: ImageVector
    get() {
        if (_batteryCharge != null) {
            return _batteryCharge!!
        }
        _batteryCharge = fluentIcon(name = "Filled.BatteryCharge") {
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
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.65f)
                verticalLineToRelative(-4.6f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.64f, -0.74f)
                lineTo(8.0f, 12.0f)
                horizontalLineToRelative(0.63f)
                curveToRelative(0.72f, 0.0f, 1.3f, -0.55f, 1.37f, -1.24f)
                lineToRelative(0.01f, -0.14f)
                lineTo(10.01f, 6.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                lineTo(17.0f, 6.0f)
                horizontalLineToRelative(-6.25f)
                close()
                moveTo(6.65f, 4.0f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.38f, 0.0f, 0.69f, 0.28f, 0.74f, 0.65f)
                lineTo(7.49f, 6.0f)
                horizontalLineToRelative(0.76f)
                curveToRelative(0.42f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                curveTo(9.0f, 10.22f, 8.22f, 11.0f, 7.25f, 11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.24f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.65f, 0.75f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.64f)
                lineTo(4.76f, 11.0f)
                lineTo(3.74f, 11.0f)
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
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _batteryCharge!!
    }

private var _batteryCharge: ImageVector? = null
