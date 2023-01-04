

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowStepIn: ImageVector
    get() {
        if (_arrowStepIn != null) {
            return _arrowStepIn!!
        }
        _arrowStepIn = fluentIcon(name = "Regular.ArrowStepIn") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(9.26f)
                lineToRelative(3.48f, -3.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.04f, 1.08f)
                lineToRelative(-4.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.04f, 0.0f)
                lineTo(6.73f, 9.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.04f, -1.08f)
                lineToRelative(3.48f, 3.3f)
                lineTo(11.25f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        return _arrowStepIn!!
    }

private var _arrowStepIn: ImageVector? = null
