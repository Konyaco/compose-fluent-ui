

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WindowWrench: ImageVector
    get() {
        if (_windowWrench != null) {
            return _windowWrench!!
        }
        _windowWrench = fluentIcon(name = "Regular.WindowWrench") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(5.66f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -0.99f, -0.8f)
                arcToRelative(5.08f, 5.08f, 0.0f, false, false, -0.51f, -0.08f)
                lineTo(19.5f, 8.5f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(9.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(5.68f)
                lineToRelative(-0.19f, 0.19f)
                curveToRelative(-0.37f, 0.37f, -0.6f, 0.83f, -0.7f, 1.31f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(4.5f, 7.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(12.07f, 21.0f)
                curveToRelative(0.08f, -0.22f, 0.2f, -0.43f, 0.38f, -0.6f)
                lineToRelative(2.73f, -2.74f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, 4.62f, -5.57f)
                curveToRelative(0.21f, 0.05f, 0.33f, 0.23f, 0.33f, 0.42f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.15f, 0.35f)
                lineToRelative(-1.9f, 1.9f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, false, 2.16f, 2.16f)
                lineToRelative(1.9f, -1.9f)
                curveToRelative(0.26f, -0.26f, 0.69f, -0.17f, 0.77f, 0.18f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -5.57f, 4.62f)
                lineToRelative(-2.73f, 2.73f)
                arcTo(1.53f, 1.53f, 0.0f, false, true, 12.07f, 21.0f)
                close()
                moveTo(17.57f, 21.0f)
                horizontalLineToRelative(0.15f)
                lineToRelative(-0.12f, -0.03f)
                lineToRelative(-0.03f, 0.03f)
                close()
            }
        }
        return _windowWrench!!
    }

private var _windowWrench: ImageVector? = null
