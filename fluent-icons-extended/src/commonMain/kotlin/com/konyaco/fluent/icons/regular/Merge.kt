

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Merge: ImageVector
    get() {
        if (_merge != null) {
            return _merge!!
        }
        _merge = fluentIcon(name = "Regular.Merge") {
            fluentPath {
                moveTo(3.0f, 6.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(3.26f)
                curveToRelative(1.0f, 0.0f, 1.95f, 0.4f, 2.65f, 1.1f)
                lineToRelative(2.95f, 2.95f)
                curveToRelative(0.6f, 0.6f, 1.43f, 0.95f, 2.3f, 0.95f)
                horizontalLineToRelative(4.53f)
                lineToRelative(-3.72f, -3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(5.0f, 5.0f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(3.72f, -3.72f)
                horizontalLineToRelative(-4.47f)
                curveToRelative(-0.9f, 0.0f, -1.75f, 0.37f, -2.36f, 1.01f)
                lineToRelative(-2.68f, 2.82f)
                curveToRelative(-0.7f, 0.75f, -1.69f, 1.17f, -2.72f, 1.17f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.46f)
                curveToRelative(0.62f, 0.0f, 1.2f, -0.25f, 1.63f, -0.7f)
                lineToRelative(2.68f, -2.82f)
                curveToRelative(0.26f, -0.27f, 0.55f, -0.51f, 0.86f, -0.71f)
                curveToRelative(-0.3f, -0.19f, -0.58f, -0.4f, -0.83f, -0.66f)
                lineTo(8.6f, 8.16f)
                curveToRelative(-0.42f, -0.42f, -1.0f, -0.66f, -1.6f, -0.66f)
                horizontalLineTo(3.76f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 6.75f)
                close()
            }
        }
        return _merge!!
    }

private var _merge: ImageVector? = null
