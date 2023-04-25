

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CloudOff: ImageVector
    get() {
        if (_cloudOff != null) {
            return _cloudOff!!
        }
        _cloudOff = fluentIcon(name = "Regular.CloudOff") {
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
                moveTo(16.44f, 17.5f)
                lineTo(6.5f, 17.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                horizontalLineToRelative(0.26f)
                curveToRelative(0.4f, 0.0f, 0.73f, -0.31f, 0.75f, -0.71f)
                curveToRelative(0.02f, -0.64f, 0.18f, -1.23f, 0.45f, -1.77f)
                lineToRelative(8.48f, 8.48f)
                close()
                moveTo(20.5f, 14.5f)
                curveToRelative(0.0f, 0.78f, -0.3f, 1.5f, -0.79f, 2.03f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, -2.85f, -7.57f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.99f, 5.8f)
                lineToRelative(1.11f, 1.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 6.4f, 3.87f)
                curveToRelative(0.01f, 0.4f, 0.34f, 0.72f, 0.74f, 0.72f)
                horizontalLineToRelative(0.26f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
