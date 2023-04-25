

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.OpenOff: ImageVector
    get() {
        if (_openOff != null) {
            return _openOff!!
        }
        _openOff = fluentIcon(name = "Regular.OpenOff") {
            fluentPath {
                moveToRelative(3.28f, 2.22f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-1.26f, -1.26f)
                curveToRelative(-0.5f, 0.3f, -1.08f, 0.48f, -1.71f, 0.48f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveToRelative(0.0f, -0.63f, 0.18f, -1.21f, 0.48f, -1.7f)
                lineTo(2.22f, 3.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                close()
                moveTo(18.34f, 19.4f)
                lineTo(4.6f, 5.66f)
                curveToRelative(-0.06f, 0.19f, -0.1f, 0.38f, -0.1f, 0.59f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.2f, 0.0f, 0.4f, -0.04f, 0.59f, -0.1f)
                close()
                moveTo(13.08f, 9.9f)
                lineTo(14.1f, 10.92f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.18f, -0.14f)
                lineToRelative(5.22f, -5.22f)
                verticalLineToRelative(4.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.69f)
                lineToRelative(-5.22f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.14f, 0.18f)
                close()
                moveTo(21.0f, 17.82f)
                lineToRelative(-1.5f, -1.5f)
                verticalLineToRelative(-2.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(4.07f)
                close()
                moveTo(6.18f, 3.0f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(2.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(6.18f, 3.0f)
                close()
            }
        }
        return _openOff!!
    }

private var _openOff: ImageVector? = null
