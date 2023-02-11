

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.InkingToolAccent: ImageVector
    get() {
        if (_inkingToolAccent != null) {
            return _inkingToolAccent!!
        }
        _inkingToolAccent = fluentIcon(name = "Filled.InkingToolAccent") {
            fluentPath {
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(16.25f)
                curveToRelative(0.12f, 0.0f, 0.22f, -0.08f, 0.24f, -0.2f)
                lineToRelative(0.01f, -0.05f)
                lineTo(20.5f, 3.0f)
                lineTo(3.75f, 3.0f)
                verticalLineToRelative(3.75f)
                curveToRelative(0.0f, 0.12f, 0.08f, 0.22f, 0.2f, 0.24f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(11.98f, 13.95f)
                lineTo(14.62f, 8.0f)
                lineToRelative(0.88f, -0.5f)
                lineToRelative(0.76f, 0.5f)
                lineToRelative(-2.91f, 6.55f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.37f, -0.6f)
                close()
                moveTo(13.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, -0.45f, 2.0f, -1.0f, 2.0f)
                reflectiveCurveToRelative(-1.0f, -0.9f, -1.0f, -2.0f)
                reflectiveCurveToRelative(0.45f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.9f, 1.0f, 2.0f)
                close()
            }
        }
        return _inkingToolAccent!!
    }

private var _inkingToolAccent: ImageVector? = null
