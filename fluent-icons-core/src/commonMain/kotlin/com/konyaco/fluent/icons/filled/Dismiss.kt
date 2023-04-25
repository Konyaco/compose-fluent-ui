

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Dismiss: ImageVector
    get() {
        if (_dismiss != null) {
            return _dismiss!!
        }
        _dismiss = fluentIcon(name = "Filled.Dismiss") {
            fluentPath {
                moveToRelative(4.21f, 4.39f)
                lineToRelative(0.08f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                lineTo(12.0f, 10.6f)
                lineToRelative(6.3f, -6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, 1.42f)
                lineTo(13.42f, 12.0f)
                lineToRelative(6.3f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.31f)
                lineToRelative(-0.08f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                lineTo(12.0f, 13.4f)
                lineToRelative(-6.3f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.42f)
                lineTo(10.58f, 12.0f)
                lineToRelative(-6.3f, -6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, -1.31f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(-0.08f, 0.1f)
                close()
            }
        }
        return _dismiss!!
    }

private var _dismiss: ImageVector? = null
