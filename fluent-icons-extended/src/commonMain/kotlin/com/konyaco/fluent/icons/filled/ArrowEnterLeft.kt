

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowEnterLeft: ImageVector
    get() {
        if (_arrowEnterLeft != null) {
            return _arrowEnterLeft!!
        }
        _arrowEnterLeft = fluentIcon(name = "Filled.ArrowEnterLeft") {
            fluentPath {
                moveTo(21.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineToRelative(6.62f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.3f, 3.5f)
                horizontalLineTo(5.4f)
                lineToRelative(3.3f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.31f)
                lineToRelative(-0.08f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -0.1f, -0.11f)
                lineToRelative(-0.07f, -0.12f)
                lineToRelative(-0.05f, -0.1f)
                lineToRelative(-0.03f, -0.11f)
                lineToRelative(-0.03f, -0.12f)
                verticalLineToRelative(-0.06f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-0.08f)
                lineToRelative(0.02f, -0.12f)
                lineToRelative(0.03f, -0.11f)
                lineToRelative(0.04f, -0.11f)
                lineToRelative(0.06f, -0.1f)
                lineToRelative(0.06f, -0.1f)
                lineToRelative(0.08f, -0.09f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.5f, 1.32f)
                lineToRelative(-0.08f, 0.1f)
                lineTo(5.4f, 13.0f)
                horizontalLineTo(18.5f)
                curveToRelative(0.78f, 0.0f, 1.42f, -0.6f, 1.5f, -1.36f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _arrowEnterLeft!!
    }

private var _arrowEnterLeft: ImageVector? = null
