

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CalligraphyPen: ImageVector
    get() {
        if (_calligraphyPen != null) {
            return _calligraphyPen!!
        }
        _calligraphyPen = fluentIcon(name = "Regular.CalligraphyPen") {
            fluentPath {
                moveTo(7.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.9f, 0.67f, 1.64f, 1.54f, 1.74f)
                lineToRelative(-1.01f, 2.5f)
                curveToRelative(-0.41f, 1.0f, -0.37f, 2.19f, 0.12f, 3.15f)
                lineToRelative(3.99f, 7.95f)
                curveToRelative(0.28f, 0.56f, 0.8f, 0.91f, 1.36f, 0.91f)
                reflectiveCurveToRelative(1.08f, -0.35f, 1.36f, -0.91f)
                lineToRelative(4.0f, -7.95f)
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
                moveTo(14.84f, 7.5f)
                lineToRelative(1.24f, 3.06f)
                curveToRelative(0.25f, 0.6f, 0.22f, 1.33f, -0.07f, 1.9f)
                lineToRelative(-3.26f, 6.5f)
                lineTo(12.75f, 12.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, 0.0f)
                verticalLineToRelative(6.67f)
                lineToRelative(-3.26f, -6.5f)
                arcToRelative(2.37f, 2.37f, 0.0f, false, true, -0.07f, -1.91f)
                lineTo(9.16f, 7.5f)
                horizontalLineToRelative(5.68f)
                close()
            }
        }
        return _calligraphyPen!!
    }

private var _calligraphyPen: ImageVector? = null
