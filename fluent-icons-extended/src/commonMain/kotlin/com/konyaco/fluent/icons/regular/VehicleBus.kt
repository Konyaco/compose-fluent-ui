

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.VehicleBus: ImageVector
    get() {
        if (_vehicleBus != null) {
            return _vehicleBus!!
        }
        _vehicleBus = fluentIcon(name = "Regular.VehicleBus") {
            fluentPath {
                moveTo(8.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(17.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(10.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(7.75f, 2.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 4.0f, 5.75f)
                lineTo(4.0f, 9.5f)
                lineTo(2.75f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(8.75f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(9.0f, 18.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(20.0f, 11.0f)
                horizontalLineToRelative(1.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(20.0f, 9.5f)
                lineTo(20.0f, 5.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 16.25f, 2.0f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(18.5f, 18.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(16.5f, 18.5f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.5f, 17.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(5.5f, 19.75f)
                lineTo(5.5f, 18.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                close()
                moveTo(5.5f, 5.75f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(-13.0f)
                lineTo(5.5f, 5.75f)
                close()
            }
        }
        return _vehicleBus!!
    }

private var _vehicleBus: ImageVector? = null
