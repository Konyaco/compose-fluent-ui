

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Beaker: ImageVector
    get() {
        if (_beaker != null) {
            return _beaker!!
        }
        _beaker = fluentIcon(name = "Filled.Beaker") {
            fluentPath {
                moveTo(9.0f, 4.5f)
                verticalLineToRelative(6.24f)
                curveToRelative(0.0f, 0.37f, -0.1f, 0.74f, -0.27f, 1.07f)
                lineTo(7.53f, 14.0f)
                horizontalLineToRelative(8.93f)
                lineToRelative(-1.19f, -2.19f)
                curveToRelative(-0.18f, -0.33f, -0.27f, -0.7f, -0.27f, -1.07f)
                lineTo(15.0f, 4.5f)
                horizontalLineToRelative(1.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.27f, 15.5f)
                lineTo(6.73f, 15.5f)
                lineToRelative(-1.59f, 2.91f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 6.68f, 21.0f)
                horizontalLineToRelative(10.64f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.54f, -2.59f)
                lineToRelative(-1.59f, -2.91f)
                close()
            }
        }
        return _beaker!!
    }

private var _beaker: ImageVector? = null
