

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EraserSmall: ImageVector
    get() {
        if (_eraserSmall != null) {
            return _eraserSmall!!
        }
        _eraserSmall = fluentIcon(name = "Regular.EraserSmall") {
            fluentPath {
                moveTo(15.84f, 2.66f)
                curveToRelative(-0.87f, -0.89f, -2.3f, -0.9f, -3.19f, -0.02f)
                lineToRelative(-9.6f, 9.5f)
                curveToRelative(-0.89f, 0.89f, -0.89f, 2.33f, 0.0f, 3.21f)
                lineToRelative(5.1f, 5.0f)
                curveToRelative(0.9f, 0.88f, 2.31f, 0.87f, 3.18f, -0.01f)
                lineToRelative(1.79f, -1.8f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, true, 0.02f, -2.16f)
                lineToRelative(-0.35f, 0.35f)
                lineToRelative(-6.09f, -6.09f)
                lineToRelative(7.0f, -6.94f)
                curveToRelative(0.3f, -0.29f, 0.78f, -0.29f, 1.07f, 0.01f)
                lineToRelative(4.91f, 5.01f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.76f, 0.0f, 1.05f)
                lineToRelative(-3.35f, 3.38f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.16f, -0.04f)
                lineToRelative(2.25f, -2.28f)
                curveToRelative(0.87f, -0.88f, 0.87f, -2.28f, 0.01f, -3.16f)
                lineToRelative(-4.9f, -5.0f)
                close()
                moveTo(5.64f, 11.7f)
                lineToRelative(6.1f, 6.1f)
                lineToRelative(-1.47f, 1.48f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-5.1f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.07f)
                lineToRelative(1.53f, -1.51f)
                close()
                moveTo(17.6f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -3.6f, 3.51f)
                verticalLineToRelative(-0.01f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.6f, -3.5f)
                close()
            }
        }
        return _eraserSmall!!
    }

private var _eraserSmall: ImageVector? = null
