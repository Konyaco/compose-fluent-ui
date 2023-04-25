

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Checkmark: ImageVector
    get() {
        if (_checkmark != null) {
            return _checkmark!!
        }
        _checkmark = fluentIcon(name = "Filled.Checkmark") {
            fluentPath {
                moveToRelative(8.5f, 16.59f)
                lineToRelative(-3.8f, -3.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.42f)
                lineToRelative(4.5f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineToRelative(11.0f, -11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.42f)
                lineTo(8.5f, 16.6f)
                close()
            }
        }
        return _checkmark!!
    }

private var _checkmark: ImageVector? = null
