

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PhoneTablet: ImageVector
    get() {
        if (_phoneTablet != null) {
            return _phoneTablet!!
        }
        _phoneTablet = fluentIcon(name = "Filled.PhoneTablet") {
            fluentPath {
                moveTo(8.25f, 7.0f)
                curveTo(9.22f, 7.0f, 10.0f, 7.78f, 10.0f, 8.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-4.5f)
                curveTo(2.78f, 20.0f, 2.0f, 19.22f, 2.0f, 18.25f)
                verticalLineToRelative(-9.5f)
                curveTo(2.0f, 7.78f, 2.78f, 7.0f, 3.75f, 7.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(6.25f, 16.5f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.49f)
                horizontalLineToRelative(0.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.49f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(19.75f, 4.0f)
                curveToRelative(1.19f, 0.0f, 2.16f, 0.93f, 2.24f, 2.1f)
                verticalLineToRelative(8.65f)
                curveToRelative(0.0f, 1.2f, -0.92f, 2.17f, -2.09f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                lineTo(11.0f, 17.0f)
                lineTo(11.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.66f, 6.0f)
                lineTo(6.01f, 6.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 8.1f, 4.0f)
                horizontalLineToRelative(11.66f)
                close()
                moveTo(15.25f, 13.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(2.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _phoneTablet!!
    }

private var _phoneTablet: ImageVector? = null
