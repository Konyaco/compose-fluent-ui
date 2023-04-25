

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SparkleCircle: ImageVector
    get() {
        if (_sparkleCircle != null) {
            return _sparkleCircle!!
        }
        _sparkleCircle = fluentIcon(name = "Filled.SparkleCircle") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                close()
                moveTo(8.56f, 6.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.88f, 0.0f)
                lineToRelative(0.46f, 1.3f)
                curveToRelative(0.1f, 0.29f, 0.34f, 0.52f, 0.64f, 0.63f)
                lineToRelative(1.3f, 0.46f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.88f)
                lineToRelative(-1.3f, 0.46f)
                curveToRelative(-0.3f, 0.1f, -0.53f, 0.34f, -0.64f, 0.64f)
                lineToRelative(-0.46f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.88f, 0.0f)
                lineToRelative(-0.46f, -1.3f)
                curveToRelative(-0.1f, -0.3f, -0.34f, -0.53f, -0.64f, -0.64f)
                lineToRelative(-1.3f, -0.46f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.88f)
                lineToRelative(1.3f, -0.46f)
                curveToRelative(0.3f, -0.1f, 0.54f, -0.34f, 0.64f, -0.64f)
                lineToRelative(0.46f, -1.3f)
                close()
                moveTo(15.95f, 12.71f)
                lineTo(16.13f, 13.31f)
                curveToRelative(0.08f, 0.27f, 0.3f, 0.48f, 0.57f, 0.56f)
                lineToRelative(0.6f, 0.18f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, 0.0f, 1.9f)
                lineToRelative(-0.6f, 0.18f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, -0.57f, 0.57f)
                lineToRelative(-0.18f, 0.6f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -1.9f, 0.0f)
                lineToRelative(-0.18f, -0.6f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, -0.57f, -0.57f)
                lineToRelative(-0.6f, -0.18f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, 0.0f, -1.9f)
                lineToRelative(0.6f, -0.18f)
                curveToRelative(0.28f, -0.08f, 0.49f, -0.3f, 0.57f, -0.57f)
                lineToRelative(0.18f, -0.6f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, 1.9f, 0.0f)
                close()
            }
        }
        return _sparkleCircle!!
    }

private var _sparkleCircle: ImageVector? = null
