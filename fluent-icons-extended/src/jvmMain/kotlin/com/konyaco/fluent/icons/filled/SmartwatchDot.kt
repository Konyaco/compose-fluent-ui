

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SmartwatchDot: ImageVector
    get() {
        if (_smartwatchDot != null) {
            return _smartwatchDot!!
        }
        _smartwatchDot = fluentIcon(name = "Filled.SmartwatchDot") {
            fluentPath {
                moveTo(14.5f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.79f, 1.1f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -0.23f, 2.04f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                curveToRelative(-0.53f, 0.0f, -1.04f, 0.1f, -1.5f, 0.3f)
                lineTo(7.5f, 4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(15.0f, 6.0f)
                curveToRelative(0.59f, 0.0f, 1.14f, 0.17f, 1.6f, 0.46f)
                curveToRelative(0.25f, 0.37f, 0.57f, 0.69f, 0.94f, 0.94f)
                curveToRelative(0.29f, 0.46f, 0.46f, 1.01f, 0.46f, 1.6f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(9.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(9.0f, 19.0f)
                curveToRelative(-0.53f, 0.0f, -1.04f, -0.1f, -1.5f, -0.3f)
                lineTo(7.5f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-1.3f)
                curveToRelative(-0.46f, 0.2f, -0.97f, 0.3f, -1.5f, 0.3f)
                lineTo(9.0f, 19.0f)
                close()
                moveTo(22.0f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                close()
            }
        }
        return _smartwatchDot!!
    }

private var _smartwatchDot: ImageVector? = null
