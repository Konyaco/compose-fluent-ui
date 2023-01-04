

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WindowWrench: ImageVector
    get() {
        if (_windowWrench != null) {
            return _windowWrench!!
        }
        _windowWrench = fluentIcon(name = "Filled.WindowWrench") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(4.8f)
                curveToRelative(0.09f, -0.48f, 0.32f, -0.94f, 0.69f, -1.31f)
                lineToRelative(0.19f, -0.19f)
                lineTo(6.25f, 19.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(4.5f, 8.5f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.53f)
                lineToRelative(0.51f, 0.09f)
                curveToRelative(0.47f, 0.1f, 0.82f, 0.4f, 0.99f, 0.79f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(20.13f, 12.51f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.33f, -0.42f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, -3.75f, 1.1f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, -0.87f, 4.47f)
                lineToRelative(-2.73f, 2.73f)
                arcToRelative(1.52f, 1.52f, 0.0f, false, false, 0.0f, 2.16f)
                curveToRelative(0.6f, 0.6f, 1.56f, 0.6f, 2.16f, 0.0f)
                lineToRelative(2.73f, -2.73f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, 5.57f, -4.62f)
                curveToRelative(-0.08f, -0.35f, -0.51f, -0.44f, -0.77f, -0.18f)
                lineToRelative(-1.9f, 1.9f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, -0.74f, 0.4f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, -1.42f, -2.56f)
                lineToRelative(1.9f, -1.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.15f, -0.35f)
                close()
                moveTo(17.72f, 21.0f)
                lineToRelative(-0.12f, -0.03f)
                lineToRelative(-0.03f, 0.03f)
                horizontalLineToRelative(0.15f)
                close()
            }
        }
        return _windowWrench!!
    }

private var _windowWrench: ImageVector? = null
