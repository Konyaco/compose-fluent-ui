

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatSettings: ImageVector
    get() {
        if (_chatSettings != null) {
            return _chatSettings!!
        }
        _chatSettings = fluentIcon(name = "Filled.ChatSettings") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.97f, 10.78f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -9.19f, 9.19f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, true, -5.42f, -1.11f)
                lineToRelative(-4.3f, 1.12f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, -1.03f, -1.04f)
                lineToRelative(1.11f, -4.29f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(14.28f, 13.98f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.44f, 2.5f)
                lineToRelative(-0.59f, 0.14f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, 0.0f, 1.8f)
                lineToRelative(0.55f, 0.13f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.45f, 2.51f)
                lineToRelative(-0.19f, 0.64f)
                curveToRelative(0.44f, 0.38f, 0.94f, 0.7f, 1.49f, 0.92f)
                lineToRelative(0.49f, -0.52f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.9f, 0.0f)
                lineToRelative(0.5f, 0.52f)
                arcToRelative(5.28f, 5.28f, 0.0f, false, false, 1.48f, -0.91f)
                lineToRelative(-0.2f, -0.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.44f, -2.5f)
                lineToRelative(0.59f, -0.14f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, false, 0.0f, -1.8f)
                lineToRelative(-0.55f, -0.13f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.45f, -2.51f)
                lineToRelative(0.19f, -0.63f)
                curveToRelative(-0.44f, -0.4f, -0.94f, -0.7f, -1.49f, -0.93f)
                lineToRelative(-0.49f, 0.52f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.9f, 0.0f)
                lineToRelative(-0.5f, -0.52f)
                curveToRelative(-0.54f, 0.22f, -1.04f, 0.53f, -1.48f, 0.9f)
                lineToRelative(0.2f, 0.7f)
                close()
                moveTo(17.5f, 16.0f)
                curveToRelative(0.8f, 0.0f, 1.45f, 0.67f, 1.45f, 1.5f)
                reflectiveCurveTo(18.3f, 19.0f, 17.5f, 19.0f)
                curveToRelative(-0.8f, 0.0f, -1.45f, -0.67f, -1.45f, -1.5f)
                reflectiveCurveTo(16.7f, 16.0f, 17.5f, 16.0f)
                close()
            }
        }
        return _chatSettings!!
    }

private var _chatSettings: ImageVector? = null
