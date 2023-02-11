

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = fluentIcon(name = "Regular.Rhombus") {
            fluentPath {
                moveTo(5.8f, 5.4f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 7.9f, 4.0f)
                horizontalLineToRelative(12.85f)
                curveToRelative(1.6f, 0.0f, 2.69f, 1.61f, 2.09f, 3.1f)
                lineTo(18.2f, 18.6f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 16.1f, 20.0f)
                lineTo(3.25f, 20.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.08f, -3.1f)
                lineTo(5.8f, 5.4f)
                close()
                moveTo(7.9f, 5.5f)
                curveToRelative(-0.31f, 0.0f, -0.59f, 0.19f, -0.7f, 0.47f)
                lineToRelative(-4.64f, 11.5f)
                curveToRelative(-0.2f, 0.5f, 0.16f, 1.03f, 0.7f, 1.03f)
                lineTo(16.1f, 18.5f)
                curveToRelative(0.3f, 0.0f, 0.58f, -0.19f, 0.7f, -0.47f)
                lineToRelative(4.64f, -11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.7f, -1.03f)
                lineTo(7.9f, 5.5f)
                close()
            }
        }
        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
