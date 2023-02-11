

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataWaterfall: ImageVector
    get() {
        if (_dataWaterfall != null) {
            return _dataWaterfall!!
        }
        _dataWaterfall = fluentIcon(name = "Filled.DataWaterfall") {
            fluentPath {
                moveTo(2.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(6.25f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-6.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineTo(11.5f)
                verticalLineTo(5.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        return _dataWaterfall!!
    }

private var _dataWaterfall: ImageVector? = null
