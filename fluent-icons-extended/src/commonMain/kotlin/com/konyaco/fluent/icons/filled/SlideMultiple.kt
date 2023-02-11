

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SlideMultiple: ImageVector
    get() {
        if (_slideMultiple != null) {
            return _slideMultiple!!
        }
        _slideMultiple = fluentIcon(name = "Filled.SlideMultiple") {
            fluentPath {
                moveTo(2.0f, 7.75f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 6.75f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveTo(17.99f, 3.0f, 19.0f, 4.0f, 19.0f, 5.25f)
                verticalLineToRelative(0.25f)
                horizontalLineTo(7.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 4.5f, 8.75f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-0.25f)
                curveTo(3.01f, 17.0f, 2.0f, 16.0f, 2.0f, 14.75f)
                verticalLineToRelative(-7.0f)
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
            }
        }
        return _slideMultiple!!
    }

private var _slideMultiple: ImageVector? = null
