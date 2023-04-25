

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CaretUp: ImageVector
    get() {
        if (_caretUp != null) {
            return _caretUp!!
        }
        _caretUp = fluentIcon(name = "Regular.CaretUp") {
            fluentPath {
                moveTo(5.16f, 14.9f)
                curveToRelative(-0.7f, 0.82f, -0.13f, 2.08f, 0.94f, 2.08f)
                horizontalLineToRelative(11.8f)
                curveToRelative(1.07f, 0.0f, 1.65f, -1.26f, 0.94f, -2.07f)
                lineTo(13.32f, 8.6f)
                curveToRelative(-0.7f, -0.8f, -1.94f, -0.8f, -2.64f, 0.0f)
                lineToRelative(-5.52f, 6.3f)
                close()
                moveTo(6.66f, 15.48f)
                lineTo(11.81f, 9.58f)
                curveToRelative(0.1f, -0.1f, 0.28f, -0.1f, 0.38f, 0.0f)
                lineToRelative(5.16f, 5.9f)
                lineTo(6.65f, 15.48f)
                close()
            }
        }
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
