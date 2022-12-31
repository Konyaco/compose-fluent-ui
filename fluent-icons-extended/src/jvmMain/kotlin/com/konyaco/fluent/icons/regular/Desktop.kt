

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Desktop: ImageVector
    get() {
        if (_desktop != null) {
            return _desktop!!
        }
        _desktop = fluentIcon(name = "Regular.Desktop") {
            fluentPath {
                moveTo(6.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(8.5f, 20.5f)
                lineTo(8.5f, 18.0f)
                lineTo(4.25f, 18.0f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.1f)
                lineTo(2.0f, 15.76f)
                lineTo(2.0f, 5.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(4.25f, 3.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.19f, 0.0f, 2.16f, 0.93f, 2.24f, 2.1f)
                verticalLineToRelative(10.65f)
                curveToRelative(0.0f, 1.2f, -0.92f, 2.17f, -2.09f, 2.25f)
                horizontalLineToRelative(-4.4f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(6.75f, 22.0f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 18.0f)
                close()
                moveTo(19.75f, 4.5f)
                lineTo(4.25f, 4.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.75f)
                horizontalLineToRelative(15.6f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.74f, -0.65f)
                lineTo(20.49f, 5.25f)
                curveToRelative(0.0f, -0.38f, -0.27f, -0.7f, -0.64f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                close()
            }
        }
        return _desktop!!
    }

private var _desktop: ImageVector? = null
