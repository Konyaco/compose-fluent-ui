

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.InkingTool: ImageVector
    get() {
        if (_inkingTool != null) {
            return _inkingTool!!
        }
        _inkingTool = fluentIcon(name = "Filled.InkingTool") {
            fluentPath {
                moveTo(13.82f, 20.04f)
                curveToRelative(-0.12f, 0.46f, -0.31f, 0.88f, -0.56f, 1.27f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.47f, 0.08f)
                lineToRelative(-0.08f, -0.12f)
                lineToRelative(-0.13f, -0.22f)
                arcToRelative(5.63f, 5.63f, 0.0f, false, true, -0.55f, -3.05f)
                horizontalLineToRelative(3.94f)
                curveToRelative(0.07f, 0.72f, 0.02f, 1.4f, -0.15f, 2.04f)
                close()
                moveTo(18.48f, 9.0f)
                lineTo(15.0f, 16.09f)
                curveToRelative(-0.22f, 0.45f, -0.62f, 0.78f, -1.1f, 0.91f)
                horizontalLineToRelative(-3.73f)
                lineToRelative(-0.1f, -0.03f)
                curveToRelative(-0.38f, -0.13f, -0.7f, -0.38f, -0.92f, -0.72f)
                lineToRelative(-0.08f, -0.15f)
                lineTo(5.54f, 9.0f)
                horizontalLineToRelative(12.94f)
                close()
                moveTo(20.25f, 2.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.92f, -0.7f, 1.67f, -1.6f, 1.74f)
                lineTo(4.74f, 7.99f)
                curveToRelative(-0.92f, 0.0f, -1.67f, -0.7f, -1.74f, -1.6f)
                lineTo(3.0f, 2.75f)
                curveToRelative(0.0f, -0.38f, 0.27f, -0.7f, 0.64f, -0.75f)
                horizontalLineToRelative(16.6f)
                close()
            }
        }
        return _inkingTool!!
    }

private var _inkingTool: ImageVector? = null
