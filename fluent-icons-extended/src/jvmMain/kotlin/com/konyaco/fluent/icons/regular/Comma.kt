

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Comma: ImageVector
    get() {
        if (_comma != null) {
            return _comma!!
        }
        _comma = fluentIcon(name = "Regular.Comma") {
            fluentPath {
                moveTo(14.62f, 12.02f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 1.35f, -3.48f)
                curveToRelative(0.36f, 1.81f, 0.36f, 3.97f, -0.46f, 5.9f)
                curveToRelative(-0.86f, 2.04f, -2.6f, 3.76f, -5.57f, 4.54f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.38f, -1.46f)
                curveToRelative(2.53f, -0.66f, 3.9f, -2.06f, 4.57f, -3.66f)
                curveToRelative(0.24f, -0.59f, 0.4f, -1.2f, 0.49f, -1.84f)
                close()
            }
        }
        return _comma!!
    }

private var _comma: ImageVector? = null
