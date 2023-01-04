

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = fluentIcon(name = "Regular.Tag") {
            fluentPath {
                moveTo(19.75f, 2.0f)
                curveTo(20.99f, 2.0f, 22.0f, 3.0f, 22.0f, 4.25f)
                verticalLineToRelative(5.46f)
                curveToRelative(0.0f, 0.86f, -0.34f, 1.69f, -0.95f, 2.3f)
                lineToRelative(-8.5f, 8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -4.6f, 0.0f)
                lineTo(3.5f, 16.06f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, -4.6f)
                lineToRelative(8.5f, -8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.3f, -0.96f)
                horizontalLineToRelative(5.46f)
                close()
                moveTo(19.75f, 3.5f)
                horizontalLineToRelative(-5.47f)
                curveToRelative(-0.46f, 0.0f, -0.9f, 0.18f, -1.23f, 0.51f)
                lineToRelative(-8.52f, 8.53f)
                curveToRelative(-0.67f, 0.68f, -0.66f, 1.78f, 0.02f, 2.46f)
                lineTo(9.0f, 19.45f)
                curveToRelative(0.68f, 0.68f, 1.8f, 0.68f, 2.48f, 0.0f)
                lineToRelative(8.5f, -8.5f)
                curveToRelative(0.33f, -0.33f, 0.51f, -0.77f, 0.51f, -1.24f)
                lineTo(20.49f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(17.0f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        return _tag!!
    }

private var _tag: ImageVector? = null
