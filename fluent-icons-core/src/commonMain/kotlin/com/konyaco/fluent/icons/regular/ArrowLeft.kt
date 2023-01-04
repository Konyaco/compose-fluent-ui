

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = fluentIcon(name = "Regular.ArrowLeft") {
            fluentPath {
                moveTo(10.73f, 19.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.04f, -1.1f)
                lineToRelative(-6.25f, -5.95f)
                horizontalLineToRelative(14.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(5.52f)
                lineToRelative(6.25f, -5.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.04f, -1.1f)
                lineToRelative(-7.42f, 7.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.44f)
                lineToRelative(7.42f, 7.07f)
                close()
            }
        }
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
