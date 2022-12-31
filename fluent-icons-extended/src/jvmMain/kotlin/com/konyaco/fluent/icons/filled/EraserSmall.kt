

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EraserSmall: ImageVector
    get() {
        if (_eraserSmall != null) {
            return _eraserSmall!!
        }
        _eraserSmall = fluentIcon(name = "Filled.EraserSmall") {
            fluentPath {
                moveTo(12.65f, 2.64f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.2f, 0.02f)
                lineToRelative(4.9f, 5.0f)
                curveToRelative(0.86f, 0.89f, 0.86f, 2.3f, 0.0f, 3.17f)
                lineToRelative(-2.26f, 2.28f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, false, -5.37f, 5.42f)
                lineToRelative(-1.79f, 1.8f)
                curveToRelative(-0.87f, 0.89f, -2.29f, 0.9f, -3.17f, 0.03f)
                lineToRelative(-5.1f, -5.01f)
                curveToRelative(-0.9f, -0.88f, -0.9f, -2.32f, 0.0f, -3.2f)
                lineToRelative(9.6f, -9.51f)
                close()
                moveTo(4.11f, 13.2f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.78f, 0.0f, 1.07f)
                lineToRelative(5.1f, 5.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(1.47f, -1.48f)
                lineToRelative(-6.1f, -6.1f)
                lineTo(4.1f, 13.2f)
                close()
                moveTo(17.5f, 21.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                close()
            }
        }
        return _eraserSmall!!
    }

private var _eraserSmall: ImageVector? = null
