

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LineThickness: ImageVector
    get() {
        if (_lineThickness != null) {
            return _lineThickness!!
        }
        _lineThickness = fluentIcon(name = "Regular.LineThickness") {
            fluentPath {
                moveTo(2.75f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(2.75f, 3.5f)
                close()
                moveTo(2.0f, 10.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(17.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                lineTo(3.25f, 12.0f)
                curveTo(2.56f, 12.0f, 2.0f, 11.44f, 2.0f, 10.75f)
                close()
                moveTo(2.0f, 18.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                lineTo(3.75f, 20.0f)
                curveTo(2.78f, 20.0f, 2.0f, 19.22f, 2.0f, 18.25f)
                close()
            }
        }
        return _lineThickness!!
    }

private var _lineThickness: ImageVector? = null
