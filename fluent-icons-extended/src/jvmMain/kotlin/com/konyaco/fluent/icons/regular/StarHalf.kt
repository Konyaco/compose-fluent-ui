

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = fluentIcon(name = "Regular.StarHalf") {
            fluentPath {
                moveTo(12.0f, 2.35f)
                curveToRelative(-0.48f, 0.0f, -0.96f, 0.25f, -1.21f, 0.75f)
                lineTo(8.43f, 7.88f)
                lineToRelative(-5.27f, 0.77f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -0.75f, 2.3f)
                lineToRelative(3.81f, 3.72f)
                lineToRelative(-0.9f, 5.25f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 1.96f, 1.42f)
                lineTo(12.0f, 18.86f)
                lineToRelative(4.71f, 2.48f)
                curveToRelative(1.0f, 0.52f, 2.15f, -0.32f, 1.96f, -1.42f)
                lineToRelative(-0.9f, -5.25f)
                lineToRelative(3.82f, -3.72f)
                curveToRelative(0.8f, -0.78f, 0.36f, -2.14f, -0.75f, -2.3f)
                lineToRelative(-5.27f, -0.77f)
                lineTo(13.2f, 3.1f)
                curveToRelative(-0.25f, -0.5f, -0.73f, -0.75f, -1.21f, -0.75f)
                close()
                moveTo(12.0f, 17.35f)
                lineTo(12.0f, 4.04f)
                lineToRelative(2.26f, 4.56f)
                curveToRelative(0.2f, 0.4f, 0.57f, 0.68f, 1.01f, 0.74f)
                lineToRelative(5.05f, 0.74f)
                lineToRelative(-3.65f, 3.56f)
                curveToRelative(-0.32f, 0.3f, -0.46f, 0.76f, -0.39f, 1.2f)
                lineToRelative(0.86f, 5.02f)
                lineToRelative(-4.51f, -2.37f)
                curveToRelative(-0.2f, -0.1f, -0.41f, -0.16f, -0.63f, -0.16f)
                close()
            }
        }
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
