

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CloudOff: ImageVector
    get() {
        if (_cloudOff != null) {
            return _cloudOff!!
        }
        _cloudOff = fluentIcon(name = "Filled.CloudOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(4.57f, 4.57f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -0.7f, 1.9f)
                horizontalLineTo(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(10.69f)
                lineToRelative(4.03f, 4.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(21.5f, 13.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.47f, 3.1f)
                lineTo(8.93f, 5.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 8.49f, 4.0f)
                horizontalLineToRelative(0.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
