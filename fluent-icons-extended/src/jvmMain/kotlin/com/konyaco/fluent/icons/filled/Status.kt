

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Status: ImageVector
    get() {
        if (_status != null) {
            return _status!!
        }
        _status = fluentIcon(name = "Filled.Status") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                curveToRelative(1.25f, 0.0f, 2.44f, 0.25f, 3.52f, 0.71f)
                lineToRelative(-1.16f, 1.17f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 4.78f, 4.82f)
                lineToRelative(1.17f, -1.17f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 12.0f, 3.0f)
                close()
                moveTo(21.16f, 2.57f)
                lineToRelative(0.14f, 0.13f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 0.0f, 3.4f)
                lineToRelative(-6.75f, 6.81f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.4f, 0.25f)
                lineTo(9.8f, 14.53f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.25f, -0.25f)
                lineToRelative(1.37f, -4.35f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.24f, -0.4f)
                lineToRelative(6.76f, -6.82f)
                curveToRelative(0.88f, -0.9f, 2.3f, -0.94f, 3.24f, -0.14f)
                close()
            }
        }
        return _status!!
    }

private var _status: ImageVector? = null
