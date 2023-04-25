

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DrawText: ImageVector
    get() {
        if (_drawText != null) {
            return _drawText!!
        }
        _drawText = fluentIcon(name = "Filled.DrawText") {
            fluentPath {
                moveTo(12.24f, 13.15f)
                lineTo(7.76f, 13.15f)
                lineTo(10.0f, 6.75f)
                lineToRelative(2.24f, 6.4f)
                close()
                moveTo(12.94f, 15.15f)
                lineTo(13.27f, 16.08f)
                lineTo(14.84f, 14.51f)
                lineTo(11.08f, 3.76f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, -2.15f, 0.0f)
                lineTo(4.06f, 17.67f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.88f, 0.66f)
                lineToRelative(1.12f, -3.18f)
                horizontalLineToRelative(5.88f)
                close()
                moveTo(13.2f, 17.57f)
                lineTo(19.1f, 11.67f)
                arcToRelative(2.29f, 2.29f, 0.0f, true, true, 3.23f, 3.23f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.34f, 0.35f, -0.78f, 0.6f, -1.25f, 0.71f)
                lineToRelative(-1.83f, 0.46f)
                lineToRelative(-0.15f, 0.03f)
                curveToRelative(-0.59f, 0.2f, -2.98f, 0.57f, -3.82f, -0.1f)
                curveToRelative(-0.58f, -0.44f, -0.47f, -1.33f, -0.22f, -1.81f)
                curveToRelative(0.04f, -0.08f, -0.02f, -0.18f, -0.1f, -0.17f)
                curveToRelative(-0.67f, 0.1f, -1.25f, 0.45f, -1.83f, 0.8f)
                curveToRelative(-0.79f, 0.47f, -1.57f, 0.94f, -2.55f, 0.82f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, true, -1.71f, -1.26f)
                curveToRelative(-0.1f, -0.21f, 0.18f, -0.4f, 0.38f, -0.29f)
                curveToRelative(0.47f, 0.26f, 1.11f, 0.5f, 1.64f, 0.38f)
                curveToRelative(0.37f, -0.08f, 0.9f, -0.45f, 1.5f, -0.87f)
                curveToRelative(1.06f, -0.76f, 2.33f, -1.65f, 3.28f, -1.27f)
                curveToRelative(0.84f, 0.34f, 1.46f, 1.15f, 1.03f, 2.11f)
                curveToRelative(-0.05f, 0.12f, 0.0f, 0.27f, 0.13f, 0.3f)
                curveToRelative(0.42f, 0.1f, 0.78f, 0.06f, 1.13f, -0.1f)
                lineToRelative(0.43f, -1.72f)
                curveToRelative(0.12f, -0.47f, 0.36f, -0.9f, 0.7f, -1.25f)
                close()
            }
        }
        return _drawText!!
    }

private var _drawText: ImageVector? = null
