

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FlagOff: ImageVector
    get() {
        if (_flagOff != null) {
            return _flagOff!!
        }
        _flagOff = fluentIcon(name = "Filled.FlagOff") {
            fluentPath {
                moveToRelative(2.5f, 2.5f)
                lineToRelative(18.0f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-5.06f, -5.06f)
                lineTo(4.5f, 16.5f)
                verticalLineToRelative(4.75f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.65f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(3.0f, 5.12f)
                lineTo(1.44f, 3.56f)
                arcTo(0.75f, 0.75f, 0.0f, true, true, 2.5f, 2.5f)
                close()
                moveTo(5.12f, 3.0f)
                horizontalLineToRelative(15.13f)
                curveToRelative(0.62f, 0.0f, 0.98f, 0.7f, 0.6f, 1.2f)
                lineTo(16.7f, 9.75f)
                lineToRelative(4.16f, 5.55f)
                curveToRelative(0.38f, 0.5f, 0.02f, 1.2f, -0.6f, 1.2f)
                horizontalLineToRelative(-1.63f)
                lineTo(5.12f, 3.0f)
                close()
            }
        }
        return _flagOff!!
    }

private var _flagOff: ImageVector? = null
