

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Smartwatch: ImageVector
    get() {
        if (_smartwatch != null) {
            return _smartwatch!!
        }
        _smartwatch = fluentIcon(name = "Regular.Smartwatch") {
            fluentPath {
                moveTo(7.5f, 6.4f)
                lineTo(7.5f, 4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(2.4f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 9.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.5f, 2.6f)
                lineTo(16.5f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-2.4f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 15.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.5f, -2.6f)
                close()
                moveTo(9.5f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(16.5f, 15.0f)
                lineTo(16.5f, 9.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(9.0f, 7.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(9.0f, 20.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                lineTo(9.0f, 18.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        return _smartwatch!!
    }

private var _smartwatch: ImageVector? = null
