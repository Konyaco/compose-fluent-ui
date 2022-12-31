

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EraserMedium: ImageVector
    get() {
        if (_eraserMedium != null) {
            return _eraserMedium!!
        }
        _eraserMedium = fluentIcon(name = "Regular.EraserMedium") {
            fluentPath {
                moveTo(15.84f, 2.66f)
                curveToRelative(-0.87f, -0.89f, -2.3f, -0.9f, -3.19f, -0.02f)
                lineToRelative(-9.6f, 9.5f)
                curveToRelative(-0.89f, 0.89f, -0.89f, 2.33f, 0.0f, 3.21f)
                lineToRelative(5.1f, 5.0f)
                curveToRelative(0.9f, 0.88f, 2.31f, 0.87f, 3.18f, -0.01f)
                lineToRelative(0.22f, -0.22f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, true, -0.48f, -1.65f)
                lineToRelative(-0.8f, 0.81f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-5.1f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.07f)
                lineToRelative(1.53f, -1.51f)
                lineTo(11.0f, 17.07f)
                curveToRelative(0.04f, -0.6f, 0.17f, -1.2f, 0.37f, -1.75f)
                lineTo(6.7f, 10.64f)
                lineToRelative(7.0f, -6.94f)
                curveToRelative(0.3f, -0.29f, 0.78f, -0.29f, 1.07f, 0.01f)
                lineToRelative(4.91f, 5.01f)
                curveToRelative(0.29f, 0.3f, 0.29f, 0.76f, 0.0f, 1.05f)
                lineToRelative(-1.28f, 1.3f)
                curveToRelative(0.58f, 0.07f, 1.14f, 0.23f, 1.66f, 0.45f)
                lineToRelative(0.68f, -0.7f)
                curveToRelative(0.87f, -0.87f, 0.87f, -2.27f, 0.01f, -3.15f)
                lineToRelative(-4.9f, -5.0f)
                close()
            }
            fluentPath {
                moveTo(19.29f, 12.3f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -1.82f, -0.3f)
            }
            fluentPath {
                moveTo(17.5f, 12.0f)
                curveToRelative(0.63f, 0.0f, 1.23f, 0.1f, 1.79f, 0.3f)
                close()
            }
            fluentPath {
                moveTo(17.5f, 12.0f)
                horizontalLineToRelative(-0.03f)
                close()
            }
        }
        return _eraserMedium!!
    }

private var _eraserMedium: ImageVector? = null
