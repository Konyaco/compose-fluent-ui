

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = fluentIcon(name = "Filled.Edit") {
            fluentPath {
                moveTo(15.9f, 3.05f)
                arcToRelative(3.58f, 3.58f, 0.0f, true, true, 5.05f, 5.06f)
                lineToRelative(-0.89f, 0.9f)
                lineTo(15.0f, 3.93f)
                lineToRelative(0.9f, -0.9f)
                close()
                moveTo(13.93f, 5.0f)
                lineToRelative(-10.0f, 10.0f)
                curveToRelative(-0.4f, 0.4f, -0.7f, 0.92f, -0.82f, 1.48f)
                lineToRelative(-1.1f, 4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.9f, 0.9f)
                lineToRelative(4.6f, -1.1f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 9.0f, 20.07f)
                lineToRelative(10.0f, -10.0f)
                lineTo(13.94f, 5.0f)
                close()
            }
        }
        return _edit!!
    }

private var _edit: ImageVector? = null
