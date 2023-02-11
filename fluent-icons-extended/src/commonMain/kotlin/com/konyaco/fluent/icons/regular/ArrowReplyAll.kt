

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowReplyAll: ImageVector
    get() {
        if (_arrowReplyAll != null) {
            return _arrowReplyAll!!
        }
        _arrowReplyAll = fluentIcon(name = "Regular.ArrowReplyAll") {
            fluentPath {
                moveTo(13.28f, 16.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 1.06f)
                lineTo(9.56f, 11.0f)
                horizontalLineToRelative(3.84f)
                curveToRelative(1.6f, 0.0f, 2.81f, 0.24f, 3.89f, 0.76f)
                lineToRelative(0.24f, 0.13f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 2.58f, 2.58f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 21.0f, 18.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                curveToRelative(0.0f, -1.48f, -0.23f, -2.52f, -0.71f, -3.43f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -1.96f, -1.96f)
                arcToRelative(6.63f, 6.63f, 0.0f, false, false, -3.1f, -0.7f)
                lineToRelative(-0.33f, -0.01f)
                lineTo(9.56f, 12.5f)
                lineToRelative(3.72f, 3.72f)
                close()
                moveTo(9.28f, 6.22f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.77f, 0.0f, 1.06f)
                lineTo(4.8f, 11.75f)
                lineToRelative(4.47f, 4.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(5.0f, -5.0f)
                curveToRelative(0.29f, -0.3f, 0.76f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _arrowReplyAll!!
    }

private var _arrowReplyAll: ImageVector? = null
