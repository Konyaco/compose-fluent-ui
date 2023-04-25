

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.VehicleBicycle: ImageVector
    get() {
        if (_vehicleBicycle != null) {
            return _vehicleBicycle!!
        }
        _vehicleBicycle = fluentIcon(name = "Regular.VehicleBicycle") {
            fluentPath {
                moveTo(12.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.43f)
                lineToRelative(0.95f, 3.5f)
                lineTo(8.5f, 8.0f)
                lineTo(8.5f, 5.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 7.75f, 5.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(7.0f, 6.5f)
                verticalLineToRelative(2.19f)
                lineToRelative(-0.3f, 1.81f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, false, 4.3f, 4.06f)
                lineToRelative(4.65f, -4.65f)
                lineToRelative(0.28f, 1.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, false, 1.44f, -0.4f)
                lineToRelative(-1.9f, -6.96f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.72f, -0.55f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.33f, 12.4f)
                lineTo(17.03f, 14.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.44f, -0.4f)
                lineToRelative(-0.7f, -2.55f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -1.44f, 0.4f)
                close()
                moveTo(10.56f, 12.87f)
                arcToRelative(4.26f, 4.26f, 0.0f, false, false, -2.38f, -2.12f)
                lineToRelative(0.2f, -1.25f)
                horizontalLineToRelative(5.56f)
                lineToRelative(-3.38f, 3.37f)
                close()
                moveTo(7.92f, 12.27f)
                curveToRelative(0.72f, 0.33f, 1.26f, 0.96f, 1.48f, 1.73f)
                lineTo(7.64f, 14.0f)
                lineToRelative(0.28f, -1.74f)
                close()
                moveTo(6.45f, 12.02f)
                lineTo(6.0f, 14.62f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.74f, 0.88f)
                lineTo(9.4f, 15.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -2.95f, -3.48f)
                close()
            }
        }
        return _vehicleBicycle!!
    }

private var _vehicleBicycle: ImageVector? = null
