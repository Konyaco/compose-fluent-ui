

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PulseSquare: ImageVector
    get() {
        if (_pulseSquare != null) {
            return _pulseSquare!!
        }
        _pulseSquare = fluentIcon(name = "Filled.PulseSquare") {
            fluentPath {
                moveTo(18.75f, 3.0f)
                curveTo(19.99f, 3.0f, 21.0f, 4.0f, 21.0f, 5.25f)
                verticalLineToRelative(13.5f)
                curveTo(21.0f, 20.0f, 20.0f, 21.0f, 18.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(4.01f, 21.0f, 3.0f, 20.0f, 3.0f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(3.0f, 4.01f, 4.0f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(13.5f)
                close()
                moveTo(9.8f, 7.95f)
                lineTo(8.26f, 11.5f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.3f, 0.0f, 0.56f, -0.18f, 0.68f, -0.45f)
                lineToRelative(1.04f, -2.36f)
                lineToRelative(2.33f, 5.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.37f, 0.06f)
                lineTo(15.71f, 13.0f)
                horizontalLineToRelative(1.54f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.67f, 0.41f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.39f, -5.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.38f, -0.02f)
                close()
            }
        }
        return _pulseSquare!!
    }

private var _pulseSquare: ImageVector? = null
