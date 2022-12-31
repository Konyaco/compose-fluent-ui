

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EraserSegment: ImageVector
    get() {
        if (_eraserSegment != null) {
            return _eraserSegment!!
        }
        _eraserSegment = fluentIcon(name = "Regular.EraserSegment") {
            fluentPath {
                moveTo(15.84f, 2.66f)
                curveToRelative(-0.87f, -0.89f, -2.3f, -0.9f, -3.19f, -0.02f)
                lineToRelative(-9.6f, 9.5f)
                curveToRelative(-0.89f, 0.89f, -0.89f, 2.33f, 0.01f, 3.21f)
                lineToRelative(5.1f, 5.0f)
                curveToRelative(0.47f, 0.47f, 1.08f, 0.68f, 1.69f, 0.65f)
                horizontalLineToRelative(6.26f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.95f)
                lineToRelative(8.58f, -8.67f)
                curveToRelative(0.87f, -0.88f, 0.87f, -2.28f, 0.01f, -3.16f)
                lineToRelative(-4.9f, -5.0f)
                close()
                moveTo(9.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, -0.21f)
                lineToRelative(-5.1f, -5.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.07f)
                lineToRelative(1.53f, -1.51f)
                lineToRelative(6.1f, 6.1f)
                lineToRelative(-1.47f, 1.48f)
                curveToRelative(-0.13f, 0.13f, -0.3f, 0.2f, -0.47f, 0.22f)
                horizontalLineToRelative(-0.05f)
                close()
                moveTo(13.71f, 3.7f)
                curveToRelative(0.3f, -0.29f, 0.77f, -0.29f, 1.06f, 0.01f)
                lineToRelative(4.91f, 5.01f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.76f, 0.0f, 1.05f)
                lineToRelative(-6.89f, 6.96f)
                lineToRelative(-6.09f, -6.09f)
                lineToRelative(7.0f, -6.94f)
                close()
            }
        }
        return _eraserSegment!!
    }

private var _eraserSegment: ImageVector? = null
