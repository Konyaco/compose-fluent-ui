

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataHistogram: ImageVector
    get() {
        if (_dataHistogram != null) {
            return _dataHistogram!!
        }
        _dataHistogram = fluentIcon(name = "Filled.DataHistogram") {
            fluentPath {
                moveTo(9.0f, 5.23f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                lineTo(15.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                lineTo(9.0f, 5.23f)
                close()
                moveTo(7.5f, 10.0f)
                lineTo(5.25f, 10.0f)
                curveTo(4.01f, 10.0f, 3.0f, 11.0f, 3.0f, 12.25f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                lineTo(7.5f, 21.0f)
                lineTo(7.5f, 10.0f)
                close()
                moveTo(16.5f, 21.0f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-11.0f)
                curveTo(21.0f, 8.01f, 20.0f, 7.0f, 18.75f, 7.0f)
                lineTo(16.5f, 7.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        return _dataHistogram!!
    }

private var _dataHistogram: ImageVector? = null
