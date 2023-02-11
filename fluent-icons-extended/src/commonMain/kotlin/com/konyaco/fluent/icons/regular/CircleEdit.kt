

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CircleEdit: ImageVector
    get() {
        if (_circleEdit != null) {
            return _circleEdit!!
        }
        _circleEdit = fluentIcon(name = "Regular.CircleEdit") {
            fluentPath {
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -0.7f, 16.97f)
                lineToRelative(-0.24f, 0.94f)
                curveToRelative(-0.04f, 0.18f, -0.07f, 0.36f, -0.06f, 0.54f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.97f, -10.7f)
                arcToRelative(3.29f, 3.29f, 0.0f, false, false, -1.53f, -0.24f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 12.0f, 3.5f)
                close()
            }
            fluentPath {
                moveTo(20.72f, 12.0f)
                curveToRelative(-0.6f, 0.0f, -1.18f, 0.22f, -1.62f, 0.67f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.71f, 1.25f)
                lineToRelative(-0.46f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.52f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcTo(2.29f, 2.29f, 0.0f, false, false, 20.72f, 12.0f)
                close()
            }
        }
        return _circleEdit!!
    }

private var _circleEdit: ImageVector? = null
