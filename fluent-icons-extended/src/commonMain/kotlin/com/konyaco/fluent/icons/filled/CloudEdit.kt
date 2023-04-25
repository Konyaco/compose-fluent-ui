

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CloudEdit: ImageVector
    get() {
        if (_cloudEdit != null) {
            return _cloudEdit!!
        }
        _cloudEdit = fluentIcon(name = "Filled.CloudEdit") {
            fluentPath {
                moveTo(6.08f, 9.02f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.84f, 0.0f)
                curveToRelative(0.92f, 0.08f, 1.76f, 0.45f, 2.43f, 1.0f)
                curveToRelative(-0.71f, 0.08f, -1.4f, 0.4f, -1.96f, 0.94f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.33f, 0.33f, -0.59f, 0.72f, -0.77f, 1.14f)
                lineTo(6.5f, 18.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.42f, -8.98f)
                close()
                moveTo(19.1f, 11.67f)
                lineTo(13.2f, 17.57f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.47f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.53f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _cloudEdit!!
    }

private var _cloudEdit: ImageVector? = null
