

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TopSpeed: ImageVector
    get() {
        if (_topSpeed != null) {
            return _topSpeed!!
        }
        _topSpeed = fluentIcon(name = "Filled.TopSpeed") {
            fluentPath {
                moveTo(11.0f, 3.56f)
                lineTo(11.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(13.0f, 3.56f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 20.44f, 11.0f)
                lineTo(19.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.44f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -2.24f, 4.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.1f, 1.02f)
                arcTo(9.92f, 9.92f, 0.0f, false, false, 22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -20.0f, 0.0f)
                arcToRelative(9.92f, 9.92f, 0.0f, false, false, 2.7f, 6.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.1f, -1.02f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 3.56f, 13.0f)
                lineTo(5.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(3.56f, 11.0f)
                curveToRelative(0.19f, -1.6f, 0.82f, -3.06f, 1.76f, -4.26f)
                lineToRelative(0.97f, 0.97f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, -1.42f)
                lineToRelative(-0.97f, -0.97f)
                arcTo(8.46f, 8.46f, 0.0f, false, true, 11.0f, 3.56f)
                close()
                moveTo(16.76f, 6.63f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.8f, 0.02f)
                lineToRelative(-0.23f, 0.18f)
                arcToRelative(396.1f, 396.1f, 0.0f, false, false, -4.21f, 3.6f)
                arcToRelative(37.86f, 37.86f, 0.0f, false, false, -1.1f, 1.05f)
                curveToRelative(-0.66f, 0.8f, -0.52f, 1.98f, 0.3f, 2.62f)
                curveToRelative(0.83f, 0.64f, 2.03f, 0.5f, 2.68f, -0.3f)
                arcToRelative(37.18f, 37.18f, 0.0f, false, false, 0.78f, -1.3f)
                arcToRelative(152.48f, 152.48f, 0.0f, false, false, 2.62f, -4.85f)
                lineToRelative(0.13f, -0.24f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.17f, -0.78f)
                close()
            }
        }
        return _topSpeed!!
    }

private var _topSpeed: ImageVector? = null
