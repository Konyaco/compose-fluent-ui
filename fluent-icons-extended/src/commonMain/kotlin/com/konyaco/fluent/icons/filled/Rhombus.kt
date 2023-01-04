

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = fluentIcon(name = "Filled.Rhombus") {
            fluentPath {
                moveTo(5.8f, 5.4f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 7.9f, 4.0f)
                horizontalLineToRelative(12.85f)
                curveToRelative(1.6f, 0.0f, 2.69f, 1.61f, 2.09f, 3.1f)
                lineTo(18.2f, 18.6f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 16.1f, 20.0f)
                horizontalLineTo(3.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.08f, -3.1f)
                lineTo(5.8f, 5.4f)
                close()
            }
        }
        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
