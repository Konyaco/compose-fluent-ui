

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = fluentIcon(name = "Filled.Tag") {
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
                moveTo(17.0f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        return _tag!!
    }

private var _tag: ImageVector? = null
