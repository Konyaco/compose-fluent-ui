

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EraserSegment: ImageVector
    get() {
        if (_eraserSegment != null) {
            return _eraserSegment!!
        }
        _eraserSegment = fluentIcon(name = "Filled.EraserSegment") {
            fluentPath {
                moveTo(12.65f, 2.64f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.2f, 0.02f)
                lineToRelative(4.9f, 5.0f)
                curveToRelative(0.86f, 0.89f, 0.86f, 2.3f, 0.0f, 3.17f)
                lineToRelative(-8.59f, 8.67f)
                horizontalLineToRelative(3.95f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineTo(9.85f)
                curveToRelative(-0.6f, 0.03f, -1.22f, -0.18f, -1.7f, -0.64f)
                lineToRelative(-5.09f, -5.01f)
                curveToRelative(-0.9f, -0.88f, -0.9f, -2.32f, 0.0f, -3.2f)
                lineToRelative(9.6f, -9.51f)
                close()
                moveTo(9.8f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.47f, -0.22f)
                lineToRelative(1.47f, -1.48f)
                lineToRelative(-6.1f, -6.1f)
                lineTo(4.1f, 13.2f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.78f, 0.0f, 1.07f)
                lineToRelative(5.1f, 5.0f)
                curveToRelative(0.15f, 0.15f, 0.35f, 0.23f, 0.54f, 0.22f)
                horizontalLineToRelative(0.05f)
                close()
            }
        }
        return _eraserSegment!!
    }

private var _eraserSegment: ImageVector? = null
