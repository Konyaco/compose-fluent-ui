

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WifiWarning: ImageVector
    get() {
        if (_wifiWarning != null) {
            return _wifiWarning!!
        }
        _wifiWarning = fluentIcon(name = "Regular.WifiWarning") {
            fluentPath {
                moveToRelative(17.74f, 10.75f)
                lineToRelative(0.3f, 0.3f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, false, -1.85f, 0.31f)
                arcToRelative(6.56f, 6.56f, 0.0f, false, false, -10.0f, 2.12f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.34f, -0.67f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, true, 12.9f, -2.06f)
                close()
                moveTo(11.96f, 19.0f)
                lineToRelative(1.21f, -2.43f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 11.95f, 19.0f)
                close()
                moveTo(14.19f, 14.54f)
                lineTo(14.86f, 13.18f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, -7.48f, 2.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.37f, 0.61f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 5.43f, -1.45f)
                close()
                moveTo(20.45f, 8.28f)
                curveToRelative(0.5f, 0.5f, 0.99f, 1.09f, 1.4f, 1.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.23f, 0.85f)
                arcToRelative(10.45f, 10.45f, 0.0f, false, false, -17.23f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.23f, -0.86f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, true, 18.29f, -1.69f)
                close()
                moveTo(16.15f, 12.83f)
                lineTo(12.16f, 20.83f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 23.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.34f, -2.17f)
                lineToRelative(-4.0f, -8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.68f, 0.0f)
                close()
                moveTo(18.0f, 15.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(17.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                close()
            }
        }
        return _wifiWarning!!
    }

private var _wifiWarning: ImageVector? = null
