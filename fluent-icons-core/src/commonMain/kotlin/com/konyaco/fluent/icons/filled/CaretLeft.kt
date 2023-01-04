

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = fluentIcon(name = "Filled.CaretLeft") {
            fluentPath {
                moveTo(15.0f, 17.9f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.07f, 0.94f)
                lineToRelative(-6.31f, -5.52f)
                curveToRelative(-0.8f, -0.7f, -0.8f, -1.94f, 0.0f, -2.64f)
                lineToRelative(6.3f, -5.52f)
                curveToRelative(0.82f, -0.7f, 2.08f, -0.13f, 2.08f, 0.94f)
                verticalLineToRelative(11.8f)
                close()
            }
        }
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
