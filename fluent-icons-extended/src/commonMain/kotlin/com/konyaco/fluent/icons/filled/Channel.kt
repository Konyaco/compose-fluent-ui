

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Channel: ImageVector
    get() {
        if (_channel != null) {
            return _channel!!
        }
        _channel = fluentIcon(name = "Filled.Channel") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.45f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 9.37f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.22f, -4.3f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(13.25f, 13.0f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.49f)
                lineTo(13.35f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(15.25f, 9.5f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.49f)
                lineTo(15.35f, 10.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
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
