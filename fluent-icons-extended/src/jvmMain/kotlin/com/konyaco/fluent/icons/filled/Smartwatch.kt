

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Smartwatch: ImageVector
    get() {
        if (_smartwatch != null) {
            return _smartwatch!!
        }
        _smartwatch = fluentIcon(name = "Filled.Smartwatch") {
            fluentPath {
                moveTo(9.5f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.3f)
                curveToRelative(0.46f, -0.2f, 0.97f, -0.3f, 1.5f, -0.3f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.53f, 0.0f, 1.04f, 0.1f, 1.5f, 0.3f)
                lineTo(16.5f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(9.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(18.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(9.0f, 6.0f)
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
            }
        }
        return _smartwatch!!
    }

private var _smartwatch: ImageVector? = null
