

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VehicleBicycle: ImageVector
    get() {
        if (_vehicleBicycle != null) {
            return _vehicleBicycle!!
        }
        _vehicleBicycle = fluentIcon(name = "Filled.VehicleBicycle") {
            fluentPath {
                moveTo(13.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.19f)
                lineToRelative(0.62f, 3.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.86f)
                lineToRelative(-0.9f, 3.16f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 4.9f, 4.35f)
                lineToRelative(4.47f, -5.21f)
                lineToRelative(0.25f, 1.2f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 17.7f, 11.0f)
                lineToRelative(-1.71f, -8.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.14f, 13.4f)
                lineToRelative(0.38f, 1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.96f, -0.4f)
                lineToRelative(-0.36f, -1.72f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -1.98f, 0.32f)
                close()
                moveTo(10.31f, 13.1f)
                arcToRelative(4.52f, 4.52f, 0.0f, false, false, -2.21f, -1.8f)
                lineTo(8.75f, 9.0f)
                horizontalLineToRelative(5.08f)
                lineToRelative(-3.52f, 4.1f)
                close()
                moveTo(7.55f, 13.23f)
                curveToRelative(0.37f, 0.17f, 0.7f, 0.44f, 0.95f, 0.77f)
                lineTo(7.33f, 14.0f)
                lineToRelative(0.22f, -0.77f)
                close()
                moveTo(5.47f, 13.23f)
                lineToRelative(-0.43f, 1.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 16.0f)
                horizontalLineToRelative(2.95f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -3.48f, -2.78f)
                close()
            }
        }
        return _vehicleBicycle!!
    }

private var _vehicleBicycle: ImageVector? = null
