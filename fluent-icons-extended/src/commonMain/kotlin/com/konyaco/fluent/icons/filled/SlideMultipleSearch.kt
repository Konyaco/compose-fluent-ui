

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SlideMultipleSearch: ImageVector
    get() {
        if (_slideMultipleSearch != null) {
            return _slideMultipleSearch!!
        }
        _slideMultipleSearch = fluentIcon(name = "Filled.SlideMultipleSearch") {
            fluentPath {
                moveTo(2.0f, 7.75f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 6.75f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveTo(17.99f, 3.0f, 19.0f, 4.0f, 19.0f, 5.25f)
                verticalLineToRelative(0.25f)
                lineTo(7.75f, 5.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 4.5f, 8.75f)
                verticalLineToRelative(2.34f)
                curveToRelative(-0.94f, 0.17f, -1.8f, 0.58f, -2.5f, 1.17f)
                lineTo(2.0f, 7.75f)
                close()
                moveTo(10.43f, 18.95f)
                lineTo(11.97f, 20.5f)
                horizontalLineToRelative(7.78f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                lineTo(5.5f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 4.93f, 7.95f)
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
