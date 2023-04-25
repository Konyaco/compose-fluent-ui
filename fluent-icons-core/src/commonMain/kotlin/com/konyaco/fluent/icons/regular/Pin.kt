

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = fluentIcon(name = "Regular.Pin") {
            fluentPath {
                moveToRelative(16.24f, 2.93f)
                lineToRelative(4.83f, 4.83f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.72f, 4.4f)
                lineToRelative(-4.87f, 2.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.37f, 0.42f)
                lineToRelative(-1.44f, 4.17f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.07f, 0.48f)
                lineToRelative(-3.1f, -3.1f)
                lineTo(4.06f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-1.06f)
                lineToRelative(4.44f, -4.44f)
                lineToRelative(-3.1f, -3.1f)
                curveToRelative(-0.66f, -0.66f, -0.4f, -1.77f, 0.47f, -2.07f)
                lineToRelative(4.17f, -1.44f)
                curveToRelative(0.18f, -0.06f, 0.34f, -0.2f, 0.42f, -0.37f)
                lineToRelative(2.44f, -4.87f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 4.4f, -0.72f)
                close()
                moveTo(20.01f, 8.82f)
                lineTo(15.18f, 3.99f)
                curveToRelative(-0.6f, -0.6f, -1.62f, -0.44f, -2.0f, 0.33f)
                lineToRelative(-2.44f, 4.87f)
                curveToRelative(-0.26f, 0.52f, -0.72f, 0.93f, -1.27f, 1.12f)
                lineToRelative(-3.8f, 1.3f)
                lineToRelative(6.71f, 6.71f)
                lineToRelative(1.31f, -3.79f)
                curveToRelative(0.2f, -0.55f, 0.6f, -1.01f, 1.12f, -1.27f)
                lineToRelative(4.87f, -2.44f)
                curveToRelative(0.77f, -0.38f, 0.93f, -1.4f, 0.33f, -2.0f)
                close()
            }
        }
        return _pin!!
    }

private var _pin: ImageVector? = null
