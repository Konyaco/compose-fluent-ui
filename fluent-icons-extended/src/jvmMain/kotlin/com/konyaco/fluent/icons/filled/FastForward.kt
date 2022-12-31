

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = fluentIcon(name = "Filled.FastForward") {
            fluentPath {
                moveTo(13.97f, 4.36f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 5.5f)
                verticalLineToRelative(4.0f)
                lineTo(5.47f, 4.35f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 5.51f)
                verticalLineTo(18.5f)
                curveToRelative(0.0f, 0.88f, 0.7f, 1.48f, 1.46f, 1.5f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.32f, 0.0f, 0.64f, -0.12f, 0.92f, -0.36f)
                lineToRelative(6.03f, -5.13f)
                verticalLineToRelative(3.99f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.47f, 1.14f)
                lineToRelative(7.41f, -6.3f)
                curveToRelative(0.82f, -0.7f, 0.82f, -1.97f, 0.0f, -2.67f)
                lineToRelative(-7.4f, -6.3f)
                close()
            }
        }
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
