

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = fluentIcon(name = "Filled.Airplane") {
            fluentPath {
                moveTo(21.99f, 11.95f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.05f, 1.99f)
                lineToRelative(-4.74f, -0.14f)
                lineToRelative(-3.45f, 7.14f)
                curveToRelative(-0.28f, 0.57f, -0.86f, 0.94f, -1.5f, 0.94f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, -0.92f, -1.04f)
                lineToRelative(0.86f, -7.19f)
                lineToRelative(-3.76f, -0.1f)
                lineToRelative(-0.5f, 1.33f)
                curveToRelative(-0.18f, 0.51f, -0.66f, 0.85f, -1.2f, 0.85f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.9f, -0.9f)
                verticalLineToRelative(-1.48f)
                lineTo(3.0f, 13.18f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, 0.0f, -2.47f)
                lineToRelative(0.82f, -0.17f)
                verticalLineTo(9.07f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.78f, -0.9f)
                horizontalLineToRelative(0.12f)
                curveToRelative(0.54f, 0.0f, 1.02f, 0.33f, 1.2f, 0.84f)
                lineToRelative(0.5f, 1.34f)
                lineToRelative(3.75f, -0.1f)
                lineToRelative(-0.85f, -7.1f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.51f, 0.4f, -0.93f, 0.92f, -0.93f)
                curveToRelative(0.58f, 0.0f, 1.12f, 0.3f, 1.42f, 0.8f)
                lineToRelative(0.08f, 0.14f)
                lineToRelative(3.4f, 7.04f)
                lineToRelative(4.79f, -0.14f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.05f, 1.93f)
                verticalLineToRelative(0.06f)
                close()
            }
        }
        return _airplane!!
    }

private var _airplane: ImageVector? = null
