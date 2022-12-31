

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowBidirectionalUpDown: ImageVector
    get() {
        if (_arrowBidirectionalUpDown != null) {
            return _arrowBidirectionalUpDown!!
        }
        _arrowBidirectionalUpDown = fluentIcon(name = "Regular.ArrowBidirectionalUpDown") {
            fluentPath {
                moveTo(11.25f, 5.63f)
                verticalLineToRelative(12.74f)
                lineToRelative(-3.46f, -3.64f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.08f, 1.04f)
                lineToRelative(4.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.08f, 0.0f)
                lineToRelative(4.75f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.08f, -1.04f)
                lineToRelative(-3.46f, 3.64f)
                verticalLineTo(5.63f)
                lineToRelative(3.46f, 3.64f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.08f, -1.04f)
                lineToRelative(-4.75f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.08f, 0.0f)
                lineToRelative(-4.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.08f, 1.04f)
                lineToRelative(3.46f, -3.64f)
                close()
            }
        }
        return _arrowBidirectionalUpDown!!
    }

private var _arrowBidirectionalUpDown: ImageVector? = null
