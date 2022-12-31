

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Live: ImageVector
    get() {
        if (_live != null) {
            return _live!!
        }
        _live = fluentIcon(name = "Filled.Live") {
            fluentPath {
                moveTo(6.34f, 4.94f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.41f, 1.41f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.14f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                close()
                moveTo(19.07f, 4.94f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 14.14f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.41f, -1.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, -1.41f)
                close()
                moveTo(9.31f, 7.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 0.0f, 5.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.41f, 1.41f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, true, 0.0f, -8.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                close()
                moveTo(16.27f, 7.8f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, true, 0.0f, 8.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.41f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 0.0f, -5.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, -1.42f)
                close()
                moveTo(12.08f, 10.57f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        return _live!!
    }

private var _live: ImageVector? = null
