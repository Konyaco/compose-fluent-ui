

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LineDashes: ImageVector
    get() {
        if (_lineDashes != null) {
            return _lineDashes!!
        }
        _lineDashes = fluentIcon(name = "Filled.LineDashes") {
            fluentPath {
                moveTo(21.7f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.41f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4f, -1.41f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                close()
                moveTo(17.7f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.41f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4f, -1.42f)
                lineToRelative(0.99f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                close()
                moveTo(13.2f, 10.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.4f)
                lineToRelative(1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                close()
                moveTo(8.7f, 16.7f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 7.3f, 15.3f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.42f, 1.4f)
                lineToRelative(1.0f, -0.99f)
                close()
                moveTo(4.21f, 21.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, -1.42f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, 1.42f)
                lineToRelative(0.5f, -0.5f)
                close()
            }
        }
        return _lineDashes!!
    }

private var _lineDashes: ImageVector? = null
