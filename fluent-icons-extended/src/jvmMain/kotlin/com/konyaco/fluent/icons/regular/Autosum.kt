

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Autosum: ImageVector
    get() {
        if (_autosum != null) {
            return _autosum!!
        }
        _autosum = fluentIcon(name = "Regular.Autosum") {
            fluentPath {
                moveTo(5.06f, 4.46f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.75f, 4.0f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(7.52f)
                lineToRelative(5.36f, 5.54f)
                curveToRelative(0.27f, 0.28f, 0.28f, 0.71f, 0.03f, 1.0f)
                lineTo(7.38f, 18.5f)
                horizontalLineToRelative(10.87f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.57f, -1.24f)
                lineToRelative(6.15f, -7.17f)
                lineTo(5.2f, 5.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.15f, -0.81f)
                close()
            }
        }
        return _autosum!!
    }

private var _autosum: ImageVector? = null
