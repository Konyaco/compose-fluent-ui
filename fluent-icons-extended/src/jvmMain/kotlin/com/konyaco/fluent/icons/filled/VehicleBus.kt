

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VehicleBus: ImageVector
    get() {
        if (_vehicleBus != null) {
            return _vehicleBus!!
        }
        _vehicleBus = fluentIcon(name = "Filled.VehicleBus") {
            fluentPath {
                moveTo(10.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(4.0f, 5.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 7.75f, 2.0f)
                horizontalLineToRelative(8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 20.0f, 5.75f)
                lineTo(20.0f, 9.5f)
                horizontalLineToRelative(1.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(20.0f, 11.0f)
                verticalLineToRelative(8.75f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(15.0f, 18.5f)
                lineTo(9.0f, 18.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(4.0f, 11.0f)
                lineTo(2.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(4.0f, 9.5f)
                lineTo(4.0f, 5.75f)
                close()
                moveTo(16.5f, 18.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                lineTo(18.5f, 18.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(5.5f, 18.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                lineTo(7.5f, 18.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.75f, 3.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                lineTo(5.5f, 12.0f)
                horizontalLineToRelative(13.0f)
                lineTo(18.5f, 5.75f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(9.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        return _vehicleBus!!
    }

private var _vehicleBus: ImageVector? = null
