

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CircleImage: ImageVector
    get() {
        if (_circleImage != null) {
            return _circleImage!!
        }
        _circleImage = fluentIcon(name = "Regular.CircleImage") {
            fluentPath {
                moveTo(9.0f, 3.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -1.0f, 10.9f)
                verticalLineToRelative(1.53f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 15.93f, 8.0f)
                lineTo(14.4f, 8.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 9.0f, 3.5f)
                close()
                moveTo(14.8f, 17.27f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                lineToRelative(3.14f, 3.13f)
                curveToRelative(-0.19f, 0.06f, -0.38f, 0.1f, -0.59f, 0.1f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-0.2f, 0.0f, -0.4f, -0.04f, -0.59f, -0.1f)
                lineToRelative(3.13f, -3.13f)
                close()
                moveTo(10.6f, 19.34f)
                curveToRelative(-0.06f, -0.19f, -0.1f, -0.38f, -0.1f, -0.59f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.2f, -0.04f, 0.4f, -0.1f, 0.59f)
                lineToRelative(-3.13f, -3.13f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.54f, 0.0f)
                lineToRelative(-3.13f, 3.13f)
                close()
                moveTo(19.25f, 13.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(12.25f, 9.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 9.0f, 12.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-6.5f)
                curveTo(22.0f, 10.45f, 20.54f, 9.0f, 18.75f, 9.0f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        return _circleImage!!
    }

private var _circleImage: ImageVector? = null
