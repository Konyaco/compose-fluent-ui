

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = fluentIcon(name = "Regular.Cloud") {
            fluentPath {
                moveTo(6.09f, 9.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 11.32f, 0.0f)
                horizontalLineToRelative(0.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(6.0f, 17.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(0.09f)
                close()
                moveTo(11.75f, 6.5f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.24f, 4.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.71f)
                lineTo(6.0f, 11.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                horizontalLineToRelative(-0.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.71f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.24f, -4.04f)
                close()
            }
        }
        return _cloud!!
    }

private var _cloud: ImageVector? = null
