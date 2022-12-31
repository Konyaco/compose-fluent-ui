

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
                moveTo(14.5f, 4.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -5.5f, 0.0f)
                verticalLineToRelative(14.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 3.67f, 2.6f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, 1.83f, -10.12f)
                lineTo(14.5f, 4.75f)
                close()
                moveTo(21.5f, 12.38f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -5.5f, -1.2f)
                lineTo(16.0f, 9.74f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.5f, 0.0f)
                verticalLineToRelative(2.63f)
                close()
                moveTo(4.75f, 12.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 12.0f)
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
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(18.0f, 18.0f)
                close()
            }
        }
        return _dataBarVerticalAdd!!
    }

private var _dataBarVerticalAdd: ImageVector? = null
