

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PhoneDesktop: ImageVector
    get() {
        if (_phoneDesktop != null) {
            return _phoneDesktop!!
        }
        _phoneDesktop = fluentIcon(name = "Regular.PhoneDesktop") {
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
                moveTo(8.25f, 10.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(6.25f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(0.6f)
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
                lineTo(11.0f, 14.0f)
                horizontalLineToRelative(8.75f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.74f, -0.65f)
                verticalLineToRelative(-9.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.74f, -0.75f)
                lineTo(6.25f, 3.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                lineTo(5.5f, 8.0f)
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
