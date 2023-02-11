

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FlashCheckmark: ImageVector
    get() {
        if (_flashCheckmark != null) {
            return _flashCheckmark!!
        }
        _flashCheckmark = fluentIcon(name = "Regular.FlashCheckmark") {
            fluentPath {
                moveTo(7.42f, 2.83f)
                curveTo(7.6f, 2.33f, 8.07f, 2.0f, 8.6f, 2.0f)
                horizontalLineToRelative(6.46f)
                curveToRelative(0.85f, 0.0f, 1.45f, 0.84f, 1.18f, 1.65f)
                lineTo(14.8f, 8.0f)
                horizontalLineToRelative(3.96f)
                curveToRelative(1.1f, 0.0f, 1.66f, 1.33f, 0.9f, 2.12f)
                lineToRelative(-0.96f, 0.99f)
                arcToRelative(6.53f, 6.53f, 0.0f, false, false, -2.04f, -0.06f)
                lineToRelative(1.5f, -1.55f)
                horizontalLineToRelative(-4.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.71f, -0.99f)
                lineTo(14.7f, 3.5f)
                lineTo(8.78f, 3.5f)
                lineToRelative(-3.26f, 9.16f)
                curveToRelative(-0.06f, 0.16f, 0.06f, 0.33f, 0.23f, 0.33f)
                lineToRelative(2.5f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.73f, 0.91f)
                lineTo(7.51f, 20.5f)
                lineToRelative(3.52f, -3.63f)
                arcToRelative(6.57f, 6.57f, 0.0f, false, false, 0.12f, 2.03f)
                lineToRelative(-2.56f, 2.65f)
                curveToRelative(-1.06f, 1.08f, -2.88f, 0.1f, -2.55f, -1.38f)
                lineToRelative(1.27f, -5.66f)
                lineToRelative(-1.57f, -0.01f)
                curveToRelative(-1.2f, 0.0f, -2.04f, -1.2f, -1.64f, -2.34f)
                lineToRelative(3.32f, -9.32f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(20.85f, 15.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineToRelative(-3.65f, 3.64f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                close()
            }
        }
        return _flashCheckmark!!
    }

private var _flashCheckmark: ImageVector? = null
