

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.OpenOff: ImageVector
    get() {
        if (_openOff != null) {
            return _openOff!!
        }
        _openOff = fluentIcon(name = "Filled.OpenOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-1.08f, -1.08f)
                curveToRelative(-0.55f, 0.35f, -1.2f, 0.55f, -1.89f, 0.55f)
                lineTo(6.25f, 21.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, -3.5f)
                lineTo(2.75f, 6.25f)
                curveToRelative(0.0f, -0.7f, 0.2f, -1.34f, 0.55f, -1.89f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                close()
                moveTo(18.14f, 19.2f)
                lineTo(4.8f, 5.86f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.05f, 0.39f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.13f, 0.0f, 0.26f, -0.02f, 0.39f, -0.05f)
                close()
                moveTo(12.9f, 9.72f)
                lineToRelative(1.38f, 1.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.18f, -0.14f)
                lineToRelative(4.79f, -4.8f)
                verticalLineToRelative(4.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(4.09f)
                lineToRelative(-4.8f, 4.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.14f, 0.17f)
                close()
                moveTo(21.24f, 18.05f)
                lineToRelative(-1.99f, -1.98f)
                verticalLineToRelative(-2.32f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(-0.01f, 0.3f)
                close()
                moveTo(5.94f, 2.76f)
                lineToRelative(2.0f, 1.99f)
                horizontalLineToRelative(2.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.3f, 0.01f)
                close()
            }
        }
        return _openOff!!
    }

private var _openOff: ImageVector? = null
