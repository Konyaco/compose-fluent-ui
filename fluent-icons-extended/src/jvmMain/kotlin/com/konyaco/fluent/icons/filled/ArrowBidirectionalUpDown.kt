

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowBidirectionalUpDown: ImageVector
    get() {
        if (_arrowBidirectionalUpDown != null) {
            return _arrowBidirectionalUpDown!!
        }
        _arrowBidirectionalUpDown = fluentIcon(name = "Filled.ArrowBidirectionalUpDown") {
            fluentPath {
                moveTo(7.97f, 9.69f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 6.54f, 8.3f)
                lineToRelative(4.75f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.45f, 0.0f)
                lineToRelative(4.75f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.46f, 1.38f)
                lineTo(13.0f, 6.5f)
                verticalLineToRelative(11.0f)
                lineToRelative(3.02f, -3.19f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.46f, 1.38f)
                lineToRelative(-4.76f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.45f, 0.0f)
                lineToRelative(-4.74f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.44f, -1.38f)
                lineTo(11.0f, 17.5f)
                verticalLineToRelative(-11.0f)
                lineTo(7.97f, 9.7f)
                close()
            }
        }
        return _arrowBidirectionalUpDown!!
    }

private var _arrowBidirectionalUpDown: ImageVector? = null
