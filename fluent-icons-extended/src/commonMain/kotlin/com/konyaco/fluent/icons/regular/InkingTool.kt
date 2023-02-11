

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.InkingTool: ImageVector
    get() {
        if (_inkingTool != null) {
            return _inkingTool!!
        }
        _inkingTool = fluentIcon(name = "Regular.InkingTool") {
            fluentPath {
                moveTo(4.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.5f)
                curveTo(3.0f, 7.22f, 3.78f, 8.0f, 4.75f, 8.0f)
                horizontalLineToRelative(0.27f)
                lineToRelative(4.03f, 8.97f)
                curveToRelative(0.2f, 0.45f, 0.59f, 0.79f, 1.04f, 0.94f)
                arcToRelative(5.79f, 5.79f, 0.0f, false, false, 0.27f, 3.01f)
                curveToRelative(0.3f, 0.6f, 0.83f, 1.08f, 1.64f, 1.08f)
                curveToRelative(0.8f, 0.0f, 1.35f, -0.48f, 1.64f, -1.08f)
                arcToRelative(5.79f, 5.79f, 0.0f, false, false, 0.27f, -3.01f)
                curveToRelative(0.45f, -0.15f, 0.83f, -0.49f, 1.04f, -0.94f)
                lineTo(18.98f, 8.0f)
                horizontalLineToRelative(0.27f)
                curveTo(20.22f, 8.0f, 21.0f, 7.22f, 21.0f, 6.25f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                lineTo(4.75f, 6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(6.66f, 8.0f)
                horizontalLineToRelative(10.68f)
                lineToRelative(-3.76f, 8.35f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.23f, 0.15f)
                horizontalLineToRelative(-2.7f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.23f, -0.15f)
                lineTo(6.66f, 8.0f)
                close()
                moveTo(11.61f, 18.0f)
                horizontalLineToRelative(0.78f)
                curveToRelative(0.07f, 0.26f, 0.11f, 0.6f, 0.11f, 1.0f)
                curveToRelative(0.0f, 0.57f, -0.08f, 1.0f, -0.21f, 1.26f)
                curveToRelative(-0.1f, 0.22f, -0.2f, 0.24f, -0.29f, 0.24f)
                curveToRelative(-0.1f, 0.0f, -0.18f, -0.02f, -0.29f, -0.24f)
                arcTo(3.03f, 3.03f, 0.0f, false, true, 11.5f, 19.0f)
                curveToRelative(0.0f, -0.4f, 0.04f, -0.74f, 0.11f, -1.0f)
                close()
            }
        }
        return _inkingTool!!
    }

private var _inkingTool: ImageVector? = null
