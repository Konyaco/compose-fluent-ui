

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Highlight: ImageVector
    get() {
        if (_highlight != null) {
            return _highlight!!
        }
        _highlight = fluentIcon(name = "Regular.Highlight") {
            fluentPath {
                moveTo(20.26f, 2.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.29f, 0.74f, 0.65f)
                verticalLineToRelative(4.6f)
                curveToRelative(0.0f, 1.16f, -0.87f, 2.11f, -2.0f, 2.24f)
                verticalLineToRelative(2.26f)
                curveToRelative(0.0f, 1.19f, -0.92f, 2.16f, -2.1f, 2.24f)
                horizontalLineToRelative(-0.4f)
                verticalLineToRelative(2.8f)
                curveToRelative(0.0f, 0.81f, -0.44f, 1.56f, -1.14f, 1.96f)
                lineToRelative(-0.15f, 0.08f)
                lineToRelative(-6.64f, 3.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -0.58f)
                lineTo(7.51f, 14.0f)
                horizontalLineToRelative(-0.26f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.93f, -2.24f, -2.1f)
                lineTo(5.0f, 11.75f)
                lineTo(5.0f, 9.49f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 3.0f, 7.4f)
                lineTo(3.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(4.6f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.74f)
                lineToRelative(0.1f, 0.01f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.75f, -0.65f)
                verticalLineToRelative(-4.6f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.76f, -0.75f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(6.07f)
                lineToRelative(5.57f, -2.6f)
                curveToRelative(0.23f, -0.11f, 0.39f, -0.33f, 0.42f, -0.57f)
                lineToRelative(0.01f, -0.11f)
                verticalLineToRelative(-2.8f)
                close()
                moveTo(17.5f, 9.5f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.69f, 0.65f, 0.74f)
                horizontalLineToRelative(9.6f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.75f, -0.64f)
                lineTo(17.5f, 9.5f)
                close()
            }
        }
        return _highlight!!
    }

private var _highlight: ImageVector? = null
