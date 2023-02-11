

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = fluentIcon(name = "Regular.Edit") {
            fluentPath {
                moveTo(20.95f, 3.05f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -5.06f, 0.0f)
                lineTo(3.94f, 15.0f)
                curveToRelative(-0.4f, 0.4f, -0.7f, 0.92f, -0.82f, 1.48f)
                lineToRelative(-1.1f, 4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.9f, 0.9f)
                lineToRelative(4.6f, -1.1f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 9.0f, 20.07f)
                lineTo(20.95f, 8.11f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, 0.0f, -5.06f)
                close()
                moveTo(16.95f, 4.11f)
                arcToRelative(2.08f, 2.08f, 0.0f, true, true, 2.94f, 2.94f)
                lineToRelative(-0.89f, 0.89f)
                lineTo(16.06f, 5.0f)
                lineToRelative(0.9f, -0.9f)
                close()
                moveTo(15.0f, 6.06f)
                lineTo(17.94f, 9.0f)
                lineToRelative(-10.0f, 10.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -0.76f, 0.43f)
                lineToRelative(-3.42f, 0.8f)
                lineToRelative(0.82f, -3.4f)
                curveToRelative(0.06f, -0.3f, 0.21f, -0.56f, 0.42f, -0.77f)
                lineToRelative(10.0f, -10.0f)
                close()
            }
        }
        return _edit!!
    }

private var _edit: ImageVector? = null
