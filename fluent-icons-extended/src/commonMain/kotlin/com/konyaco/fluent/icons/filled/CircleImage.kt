

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CircleImage: ImageVector
    get() {
        if (_circleImage != null) {
            return _circleImage!!
        }
        _circleImage = fluentIcon(name = "Filled.CircleImage") {
            fluentPath {
                moveTo(12.25f, 8.0f)
                horizontalLineToRelative(3.68f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 8.0f, 15.93f)
                verticalLineToRelative(-3.68f)
                curveTo(8.0f, 9.9f, 9.9f, 8.0f, 12.25f, 8.0f)
                close()
                moveTo(12.25f, 9.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 9.0f, 12.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.63f, 0.18f, 1.21f, 0.48f, 1.7f)
                lineToRelative(4.25f, -4.24f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.54f, 0.0f)
                lineToRelative(4.25f, 4.25f)
                curveToRelative(0.3f, -0.5f, 0.48f, -1.08f, 0.48f, -1.71f)
                verticalLineToRelative(-6.5f)
                curveTo(22.0f, 10.45f, 20.54f, 9.0f, 18.75f, 9.0f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(20.45f, 21.52f)
                lineTo(16.21f, 17.27f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                lineToRelative(-4.25f, 4.25f)
                curveToRelative(0.5f, 0.3f, 1.08f, 0.48f, 1.71f, 0.48f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.63f, 0.0f, 1.21f, -0.18f, 1.7f, -0.48f)
                close()
                moveTo(19.26f, 13.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
            }
        }
        return _circleImage!!
    }

private var _circleImage: ImageVector? = null
