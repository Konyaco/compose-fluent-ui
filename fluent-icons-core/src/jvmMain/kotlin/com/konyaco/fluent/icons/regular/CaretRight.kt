

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CaretRight: ImageVector
    get() {
        if (_caretRight != null) {
            return _caretRight!!
        }
        _caretRight = fluentIcon(name = "Regular.CaretRight") {
            fluentPath {
                moveTo(11.07f, 18.84f)
                curveToRelative(-0.8f, 0.7f, -2.07f, 0.13f, -2.07f, -0.94f)
                lineTo(9.0f, 6.1f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.07f, -0.94f)
                lineToRelative(6.31f, 5.52f)
                curveToRelative(0.8f, 0.7f, 0.8f, 1.94f, 0.0f, 2.64f)
                lineToRelative(-6.3f, 5.52f)
                close()
                moveTo(10.5f, 17.34f)
                lineToRelative(5.9f, -5.15f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.38f)
                lineToRelative(-5.9f, -5.16f)
                verticalLineToRelative(10.7f)
                close()
            }
        }
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
