

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataBarVerticalAdd: ImageVector
    get() {
        if (_dataBarVerticalAdd != null) {
            return _dataBarVerticalAdd!!
        }
        _dataBarVerticalAdd = fluentIcon(name = "Filled.DataBarVerticalAdd") {
            fluentPath {
                moveTo(18.25f, 3.0f)
                curveTo(17.0f, 3.0f, 16.0f, 4.0f, 16.0f, 5.25f)
                verticalLineToRelative(5.92f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, 4.5f, 0.56f)
                lineTo(20.5f, 5.25f)
                curveTo(20.5f, 4.0f, 19.5f, 3.0f, 18.25f, 3.0f)
                close()
                moveTo(14.0f, 9.25f)
                verticalLineToRelative(2.77f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 12.0f, 20.98f)
                lineToRelative(-0.26f, 0.02f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
                close()
                moveTo(3.0f, 13.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(18.0f, 18.0f)
                close()
            }
        }
        return _dataBarVerticalAdd!!
    }

private var _dataBarVerticalAdd: ImageVector? = null
