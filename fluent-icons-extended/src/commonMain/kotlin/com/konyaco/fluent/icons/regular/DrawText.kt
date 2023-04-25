

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DrawText: ImageVector
    get() {
        if (_drawText != null) {
            return _drawText!!
        }
        _drawText = fluentIcon(name = "Regular.DrawText") {
            fluentPath {
                moveTo(10.0f, 5.71f)
                lineTo(7.23f, 13.5f)
                horizontalLineToRelative(5.53f)
                lineTo(10.0f, 5.71f)
                close()
                moveTo(13.57f, 15.78f)
                lineTo(13.3f, 15.0f)
                lineTo(6.7f, 15.0f)
                lineToRelative(-1.24f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.42f, -0.5f)
                lineTo(9.16f, 3.6f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, 1.68f, 0.0f)
                lineToRelative(3.9f, 11.0f)
                lineToRelative(-1.17f, 1.18f)
                close()
                moveTo(5.0f, 20.38f)
                curveToRelative(-0.53f, 0.11f, -1.17f, -0.13f, -1.64f, -0.39f)
                curveToRelative(-0.2f, -0.1f, -0.48f, 0.08f, -0.38f, 0.3f)
                curveToRelative(0.24f, 0.52f, 0.73f, 1.12f, 1.7f, 1.25f)
                curveToRelative(0.99f, 0.12f, 1.77f, -0.35f, 2.56f, -0.82f)
                curveToRelative(0.58f, -0.35f, 1.16f, -0.7f, 1.82f, -0.8f)
                curveToRelative(0.09f, -0.01f, 0.15f, 0.1f, 0.1f, 0.17f)
                curveToRelative(-0.24f, 0.48f, -0.35f, 1.37f, 0.22f, 1.82f)
                curveToRelative(0.85f, 0.66f, 3.24f, 0.29f, 3.83f, 0.09f)
                lineToRelative(0.15f, -0.03f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                lineToRelative(-5.9f, 5.9f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.44f, 1.71f)
                curveToRelative(-0.35f, 0.17f, -0.7f, 0.2f, -1.13f, 0.1f)
                curveToRelative(-0.13f, -0.02f, -0.18f, -0.17f, -0.13f, -0.29f)
                curveToRelative(0.43f, -0.96f, -0.19f, -1.77f, -1.03f, -2.11f)
                curveToRelative(-0.95f, -0.38f, -2.22f, 0.51f, -3.29f, 1.27f)
                curveToRelative(-0.6f, 0.42f, -1.12f, 0.8f, -1.5f, 0.87f)
                close()
            }
        }
        return _drawText!!
    }

private var _drawText: ImageVector? = null
