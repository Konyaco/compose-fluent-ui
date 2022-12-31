

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TargetEdit: ImageVector
    get() {
        if (_targetEdit != null) {
            return _targetEdit!!
        }
        _targetEdit = fluentIcon(name = "Regular.TargetEdit") {
            fluentPath {
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.99f, 0.37f)
                lineToRelative(-2.66f, 2.66f)
                arcTo(4.48f, 4.48f, 0.0f, false, false, 12.0f, 7.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 3.03f, 7.83f)
                lineToRelative(-2.54f, 2.53f)
                lineToRelative(-0.12f, 0.13f)
                lineTo(12.0f, 17.99f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 12.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 8.44f, 7.51f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 1.53f, 0.24f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 11.0f, 21.95f)
                curveToRelative(0.0f, -0.18f, 0.02f, -0.36f, 0.06f, -0.54f)
                lineToRelative(0.24f, -0.94f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 12.0f, 3.5f)
                close()
                moveTo(19.1f, 12.67f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.34f, -0.59f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.47f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.53f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _targetEdit!!
    }

private var _targetEdit: ImageVector? = null
