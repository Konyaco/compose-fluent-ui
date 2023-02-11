

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FullScreenMaximize: ImageVector
    get() {
        if (_fullScreenMaximize != null) {
            return _fullScreenMaximize!!
        }
        _fullScreenMaximize = fluentIcon(name = "Regular.FullScreenMaximize") {
            fluentPath {
                moveTo(4.5f, 5.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.5f, 18.25f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.25f, 4.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 3.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.5f, 18.25f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 21.0f, 18.25f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        return _fullScreenMaximize!!
    }

private var _fullScreenMaximize: ImageVector? = null
