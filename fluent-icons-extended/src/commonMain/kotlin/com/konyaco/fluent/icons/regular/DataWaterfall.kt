

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataWaterfall: ImageVector
    get() {
        if (_dataWaterfall != null) {
            return _dataWaterfall!!
        }
        _dataWaterfall = fluentIcon(name = "Regular.DataWaterfall") {
            fluentPath {
                moveTo(2.0f, 3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(6.25f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineTo(12.5f)
                horizontalLineTo(6.25f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 3.75f)
                close()
                moveTo(18.5f, 19.5f)
                verticalLineToRelative(-6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(6.25f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.75f)
                close()
                moveTo(10.0f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.25f)
                close()
            }
        }
        return _dataWaterfall!!
    }

private var _dataWaterfall: ImageVector? = null
