

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CallForward: ImageVector
    get() {
        if (_callForward != null) {
            return _callForward!!
        }
        _callForward = fluentIcon(name = "Filled.CallForward") {
            fluentPath {
                moveToRelative(9.93f, 2.05f)
                lineToRelative(1.03f, 0.2f)
                curveToRelative(0.97f, 0.18f, 1.63f, 1.1f, 1.53f, 2.12f)
                lineToRelative(-0.2f, 2.05f)
                curveToRelative(-0.09f, 0.89f, -0.72f, 1.65f, -1.57f, 1.88f)
                lineToRelative(-2.35f, 0.63f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.18f, 6.23f)
                lineToRelative(2.2f, 0.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.55f, 1.7f)
                lineToRelative(0.2f, 2.04f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, true, -1.5f, 2.28f)
                lineToRelative(-1.04f, 0.3f)
                curveToRelative(-1.04f, 0.32f, -2.12f, 0.04f, -2.85f, -0.71f)
                curveToRelative(-1.74f, -1.78f, -2.6f, -4.75f, -2.61f, -8.91f)
                curveToRelative(0.0f, -4.17f, 0.86f, -7.23f, 2.59f, -9.2f)
                arcToRelative(3.05f, 3.05f, 0.0f, false, true, 2.84f, -1.01f)
                close()
                moveTo(16.7f, 7.15f)
                lineTo(16.78f, 7.22f)
                lineTo(20.78f, 11.22f)
                curveToRelative(0.26f, 0.26f, 0.29f, 0.68f, 0.07f, 0.97f)
                lineToRelative(-0.07f, 0.09f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.97f)
                lineToRelative(0.07f, -0.09f)
                lineToRelative(2.71f, -2.72f)
                lineTo(12.0f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.64f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.39f, 0.27f, -0.7f, 0.64f, -0.75f)
                horizontalLineToRelative(6.54f)
                lineToRelative(-2.72f, -2.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.24f, -0.24f, 0.6f, -0.28f, 0.87f, -0.14f)
                lineToRelative(0.1f, 0.07f)
                close()
            }
        }
        return _callForward!!
    }

private var _callForward: ImageVector? = null
