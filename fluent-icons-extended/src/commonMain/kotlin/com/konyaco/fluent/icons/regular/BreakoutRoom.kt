

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BreakoutRoom: ImageVector
    get() {
        if (_breakoutRoom != null) {
            return _breakoutRoom!!
        }
        _breakoutRoom = fluentIcon(name = "Regular.BreakoutRoom") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-3.54f)
                curveToRelative(0.41f, -0.43f, 0.74f, -0.94f, 0.96f, -1.5f)
                horizontalLineToRelative(2.58f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineTo(6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineTo(6.25f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(2.58f)
                curveToRelative(-0.56f, 0.22f, -1.07f, 0.55f, -1.5f, 0.96f)
                verticalLineTo(6.25f)
                close()
                moveTo(13.49f, 19.5f)
                curveToRelative(-0.58f, 0.9f, -1.59f, 1.5f, -2.74f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineToRelative(-4.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 6.25f, 10.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.64f, -0.19f, 1.24f, -0.51f, 1.75f)
                close()
                moveTo(4.5f, 13.25f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                close()
            }
        }
        return _breakoutRoom!!
    }

private var _breakoutRoom: ImageVector? = null
