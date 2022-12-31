

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataTreemap: ImageVector
    get() {
        if (_dataTreemap != null) {
            return _dataTreemap!!
        }
        _dataTreemap = fluentIcon(name = "Filled.DataTreemap") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(18.0f)
                horizontalLineTo(6.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(10.5f, 21.0f)
                horizontalLineToRelative(7.25f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(15.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(21.0f)
                close()
                moveTo(21.0f, 14.0f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(11.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        return _dataTreemap!!
    }

private var _dataTreemap: ImageVector? = null
