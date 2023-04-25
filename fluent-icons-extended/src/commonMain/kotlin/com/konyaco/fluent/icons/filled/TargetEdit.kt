

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TargetEdit: ImageVector
    get() {
        if (_targetEdit != null) {
            return _targetEdit!!
        }
        _targetEdit = fluentIcon(name = "Filled.TargetEdit") {
            fluentPath {
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.99f, 0.37f)
                lineToRelative(-5.5f, 5.5f)
                lineToRelative(-0.12f, 0.12f)
                lineTo(12.0f, 17.99f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.95f, 7.09f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 2.02f, 0.16f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 11.0f, 21.95f)
                curveToRelative(0.0f, -0.18f, 0.02f, -0.36f, 0.06f, -0.54f)
                lineToRelative(0.36f, -1.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.2f, 18.57f)
                curveToRelative(-0.35f, 0.34f, -0.6f, 0.78f, -0.71f, 1.25f)
                lineToRelative(-0.46f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.52f, 1.52f, 1.32f, 1.32f)
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
