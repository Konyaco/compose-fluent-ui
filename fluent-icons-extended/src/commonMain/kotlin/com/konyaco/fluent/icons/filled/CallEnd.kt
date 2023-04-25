

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CallEnd: ImageVector
    get() {
        if (_callEnd != null) {
            return _callEnd!!
        }
        _callEnd = fluentIcon(name = "Filled.CallEnd") {
            fluentPath {
                moveToRelative(21.95f, 13.0f)
                lineToRelative(-0.2f, 1.03f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, -2.12f, 1.52f)
                lineToRelative(-2.05f, -0.2f)
                arcToRelative(2.16f, 2.16f, 0.0f, false, true, -1.87f, -1.56f)
                lineToRelative(-0.64f, -2.36f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -6.23f, 0.18f)
                lineToRelative(-0.39f, 2.21f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.7f, 1.55f)
                lineToRelative(-2.04f, 0.2f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, true, -2.28f, -1.5f)
                lineToRelative(-0.3f, -1.05f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, true, 0.71f, -2.85f)
                curveToRelative(1.78f, -1.73f, 4.75f, -2.6f, 8.9f, -2.6f)
                curveToRelative(4.17f, 0.0f, 7.23f, 0.86f, 9.2f, 2.59f)
                curveToRelative(0.82f, 0.73f, 1.2f, 1.8f, 1.0f, 2.83f)
                close()
            }
        }
        return _callEnd!!
    }

private var _callEnd: ImageVector? = null
