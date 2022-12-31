

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) {
            return _batteryWarning!!
        }
        _batteryWarning = fluentIcon(name = "Filled.BatteryWarning") {
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
                lineToRelative(-3.86f, -6.74f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.34f, 0.0f)
                lineToRelative(-2.97f, 5.17f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 2.0f, 15.0f)
                lineTo(2.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(7.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, -0.09f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-0.01f, -0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.41f)
                close()
            }
        }
        return _batteryWarning!!
    }

private var _batteryWarning: ImageVector? = null
