

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CalligraphyPen: ImageVector
    get() {
        if (_calligraphyPen != null) {
            return _calligraphyPen!!
        }
        _calligraphyPen = fluentIcon(name = "Filled.CalligraphyPen") {
            fluentPath {
                moveTo(7.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.9f, 0.67f, 1.64f, 1.54f, 1.74f)
                lineToRelative(-1.01f, 2.5f)
                curveToRelative(-0.41f, 1.0f, -0.37f, 2.19f, 0.12f, 3.15f)
                lineToRelative(3.99f, 7.95f)
                curveToRelative(0.14f, 0.3f, 0.36f, 0.53f, 0.61f, 0.69f)
                verticalLineTo(12.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, 0.0f)
                verticalLineToRelative(9.48f)
                curveToRelative(0.25f, -0.16f, 0.47f, -0.4f, 0.61f, -0.7f)
                lineToRelative(4.0f, -7.94f)
                curveToRelative(0.48f, -0.96f, 0.52f, -2.14f, 0.11f, -3.15f)
                lineToRelative(-1.01f, -2.5f)
                curveToRelative(0.87f, -0.1f, 1.54f, -0.84f, 1.54f, -1.74f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        return _calligraphyPen!!
    }

private var _calligraphyPen: ImageVector? = null
