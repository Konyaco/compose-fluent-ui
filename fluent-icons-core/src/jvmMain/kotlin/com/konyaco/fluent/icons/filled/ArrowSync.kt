

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowSync: ImageVector
    get() {
        if (_arrowSync != null) {
            return _arrowSync!!
        }
        _arrowSync = fluentIcon(name = "Filled.ArrowSync") {
            fluentPath {
                moveTo(16.05f, 5.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.2f, 1.4f)
                arcToRelative(6.99f, 6.99f, 0.0f, false, true, -3.17f, 12.49f)
                lineToRelative(0.71f, -0.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, -1.42f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, -1.42f)
                lineToRelative(-0.84f, -0.84f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 4.5f, -16.11f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.19f)
                close()
                moveTo(14.12f, 3.29f)
                lineTo(11.62f, 0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.5f, 1.32f)
                lineToRelative(0.09f, 0.1f)
                lineToRelative(0.84f, 0.84f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -4.78f, 15.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.28f, -1.55f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, true, 3.37f, -12.32f)
                lineToRelative(-0.71f, 0.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, 1.5f)
                lineToRelative(0.1f, -0.08f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.07f, -1.32f)
                lineToRelative(-0.08f, -0.1f)
                close()
            }
        }
        return _arrowSync!!
    }

private var _arrowSync: ImageVector? = null
