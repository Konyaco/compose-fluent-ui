

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowBetweenDown: ImageVector
    get() {
        if (_arrowBetweenDown != null) {
            return _arrowBetweenDown!!
        }
        _arrowBetweenDown = fluentIcon(name = "Filled.ArrowBetweenDown") {
            fluentPath {
                moveTo(6.5f, 2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(0.25f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(7.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-0.25f)
                close()
                moveTo(12.0f, 6.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.09f)
                lineToRelative(2.8f, -2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.42f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-4.5f, -4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, -1.42f)
                lineToRelative(2.8f, 2.8f)
                lineTo(11.0f, 7.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(4.5f, 21.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-0.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(7.0f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-0.25f)
                close()
            }
        }
        return _arrowBetweenDown!!
    }

private var _arrowBetweenDown: ImageVector? = null
