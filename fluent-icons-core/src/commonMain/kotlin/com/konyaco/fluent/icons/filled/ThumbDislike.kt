

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ThumbDislike: ImageVector
    get() {
        if (_thumbDislike != null) {
            return _thumbDislike!!
        }
        _thumbDislike = fluentIcon(name = "Filled.ThumbDislike") {
            fluentPath {
                moveTo(15.06f, 14.18f)
                curveToRelative(0.46f, 1.43f, 0.69f, 2.68f, 0.69f, 3.76f)
                curveToRelative(0.0f, 2.4f, -0.94f, 4.24f, -2.5f, 4.24f)
                curveToRelative(-0.8f, 0.0f, -1.08f, -0.45f, -1.38f, -1.54f)
                lineToRelative(-0.27f, -1.02f)
                arcToRelative(264.6f, 264.6f, 0.0f, false, false, -0.56f, -1.9f)
                lineToRelative(-2.87f, -4.49f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, false, -2.85f, -2.32f)
                lineToRelative(-1.26f, -0.48f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.09f, -1.97f)
                lineToRelative(0.69f, -3.54f)
                curveToRelative(0.16f, -0.86f, 0.82f, -1.55f, 1.67f, -1.76f)
                lineToRelative(8.25f, -2.02f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 5.73f, 3.44f)
                lineToRelative(1.58f, 6.17f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.67f, 3.43f)
                horizontalLineToRelative(-3.16f)
                close()
            }
        }
        return _thumbDislike!!
    }

private var _thumbDislike: ImageVector? = null
