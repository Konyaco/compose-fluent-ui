

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideMultiple: ImageVector
    get() {
        if (_slideMultiple != null) {
            return _slideMultiple!!
        }
        _slideMultiple = fluentIcon(name = "Regular.SlideMultiple") {
            fluentPath {
                moveTo(6.75f, 3.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 2.0f, 7.75f)
                verticalLineToRelative(7.0f)
                curveTo(2.0f, 15.99f, 3.0f, 17.0f, 4.25f, 17.0f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.8f, 1.46f, -3.25f, 3.25f, -3.25f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.25f)
                lineTo(19.0f, 5.5f)
                verticalLineToRelative(-0.25f)
                curveTo(19.0f, 4.01f, 18.0f, 3.0f, 16.75f, 3.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(7.75f, 6.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(7.0f, 8.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-9.5f)
                close()
            }
        }
        return _slideMultiple!!
    }

private var _slideMultiple: ImageVector? = null
