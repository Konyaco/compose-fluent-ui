

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DualScreenTablet: ImageVector
    get() {
        if (_dualScreenTablet != null) {
            return _dualScreenTablet!!
        }
        _dualScreenTablet = fluentIcon(name = "Filled.DualScreenTablet") {
            fluentPath {
                moveTo(7.5f, 9.0f)
                verticalLineToRelative(12.0f)
                lineTo(3.75f, 21.0f)
                curveToRelative(-0.92f, 0.0f, -1.67f, -0.7f, -1.74f, -1.6f)
                lineTo(2.0f, 19.24f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.92f, 0.7f, -1.67f, 1.6f, -1.74f)
                lineTo(3.76f, 9.0f)
                lineTo(7.5f, 9.0f)
                close()
                moveTo(12.25f, 9.0f)
                curveToRelative(0.92f, 0.0f, 1.67f, 0.7f, 1.74f, 1.6f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.92f, -0.7f, 1.67f, -1.6f, 1.74f)
                lineToRelative(-0.15f, 0.01f)
                lineTo(8.5f, 21.0f)
                lineTo(8.5f, 9.0f)
                horizontalLineToRelative(3.75f)
                close()
                moveTo(10.65f, 17.5f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(5.89f, 17.5f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(6.0f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(19.75f, 3.0f)
                curveToRelative(1.2f, 0.0f, 2.17f, 0.93f, 2.24f, 2.1f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.2f, -0.93f, 2.17f, -2.1f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                lineTo(15.0f, 16.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(15.0f, 12.0f)
                verticalLineToRelative(-1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.66f, 8.0f)
                lineTo(6.0f, 8.0f)
                lineTo(6.0f, 5.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(8.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
            }
        }
        return _dualScreenTablet!!
    }

private var _dualScreenTablet: ImageVector? = null
