

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VehicleCarProfileLtrClock: ImageVector
    get() {
        if (_vehicleCarProfileLtrClock != null) {
            return _vehicleCarProfileLtrClock!!
        }
        _vehicleCarProfileLtrClock = fluentIcon(name = "Filled.VehicleCarProfileLtrClock") {
            fluentPath {
                moveTo(6.5f, 1.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(8.5f, 6.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(6.5f, 13.0f)
                curveToRelative(1.75f, 0.0f, 3.33f, -0.69f, 4.5f, -1.81f)
                lineTo(11.0f, 12.0f)
                horizontalLineToRelative(4.93f)
                lineToRelative(-2.0f, -3.39f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 12.86f, 8.0f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(0.11f, -0.48f, 0.17f, -0.98f, 0.17f, -1.5f)
                curveToRelative(0.92f, 0.05f, 1.76f, 0.55f, 2.23f, 1.35f)
                lineToRelative(2.5f, 4.25f)
                lineToRelative(2.19f, 0.54f)
                curveToRelative(1.22f, 0.31f, 2.08f, 1.41f, 2.08f, 2.67f)
                lineTo(22.0f, 17.0f)
                curveToRelative(0.0f, 1.1f, -0.65f, 2.05f, -1.59f, 2.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.25f, 0.25f)
                lineTo(9.34f, 19.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.32f, -0.61f)
                arcTo(2.74f, 2.74f, 0.0f, false, true, 2.0f, 17.0f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.0f, -1.08f, 0.62f, -2.02f, 1.53f, -2.47f)
                curveToRelative(0.9f, 0.46f, 1.9f, 0.72f, 2.97f, 0.72f)
                close()
                moveTo(6.25f, 17.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                close()
                moveTo(15.5f, 18.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -3.5f, 0.0f)
                close()
            }
        }
        return _vehicleCarProfileLtrClock!!
    }

private var _vehicleCarProfileLtrClock: ImageVector? = null
