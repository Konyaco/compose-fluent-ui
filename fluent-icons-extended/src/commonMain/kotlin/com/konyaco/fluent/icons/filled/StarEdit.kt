

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.StarEdit: ImageVector
    get() {
        if (_starEdit != null) {
            return _starEdit!!
        }
        _starEdit = fluentIcon(name = "Filled.StarEdit") {
            fluentPath {
                moveTo(13.2f, 3.1f)
                curveToRelative(-0.49f, -1.0f, -1.92f, -1.0f, -2.41f, 0.0f)
                lineTo(8.43f, 7.88f)
                lineToRelative(-5.27f, 0.77f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -0.75f, 2.3f)
                lineToRelative(3.81f, 3.72f)
                lineToRelative(-0.9f, 5.25f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 1.96f, 1.42f)
                lineToRelative(2.94f, -1.54f)
                lineToRelative(0.3f, -1.22f)
                curveToRelative(0.17f, -0.65f, 0.5f, -1.24f, 0.98f, -1.72f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, 4.37f, -0.23f)
                curveToRelative(0.53f, -0.8f, 0.08f, -1.94f, -0.93f, -2.08f)
                lineToRelative(-5.27f, -0.77f)
                lineTo(13.2f, 3.1f)
                close()
                moveTo(18.1f, 11.67f)
                lineTo(12.2f, 17.57f)
                curveToRelative(-0.34f, 0.35f, -0.58f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.46f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.52f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.24f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _starEdit!!
    }

private var _starEdit: ImageVector? = null
