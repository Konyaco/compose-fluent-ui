

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CircleEdit: ImageVector
    get() {
        if (_circleEdit != null) {
            return _circleEdit!!
        }
        _circleEdit = fluentIcon(name = "Filled.CircleEdit") {
            fluentPath {
                moveTo(20.72f, 11.0f)
                curveToRelative(0.42f, 0.0f, 0.85f, 0.08f, 1.25f, 0.25f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 11.0f, 21.95f)
                curveToRelative(0.0f, -0.18f, 0.02f, -0.36f, 0.06f, -0.54f)
                lineToRelative(0.46f, -1.83f)
                curveToRelative(0.16f, -0.65f, 0.5f, -1.24f, 0.97f, -1.72f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, 2.32f, -0.96f)
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
