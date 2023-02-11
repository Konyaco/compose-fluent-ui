

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ViewDesktopMobile: ImageVector
    get() {
        if (_viewDesktopMobile != null) {
            return _viewDesktopMobile!!
        }
        _viewDesktopMobile = fluentIcon(name = "Regular.ViewDesktopMobile") {
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
                moveTo(15.75f, 3.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(16.5f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(13.25f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(14.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.4f)
                verticalLineToRelative(6.1f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.41f, 0.5f)
                lineTo(9.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.4f)
                lineTo(9.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.41f, -0.5f)
                horizontalLineToRelative(5.09f)
                close()
                moveTo(14.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.41f)
                lineTo(15.0f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.41f, 0.5f)
                lineTo(9.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.4f)
                lineTo(9.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.41f, -0.5f)
                horizontalLineToRelative(5.09f)
                close()
            }
        }
        return _viewDesktopMobile!!
    }

private var _viewDesktopMobile: ImageVector? = null
