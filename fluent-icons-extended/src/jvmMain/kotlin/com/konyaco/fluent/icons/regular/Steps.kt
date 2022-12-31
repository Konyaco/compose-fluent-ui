

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Steps: ImageVector
    get() {
        if (_steps != null) {
            return _steps!!
        }
        _steps = fluentIcon(name = "Regular.Steps") {
            fluentPath {
                moveTo(12.0f, 3.38f)
                curveToRelative(0.0f, -0.76f, 0.62f, -1.38f, 1.38f, -1.38f)
                horizontalLineToRelative(3.74f)
                curveToRelative(0.76f, 0.0f, 1.38f, 0.62f, 1.38f, 1.38f)
                lineTo(18.5f, 9.0f)
                lineTo(17.0f, 9.0f)
                lineTo(17.0f, 3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.63f)
                curveToRelative(0.0f, 0.75f, -0.62f, 1.37f, -1.38f, 1.37f)
                lineTo(8.5f, 8.5f)
                verticalLineToRelative(3.63f)
                curveToRelative(0.0f, 0.75f, -0.62f, 1.37f, -1.38f, 1.37f)
                lineTo(3.5f, 13.5f)
                lineTo(3.5f, 17.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(1.5f)
                lineTo(3.37f, 18.5f)
                curveToRelative(-0.75f, 0.0f, -1.37f, -0.62f, -1.37f, -1.38f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0.0f, -0.75f, 0.62f, -1.37f, 1.38f, -1.37f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 8.37f)
                curveTo(7.0f, 7.63f, 7.62f, 7.0f, 8.38f, 7.0f)
                lineTo(12.0f, 7.0f)
                lineTo(12.0f, 3.37f)
                close()
                moveTo(16.38f, 10.0f)
                curveToRelative(-0.76f, 0.0f, -1.38f, 0.62f, -1.38f, 1.38f)
                lineTo(15.0f, 15.0f)
                horizontalLineToRelative(-3.63f)
                curveToRelative(-0.75f, 0.0f, -1.37f, 0.62f, -1.37f, 1.38f)
                verticalLineToRelative(3.75f)
                curveToRelative(0.0f, 0.75f, 0.62f, 1.37f, 1.38f, 1.37f)
                horizontalLineToRelative(6.87f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-6.88f)
                curveToRelative(0.0f, -0.75f, -0.62f, -1.37f, -1.38f, -1.37f)
                horizontalLineToRelative(-3.75f)
                close()
                moveTo(16.5f, 15.13f)
                lineTo(16.5f, 11.5f)
                lineTo(20.0f, 11.5f)
                verticalLineToRelative(6.75f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(11.5f, 20.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.63f)
                curveToRelative(0.75f, 0.0f, 1.37f, -0.62f, 1.37f, -1.38f)
                close()
            }
        }
        return _steps!!
    }

private var _steps: ImageVector? = null
