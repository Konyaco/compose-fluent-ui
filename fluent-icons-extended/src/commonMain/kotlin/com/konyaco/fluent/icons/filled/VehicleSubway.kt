

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VehicleSubway: ImageVector
    get() {
        if (_vehicleSubway != null) {
            return _vehicleSubway!!
        }
        _vehicleSubway = fluentIcon(name = "Filled.VehicleSubway") {
            fluentPath {
                moveTo(16.25f, 3.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 20.0f, 6.75f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -2.89f, 3.65f)
                lineToRelative(2.46f, 1.17f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.55f, 1.4f)
                lineToRelative(-0.1f, -0.04f)
                lineToRelative(-5.09f, -2.43f)
                horizontalLineToRelative(-3.66f)
                lineToRelative(-5.1f, 2.43f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.64f, -1.36f)
                lineToRelative(2.46f, -1.17f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 4.0f, 15.75f)
                verticalLineToRelative(-9.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 7.75f, 3.0f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(8.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(16.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(16.25f, 4.5f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(13.0f)
                lineTo(18.5f, 6.75f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                close()
                moveTo(13.25f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.5f)
                close()
            }
        }
        return _vehicleSubway!!
    }

private var _vehicleSubway: ImageVector? = null
