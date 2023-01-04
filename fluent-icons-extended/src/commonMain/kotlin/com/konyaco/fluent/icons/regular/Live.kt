

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Live: ImageVector
    get() {
        if (_live != null) {
            return _live!!
        }
        _live = fluentIcon(name = "Regular.Live") {
            fluentPath {
                moveTo(5.99f, 4.93f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, 12.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.14f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(19.07f, 4.93f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 14.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -12.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                close()
                moveTo(8.82f, 7.76f)
                curveToRelative(0.3f, 0.29f, 0.3f, 0.76f, 0.0f, 1.06f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, 6.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.48f)
                curveToRelative(0.29f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(16.24f, 7.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -6.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                close()
                moveTo(12.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        return _live!!
    }

private var _live: ImageVector? = null
