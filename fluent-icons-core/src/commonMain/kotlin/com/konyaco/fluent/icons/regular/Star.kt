

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = fluentIcon(name = "Regular.Star") {
            fluentPath {
                moveTo(10.79f, 3.1f)
                curveToRelative(0.5f, -1.0f, 1.92f, -1.0f, 2.42f, 0.0f)
                lineToRelative(2.36f, 4.78f)
                lineToRelative(5.27f, 0.77f)
                curveToRelative(1.1f, 0.16f, 1.55f, 1.52f, 0.75f, 2.3f)
                lineToRelative(-3.82f, 3.72f)
                lineToRelative(0.9f, 5.25f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -1.96f, 1.42f)
                lineTo(12.0f, 18.86f)
                lineToRelative(-4.72f, 2.48f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -1.96f, -1.42f)
                lineToRelative(0.9f, -5.25f)
                lineToRelative(-3.81f, -3.72f)
                curveToRelative(-0.8f, -0.78f, -0.36f, -2.14f, 0.75f, -2.3f)
                lineToRelative(5.27f, -0.77f)
                lineToRelative(2.36f, -4.78f)
                close()
                moveTo(11.99f, 4.04f)
                lineTo(9.75f, 8.6f)
                curveToRelative(-0.2f, 0.4f, -0.58f, 0.68f, -1.02f, 0.74f)
                lineToRelative(-5.05f, 0.74f)
                lineToRelative(3.66f, 3.56f)
                curveToRelative(0.32f, 0.3f, 0.46f, 0.76f, 0.39f, 1.2f)
                lineToRelative(-0.87f, 5.02f)
                lineToRelative(4.52f, -2.37f)
                curveToRelative(0.4f, -0.2f, 0.86f, -0.2f, 1.26f, 0.0f)
                lineToRelative(4.51f, 2.37f)
                lineToRelative(-0.86f, -5.03f)
                curveToRelative(-0.07f, -0.43f, 0.07f, -0.88f, 0.39f, -1.2f)
                lineToRelative(3.65f, -3.55f)
                lineToRelative(-5.05f, -0.74f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -1.01f, -0.74f)
                lineTo(12.0f, 4.04f)
                close()
            }
        }
        return _star!!
    }

private var _star: ImageVector? = null
