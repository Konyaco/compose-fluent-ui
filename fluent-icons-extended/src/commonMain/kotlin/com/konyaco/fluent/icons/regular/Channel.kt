

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Channel: ImageVector
    get() {
        if (_channel != null) {
            return _channel!!
        }
        _channel = fluentIcon(name = "Regular.Channel") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 21.0f, 6.07f)
                verticalLineToRelative(11.68f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                lineTo(6.25f, 21.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(3.0f, 17.75f)
                lineTo(3.0f, 9.37f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(8.38f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, -0.7f, 1.74f, -1.6f)
                lineToRelative(0.01f, -0.15f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.92f, -0.7f, -1.67f, -1.6f, -1.74f)
                lineToRelative(-0.15f, -0.01f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.6f, 0.0f, -1.13f, 0.3f, -1.44f, 0.76f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, -1.59f, -0.2f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.85f, -2.05f)
                lineTo(6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(13.25f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.49f)
                horizontalLineToRelative(4.6f)
                close()
                moveTo(15.25f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.49f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.49f)
                horizontalLineToRelative(6.6f)
                close()
                moveTo(3.75f, 6.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
            }
        }
        return _channel!!
    }

private var _channel: ImageVector? = null
