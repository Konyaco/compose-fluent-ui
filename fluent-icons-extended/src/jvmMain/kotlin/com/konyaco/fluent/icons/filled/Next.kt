

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Next: ImageVector
    get() {
        if (_next != null) {
            return _next!!
        }
        _next = fluentIcon(name = "Filled.Next") {
            fluentPath {
                moveTo(3.0f, 4.75f)
                curveToRelative(0.0f, -1.4f, 1.58f, -2.24f, 2.74f, -1.44f)
                lineToRelative(10.5f, 7.2f)
                curveToRelative(1.0f, 0.68f, 1.01f, 2.17f, 0.0f, 2.87f)
                lineToRelative(-10.5f, 7.3f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 3.0f, 19.25f)
                lineTo(3.0f, 4.75f)
                close()
                moveTo(21.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(21.0f, 3.75f)
                close()
            }
        }
        return _next!!
    }

private var _next: ImageVector? = null
