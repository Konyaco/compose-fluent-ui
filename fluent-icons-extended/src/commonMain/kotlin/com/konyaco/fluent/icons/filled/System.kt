

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.System: ImageVector
    get() {
        if (_system != null) {
            return _system!!
        }
        _system = fluentIcon(name = "Filled.System") {
            fluentPath {
                moveTo(4.95f, 5.0f)
                horizontalLineToRelative(14.1f)
                curveTo(20.68f, 5.0f, 22.0f, 6.3f, 22.0f, 7.92f)
                verticalLineToRelative(8.16f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 19.05f, 19.0f)
                lineTo(4.95f, 19.0f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 2.0f, 16.08f)
                lineTo(2.0f, 7.92f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 4.95f, 5.0f)
                close()
                moveTo(4.95f, 7.0f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, -0.95f, 0.92f)
                verticalLineToRelative(8.16f)
                curveToRelative(0.0f, 0.5f, 0.42f, 0.92f, 0.95f, 0.92f)
                horizontalLineToRelative(14.1f)
                curveToRelative(0.53f, 0.0f, 0.95f, -0.41f, 0.95f, -0.92f)
                lineTo(20.0f, 7.92f)
                curveToRelative(0.0f, -0.5f, -0.42f, -0.92f, -0.95f, -0.92f)
                lineTo(4.95f, 7.0f)
                close()
            }
        }
        return _system!!
    }

private var _system: ImageVector? = null
