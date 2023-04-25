

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WifiWarning: ImageVector
    get() {
        if (_wifiWarning != null) {
            return _wifiWarning!!
        }
        _wifiWarning = fluentIcon(name = "Filled.WifiWarning") {
            fluentPath {
                moveToRelative(17.78f, 10.7f)
                lineToRelative(0.35f, 0.38f)
                curveToRelative(-0.8f, -0.2f, -1.67f, -0.02f, -2.3f, 0.56f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, false, -9.26f, 2.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.78f, -0.9f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, 13.0f, -2.07f)
                close()
                moveTo(11.96f, 19.0f)
                lineToRelative(1.21f, -2.43f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 11.95f, 19.0f)
                close()
                moveTo(14.03f, 14.85f)
                lineTo(14.93f, 13.05f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, false, -7.69f, 2.26f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.84f, 0.8f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 4.95f, -1.26f)
                close()
                moveTo(20.42f, 8.3f)
                curveToRelative(0.5f, 0.5f, 0.99f, 1.09f, 1.4f, 1.69f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.64f, 1.14f)
                arcToRelative(9.92f, 9.92f, 0.0f, false, false, -16.36f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.64f, -1.15f)
                arcTo(11.92f, 11.92f, 0.0f, false, true, 20.42f, 8.3f)
                close()
                moveTo(16.16f, 12.83f)
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
