

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowReplyDown: ImageVector
    get() {
        if (_arrowReplyDown != null) {
            return _arrowReplyDown!!
        }
        _arrowReplyDown = fluentIcon(name = "Regular.ArrowReplyDown") {
            fluentPath {
                moveTo(9.28f, 7.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-5.0f, 5.0f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(5.56f, 13.0f)
                horizontalLineToRelative(7.84f)
                curveToRelative(1.6f, 0.0f, 2.81f, -0.24f, 3.89f, -0.76f)
                lineToRelative(0.24f, -0.13f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 2.58f, -2.58f)
                arcTo(8.4f, 8.4f, 0.0f, false, false, 21.0f, 5.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                curveToRelative(0.0f, 1.48f, -0.23f, 2.52f, -0.71f, 3.43f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, -1.96f, 1.96f)
                curveToRelative(-0.84f, 0.45f, -1.79f, 0.67f, -3.1f, 0.7f)
                lineToRelative(-0.33f, 0.01f)
                horizontalLineTo(5.56f)
                lineToRelative(3.72f, -3.72f)
                close()
            }
        }
        return _arrowReplyDown!!
    }

private var _arrowReplyDown: ImageVector? = null
