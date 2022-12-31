

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatMultiple: ImageVector
    get() {
        if (_chatMultiple != null) {
            return _chatMultiple!!
        }
        _chatMultiple = fluentIcon(name = "Filled.ChatMultiple") {
            fluentPath {
                moveTo(9.5f, 3.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -6.8f, 10.67f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, -0.68f, 3.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.15f, 1.17f)
                curveToRelative(0.63f, -0.11f, 1.98f, -0.36f, 3.24f, -0.65f)
                arcTo(7.5f, 7.5f, 0.0f, true, false, 9.5f, 3.0f)
                close()
                moveTo(9.46f, 19.0f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, false, 8.19f, 1.34f)
                curveToRelative(1.04f, 0.24f, 2.19f, 0.48f, 2.91f, 0.64f)
                curveToRelative(0.9f, 0.18f, 1.67f, -0.62f, 1.47f, -1.5f)
                curveToRelative(-0.16f, -0.7f, -0.42f, -1.8f, -0.67f, -2.8f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -4.34f, -10.26f)
                curveToRelative(0.35f, 0.63f, 0.62f, 1.31f, 0.8f, 2.04f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.08f, 7.79f)
                lineToRelative(-0.13f, 0.25f)
                lineToRelative(0.07f, 0.28f)
                curveToRelative(0.23f, 0.9f, 0.46f, 1.9f, 0.64f, 2.65f)
                lineToRelative(-2.74f, -0.61f)
                lineToRelative(-0.26f, -0.07f)
                lineToRelative(-0.25f, 0.13f)
                arcToRelative(5.97f, 5.97f, 0.0f, false, true, -5.59f, -0.14f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, true, -2.18f, 0.26f)
                close()
            }
        }
        return _chatMultiple!!
    }

private var _chatMultiple: ImageVector? = null
