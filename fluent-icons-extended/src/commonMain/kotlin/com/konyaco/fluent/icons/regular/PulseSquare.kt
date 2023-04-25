

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PulseSquare: ImageVector
    get() {
        if (_pulseSquare != null) {
            return _pulseSquare!!
        }
        _pulseSquare = fluentIcon(name = "Regular.PulseSquare") {
            fluentPath {
                moveTo(18.75f, 3.0f)
                curveTo(19.99f, 3.0f, 21.0f, 4.0f, 21.0f, 5.25f)
                verticalLineToRelative(13.5f)
                curveTo(21.0f, 20.0f, 20.0f, 21.0f, 18.75f, 21.0f)
                lineTo(5.25f, 21.0f)
                curveTo(4.01f, 21.0f, 3.0f, 20.0f, 3.0f, 18.75f)
                lineTo(3.0f, 5.25f)
                curveTo(3.0f, 4.01f, 4.0f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(13.5f)
                close()
                moveTo(18.75f, 4.5f)
                lineTo(5.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 0.42f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f)
                lineTo(19.5f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(8.25f, 11.5f)
                lineTo(9.81f, 7.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.34f, -0.08f)
                lineToRelative(0.04f, 0.1f)
                lineToRelative(2.39f, 5.95f)
                lineToRelative(1.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.56f, -0.41f)
                lineToRelative(0.11f, -0.01f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(15.71f, 13.0f)
                lineToRelative(-1.54f, 3.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.32f, 0.04f)
                lineToRelative(-0.05f, -0.1f)
                lineToRelative(-2.33f, -5.83f)
                lineToRelative(-1.04f, 2.36f)
                curveToRelative(-0.1f, 0.24f, -0.32f, 0.4f, -0.57f, 0.44f)
                lineToRelative(-0.11f, 0.01f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(1.6f)
                lineToRelative(1.56f, -3.55f)
                lineToRelative(-1.55f, 3.55f)
                close()
            }
        }
        return _pulseSquare!!
    }

private var _pulseSquare: ImageVector? = null
