

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PhoneDesktop: ImageVector
    get() {
        if (_phoneDesktop != null) {
            return _phoneDesktop!!
        }
        _phoneDesktop = fluentIcon(name = "Filled.PhoneDesktop") {
            fluentPath {
                moveTo(8.25f, 9.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-4.5f)
                curveTo(2.78f, 22.0f, 2.0f, 21.22f, 2.0f, 20.25f)
                verticalLineToRelative(-9.5f)
                curveTo(2.0f, 9.78f, 2.78f, 9.0f, 3.75f, 9.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(6.25f, 18.5f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.49f)
                horizontalLineToRelative(0.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.49f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(19.75f, 2.0f)
                curveToRelative(1.19f, 0.0f, 2.16f, 0.93f, 2.24f, 2.1f)
                verticalLineToRelative(9.15f)
                curveToRelative(0.0f, 1.2f, -0.92f, 2.17f, -2.09f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                lineTo(16.0f, 15.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.0f)
                lineTo(11.0f, 15.5f)
                verticalLineToRelative(-5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.66f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 4.25f)
                curveToRelative(0.0f, -1.2f, 0.92f, -2.17f, 2.1f, -2.24f)
                lineTo(6.25f, 2.0f)
                horizontalLineToRelative(13.5f)
                close()
            }
        }
        return _phoneDesktop!!
    }

private var _phoneDesktop: ImageVector? = null
