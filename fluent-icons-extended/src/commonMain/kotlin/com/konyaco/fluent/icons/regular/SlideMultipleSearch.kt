

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideMultipleSearch: ImageVector
    get() {
        if (_slideMultipleSearch != null) {
            return _slideMultipleSearch!!
        }
        _slideMultipleSearch = fluentIcon(name = "Regular.SlideMultipleSearch") {
            fluentPath {
                moveTo(6.75f, 3.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 2.0f, 7.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.5f, -0.88f)
                lineTo(3.5f, 7.75f)
                curveToRelative(0.0f, -1.8f, 1.46f, -3.25f, 3.25f, -3.25f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.25f)
                lineTo(19.0f, 5.5f)
                verticalLineToRelative(-0.25f)
                curveTo(19.0f, 4.01f, 18.0f, 3.0f, 16.75f, 3.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(19.75f, 20.5f)
                horizontalLineToRelative(-7.78f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(9.28f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(2.46f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 5.5f, 11.0f)
                lineTo(5.5f, 8.75f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                close()
                moveTo(5.5f, 21.0f)
                curveToRelative(0.97f, 0.0f, 1.87f, -0.3f, 2.6f, -0.83f)
                lineToRelative(2.62f, 2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.61f, -2.61f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 5.5f, 21.0f)
                close()
                moveTo(5.5f, 19.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        return _slideMultipleSearch!!
    }

private var _slideMultipleSearch: ImageVector? = null
