

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataBarHorizontal: ImageVector
    get() {
        if (_dataBarHorizontal != null) {
            return _dataBarHorizontal!!
        }
        _dataBarHorizontal = fluentIcon(name = "Filled.DataBarHorizontal") {
            fluentPath {
                moveTo(21.0f, 18.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                lineTo(5.25f, 16.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, 4.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                close()
                moveTo(17.0f, 11.75f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, 4.5f)
                horizontalLineToRelative(9.5f)
                curveTo(16.0f, 14.0f, 17.0f, 13.0f, 17.0f, 11.75f)
                close()
                moveTo(13.0f, 5.25f)
                curveTo(13.0f, 4.01f, 12.0f, 3.0f, 10.75f, 3.0f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f)
                horizontalLineToRelative(5.5f)
                curveTo(12.0f, 7.5f, 13.0f, 6.5f, 13.0f, 5.25f)
                close()
            }
        }
        return _dataBarHorizontal!!
    }

private var _dataBarHorizontal: ImageVector? = null
