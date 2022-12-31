

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = fluentIcon(name = "Filled.Pin") {
            fluentPath {
                moveTo(21.07f, 7.76f)
                lineToRelative(-4.83f, -4.83f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -4.4f, 0.72f)
                lineTo(9.4f, 8.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.42f, 0.37f)
                lineTo(4.8f, 10.33f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.48f, 2.07f)
                lineToRelative(3.1f, 3.1f)
                lineTo(3.0f, 19.94f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(1.06f)
                lineToRelative(4.44f, -4.44f)
                lineToRelative(3.1f, 3.1f)
                curveToRelative(0.66f, 0.66f, 1.77f, 0.4f, 2.07f, -0.47f)
                lineToRelative(1.44f, -4.17f)
                curveToRelative(0.06f, -0.18f, 0.2f, -0.33f, 0.37f, -0.42f)
                lineToRelative(4.87f, -2.44f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.72f, -4.4f)
                close()
            }
        }
        return _pin!!
    }

private var _pin: ImageVector? = null
