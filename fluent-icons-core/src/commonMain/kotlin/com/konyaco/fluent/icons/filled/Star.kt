

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = fluentIcon(name = "Filled.Star") {
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
            }
        }
        return _star!!
    }

private var _star: ImageVector? = null
