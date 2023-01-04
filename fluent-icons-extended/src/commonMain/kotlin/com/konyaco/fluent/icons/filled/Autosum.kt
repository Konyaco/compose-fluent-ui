

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Autosum: ImageVector
    get() {
        if (_autosum != null) {
            return _autosum!!
        }
        _autosum = fluentIcon(name = "Filled.Autosum") {
            fluentPath {
                moveTo(4.83f, 4.61f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.75f, 4.0f)
                horizontalLineToRelative(12.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineTo(8.11f)
                lineToRelative(4.95f, 5.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.04f, 1.34f)
                lineTo(7.92f, 18.5f)
                horizontalLineToRelative(10.33f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineTo(5.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.76f, -1.65f)
                lineToRelative(6.0f, -7.0f)
                lineTo(5.03f, 5.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.2f, -1.09f)
                close()
            }
        }
        return _autosum!!
    }

private var _autosum: ImageVector? = null
