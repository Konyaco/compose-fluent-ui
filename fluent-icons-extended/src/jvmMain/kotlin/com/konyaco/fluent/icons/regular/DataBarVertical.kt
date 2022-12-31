

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataBarVertical: ImageVector
    get() {
        if (_dataBarVertical != null) {
            return _dataBarVertical!!
        }
        _dataBarVertical = fluentIcon(name = "Regular.DataBarVertical") {
            fluentPath {
                moveTo(5.75f, 3.0f)
                curveTo(6.99f, 3.0f, 8.0f, 4.0f, 8.0f, 5.25f)
                verticalLineToRelative(13.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
                lineTo(3.5f, 5.25f)
                curveTo(3.5f, 4.0f, 4.5f, 3.0f, 5.75f, 3.0f)
                close()
                moveTo(12.25f, 7.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(9.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
                verticalLineToRelative(-9.5f)
                curveTo(10.0f, 8.0f, 11.0f, 7.0f, 12.25f, 7.0f)
                close()
                moveTo(18.75f, 11.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(5.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                close()
                moveTo(5.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(6.5f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(12.25f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(18.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
            }
        }
        return _dataBarVertical!!
    }

private var _dataBarVertical: ImageVector? = null
