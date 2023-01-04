

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Comma: ImageVector
    get() {
        if (_comma != null) {
            return _comma!!
        }
        _comma = fluentIcon(name = "Filled.Comma") {
            fluentPath {
                moveTo(14.2f, 12.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 1.77f, -3.87f)
                curveToRelative(0.36f, 1.8f, 0.5f, 3.95f, -0.21f, 5.9f)
                curveToRelative(-0.77f, 2.09f, -2.47f, 3.8f, -5.5f, 4.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.51f, -1.94f)
                curveToRelative(2.46f, -0.64f, 3.6f, -1.93f, 4.13f, -3.35f)
                curveToRelative(0.16f, -0.43f, 0.26f, -0.88f, 0.32f, -1.34f)
                close()
            }
        }
        return _comma!!
    }

private var _comma: ImageVector? = null
