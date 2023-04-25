

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
                lineToRelative(4.63f, 4.63f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, -0.77f, 2.1f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 6.5f, 19.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.14f, 0.0f, 0.28f, 0.0f, 0.42f, -0.02f)
                lineToRelative(2.8f, 2.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(22.0f, 14.5f)
                curveToRelative(0.0f, 1.2f, -0.47f, 2.28f, -1.23f, 3.09f)
                lineTo(9.0f, 5.81f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.93f, 4.21f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 22.0f, 14.5f)
                close()
            }
        }
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
