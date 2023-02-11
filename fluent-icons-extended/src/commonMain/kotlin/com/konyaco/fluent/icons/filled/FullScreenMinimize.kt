

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FullScreenMinimize: ImageVector
    get() {
        if (_fullScreenMinimize != null) {
            return _fullScreenMinimize!!
        }
        _fullScreenMinimize = fluentIcon(name = "Filled.FullScreenMinimize") {
            fluentPath {
                moveTo(9.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(4.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 6.5f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(9.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(4.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.0f, 17.5f)
                lineTo(9.0f, 20.0f)
                close()
                moveTo(16.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 9.0f)
                lineTo(20.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(17.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(15.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                lineTo(15.0f, 20.0f)
                close()
            }
        }
        return _fullScreenMinimize!!
    }

private var _fullScreenMinimize: ImageVector? = null
