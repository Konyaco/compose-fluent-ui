

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoChat: ImageVector
    get() {
        if (_videoChat != null) {
            return _videoChat!!
        }
        _videoChat = fluentIcon(name = "Filled.VideoChat") {
            fluentPath {
                moveTo(16.0f, 16.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-0.48f)
                curveToRelative(0.47f, -0.9f, 0.73f, -1.92f, 0.73f, -3.0f)
                curveToRelative(0.0f, -2.02f, -0.7f, -3.64f, -2.36f, -5.02f)
                arcTo(5.99f, 5.99f, 0.0f, false, false, 6.5f, 10.0f)
                curveToRelative(-1.75f, 0.0f, -3.33f, 0.69f, -4.5f, 1.81f)
                lineTo(2.0f, 7.75f)
                curveTo(2.0f, 5.95f, 3.46f, 4.5f, 5.25f, 4.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(21.76f, 5.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.24f, 0.65f)
                verticalLineToRelative(10.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.65f, 0.76f)
                lineTo(17.0f, 15.37f)
                lineTo(17.0f, 8.63f)
                lineToRelative(3.35f, -2.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.11f)
                close()
                moveTo(10.0f, 12.26f)
                arcTo(5.48f, 5.48f, 0.0f, false, false, 6.5f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -4.81f, 8.17f)
                lineToRelative(-0.67f, 2.19f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.63f, 0.62f)
                lineToRelative(2.18f, -0.67f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 10.0f, 12.25f)
                close()
                moveTo(4.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(6.5f, 18.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                close()
            }
        }
        return _videoChat!!
    }

private var _videoChat: ImageVector? = null
