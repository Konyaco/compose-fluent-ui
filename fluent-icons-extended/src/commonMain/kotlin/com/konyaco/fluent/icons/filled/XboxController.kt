

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.XboxController: ImageVector
    get() {
        if (_xboxController != null) {
            return _xboxController!!
        }
        _xboxController = fluentIcon(name = "Filled.XboxController") {
            fluentPath {
                moveTo(9.8f, 5.5f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, -1.63f, -0.2f)
                lineToRelative(-1.18f, 0.23f)
                curveToRelative(-0.87f, 0.16f, -1.6f, 0.71f, -2.0f, 1.5f)
                curveToRelative(-1.38f, 2.67f, -2.4f, 4.86f, -2.8f, 6.73f)
                curveToRelative(-0.42f, 1.92f, -0.17f, 3.57f, 1.07f, 5.07f)
                curveToRelative(0.82f, 1.0f, 2.23f, 0.8f, 2.97f, -0.03f)
                lineToRelative(1.81f, -2.09f)
                curveToRelative(0.41f, -0.47f, 1.0f, -0.75f, 1.63f, -0.75f)
                horizontalLineToRelative(4.66f)
                curveToRelative(0.62f, 0.0f, 1.22f, 0.28f, 1.63f, 0.75f)
                lineToRelative(1.82f, 2.09f)
                curveToRelative(0.73f, 0.83f, 2.14f, 1.03f, 2.96f, 0.03f)
                curveToRelative(1.24f, -1.5f, 1.49f, -3.15f, 1.08f, -5.07f)
                curveToRelative(-0.4f, -1.87f, -1.43f, -4.06f, -2.8f, -6.73f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, false, -2.0f, -1.5f)
                lineToRelative(-1.19f, -0.23f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, -1.64f, 0.2f)
                lineToRelative(-0.44f, 0.24f)
                curveToRelative(-0.35f, 0.19f, -0.73f, 0.3f, -1.1f, 0.3f)
                horizontalLineToRelative(-1.3f)
                curveToRelative(-0.37f, 0.0f, -0.75f, -0.11f, -1.1f, -0.3f)
                lineTo(9.8f, 5.5f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        return _xboxController!!
    }

private var _xboxController: ImageVector? = null
