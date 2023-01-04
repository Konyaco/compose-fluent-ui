

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DualScreenGroup: ImageVector
    get() {
        if (_dualScreenGroup != null) {
            return _dualScreenGroup!!
        }
        _dualScreenGroup = fluentIcon(name = "Filled.DualScreenGroup") {
            fluentPath {
                moveTo(20.25f, 4.0f)
                curveTo(21.22f, 4.0f, 22.0f, 4.8f, 22.0f, 5.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-7.24f)
                curveToRelative(-0.1f, 0.0f, -0.18f, 0.0f, -0.26f, -0.02f)
                lineTo(12.75f, 4.02f)
                lineToRelative(0.26f, -0.02f)
                horizontalLineToRelative(7.24f)
                close()
                moveTo(11.01f, 4.0f)
                curveToRelative(0.08f, 0.0f, 0.16f, 0.0f, 0.24f, 0.02f)
                verticalLineToRelative(15.96f)
                lineToRelative(-0.24f, 0.02f)
                lineTo(3.76f, 20.0f)
                curveTo(2.79f, 20.0f, 2.0f, 19.2f, 2.0f, 18.25f)
                lineTo(2.0f, 5.75f)
                curveTo(2.0f, 4.8f, 2.79f, 4.0f, 3.76f, 4.0f)
                lineTo(11.0f, 4.0f)
                close()
            }
        }
        return _dualScreenGroup!!
    }

private var _dualScreenGroup: ImageVector? = null
