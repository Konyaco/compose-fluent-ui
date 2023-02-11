

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ViewDesktopMobile: ImageVector
    get() {
        if (_viewDesktopMobile != null) {
            return _viewDesktopMobile!!
        }
        _viewDesktopMobile = fluentIcon(name = "Filled.ViewDesktopMobile") {
            fluentPath {
                moveTo(15.75f, 2.0f)
                curveTo(16.99f, 2.0f, 18.0f, 3.0f, 18.0f, 4.25f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-7.5f)
                curveTo(7.01f, 22.0f, 6.0f, 21.0f, 6.0f, 19.75f)
                lineTo(6.0f, 4.25f)
                curveTo(6.0f, 3.01f, 7.0f, 2.0f, 8.25f, 2.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(13.25f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(2.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(14.5f, 9.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(14.5f, 5.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.27f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        return _viewDesktopMobile!!
    }

private var _viewDesktopMobile: ImageVector? = null
