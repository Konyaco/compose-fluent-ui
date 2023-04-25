

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Emoji: ImageVector
    get() {
        if (_emoji != null) {
            return _emoji!!
        }
        _emoji = fluentIcon(name = "Filled.Emoji") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(8.46f, 14.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.18f, 0.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.43f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.18f, -0.92f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -7.07f, 0.0f)
                close()
                moveTo(9.0f, 8.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
                moveTo(15.0f, 8.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
            }
        }
        return _emoji!!
    }

private var _emoji: ImageVector? = null
