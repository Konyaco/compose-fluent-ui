

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Prohibited: ImageVector
    get() {
        if (_prohibited != null) {
            return _prohibited!!
        }
        _prohibited = fluentIcon(name = "Regular.Prohibited") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(18.52f, 6.54f)
                lineTo(6.54f, 18.52f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 18.51f, 6.55f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -6.52f, 13.96f)
                lineTo(17.46f, 5.48f)
                arcTo(8.47f, 8.47f, 0.0f, false, false, 12.0f, 3.5f)
                close()
            }
        }
        return _prohibited!!
    }

private var _prohibited: ImageVector? = null
