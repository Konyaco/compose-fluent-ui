

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = fluentIcon(name = "Filled.Pen") {
            fluentPath {
                moveTo(15.9f, 3.05f)
                arcToRelative(3.58f, 3.58f, 0.0f, true, true, 5.05f, 5.06f)
                lineToRelative(-0.89f, 0.89f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, 4.6f)
                lineToRelative(-1.79f, 1.77f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(19.0f, 12.53f)
                curveToRelative(0.68f, -0.68f, 0.68f, -1.79f, 0.0f, -2.47f)
                lineToRelative(-10.0f, 10.0f)
                curveToRelative(-0.4f, 0.4f, -0.92f, 0.7f, -1.48f, 0.82f)
                lineToRelative(-4.6f, 1.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.9f, -0.9f)
                lineToRelative(1.1f, -4.6f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 3.94f, 15.0f)
                lineTo(15.9f, 3.05f)
                close()
            }
        }
        return _pen!!
    }

private var _pen: ImageVector? = null
