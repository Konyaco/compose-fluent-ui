

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BreakoutRoom: ImageVector
    get() {
        if (_breakoutRoom != null) {
            return _breakoutRoom!!
        }
        _breakoutRoom = fluentIcon(name = "Filled.BreakoutRoom") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.04f)
                curveToRelative(0.8f, -0.85f, 1.29f, -2.0f, 1.29f, -3.25f)
                verticalLineToRelative(-3.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 9.25f, 10.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.26f, 0.0f, -2.4f, 0.49f, -3.25f, 1.29f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(3.0f, 14.75f)
                verticalLineToRelative(3.0f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 14.75f)
                close()
            }
        }
        return _breakoutRoom!!
    }

private var _breakoutRoom: ImageVector? = null
