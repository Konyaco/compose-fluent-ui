

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LinkSquare: ImageVector
    get() {
        if (_linkSquare != null) {
            return _linkSquare!!
        }
        _linkSquare = fluentIcon(name = "Filled.LinkSquare") {
            fluentPath {
                moveTo(6.5f, 3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 6.5f)
                verticalLineToRelative(6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 12.5f)
                verticalLineToRelative(-6.0f)
                curveTo(5.0f, 5.67f, 5.67f, 5.0f, 6.5f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(10.0f, 11.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(-1.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 11.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, 3.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.5f, 8.0f)
                lineTo(17.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        return _linkSquare!!
    }

private var _linkSquare: ImageVector? = null
