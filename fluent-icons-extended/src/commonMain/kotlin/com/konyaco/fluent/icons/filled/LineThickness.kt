

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LineThickness: ImageVector
    get() {
        if (_lineThickness != null) {
            return _lineThickness!!
        }
        _lineThickness = fluentIcon(name = "Filled.LineThickness") {
            fluentPath {
                moveTo(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(2.0f, 10.5f)
                curveTo(2.0f, 9.67f, 2.67f, 9.0f, 3.5f, 9.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 10.5f)
                close()
                moveTo(2.0f, 18.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                lineTo(4.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
            }
        }
        return _lineThickness!!
    }

private var _lineThickness: ImageVector? = null
