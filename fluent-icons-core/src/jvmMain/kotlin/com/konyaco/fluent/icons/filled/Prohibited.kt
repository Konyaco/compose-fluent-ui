

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Prohibited: ImageVector
    get() {
        if (_prohibited != null) {
            return _prohibited!!
        }
        _prohibited = fluentIcon(name = "Filled.Prohibited") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(18.11f, 7.65f)
                lineTo(7.65f, 18.11f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 18.11f, 7.65f)
                close()
                moveTo(12.0f, 4.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -6.11f, 11.85f)
                lineTo(16.35f, 5.89f)
                arcTo(7.47f, 7.47f, 0.0f, false, false, 12.0f, 4.5f)
                close()
            }
        }
        return _prohibited!!
    }

private var _prohibited: ImageVector? = null
