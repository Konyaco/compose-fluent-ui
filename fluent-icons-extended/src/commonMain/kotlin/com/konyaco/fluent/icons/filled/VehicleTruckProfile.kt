

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VehicleTruckProfile: ImageVector
    get() {
        if (_vehicleTruckProfile != null) {
            return _vehicleTruckProfile!!
        }
        _vehicleTruckProfile = fluentIcon(name = "Filled.VehicleTruckProfile") {
            fluentPath {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 4.01f, 3.0f, 3.0f, 4.25f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                lineTo(16.5f, 6.0f)
                horizontalLineToRelative(1.55f)
                curveToRelative(0.87f, 0.0f, 1.66f, 0.5f, 2.03f, 1.29f)
                lineToRelative(1.7f, 3.58f)
                curveToRelative(0.15f, 0.3f, 0.22f, 0.63f, 0.22f, 0.97f)
                verticalLineToRelative(5.41f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-1.8f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.9f, 0.0f)
                horizontalLineToRelative(-2.1f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.91f, -0.01f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 2.0f, 17.25f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(20.5f, 15.5f)
                horizontalLineToRelative(-1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(20.18f, 11.0f)
                lineTo(18.73f, 7.93f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.68f, -0.43f)
                lineTo(16.5f, 7.5f)
                lineTo(16.5f, 11.0f)
                horizontalLineToRelative(3.68f)
                close()
                moveTo(7.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(16.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        return _vehicleTruckProfile!!
    }

private var _vehicleTruckProfile: ImageVector? = null
