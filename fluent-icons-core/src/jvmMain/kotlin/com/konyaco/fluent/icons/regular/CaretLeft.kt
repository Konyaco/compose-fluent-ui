

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = fluentIcon(name = "Regular.CaretLeft") {
            fluentPath {
                moveTo(12.93f, 18.84f)
                curveToRelative(0.8f, 0.7f, 2.07f, 0.13f, 2.07f, -0.94f)
                lineTo(15.0f, 6.1f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -2.07f, -0.94f)
                lineToRelative(-6.31f, 5.52f)
                curveToRelative(-0.8f, 0.7f, -0.8f, 1.94f, 0.0f, 2.64f)
                lineToRelative(6.3f, 5.52f)
                close()
                moveTo(13.5f, 17.34f)
                lineTo(7.6f, 12.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.38f)
                lineToRelative(5.9f, -5.16f)
                verticalLineToRelative(10.7f)
                close()
            }
        }
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
