

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LineDashes: ImageVector
    get() {
        if (_lineDashes != null) {
            return _lineDashes!!
        }
        _lineDashes = fluentIcon(name = "Regular.LineDashes") {
            fluentPath {
                moveTo(21.79f, 2.22f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.07f, -1.06f)
                lineToRelative(1.0f, -1.0f)
                curveToRelative(0.3f, -0.29f, 0.77f, -0.29f, 1.07f, 0.0f)
                close()
                moveTo(17.78f, 6.22f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.29f, -0.29f, 0.76f, -0.29f, 1.06f, 0.0f)
                close()
                moveTo(13.28f, 10.72f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(8.78f, 16.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(1.5f, -1.5f)
                close()
                moveTo(4.28f, 20.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.0f, -1.0f)
                close()
            }
        }
        return _lineDashes!!
    }

private var _lineDashes: ImageVector? = null
