

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.StarOff: ImageVector
    get() {
        if (_starOff != null) {
            return _starOff!!
        }
        _starOff = fluentIcon(name = "Filled.StarOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(4.8f, 4.8f)
                lineToRelative(-3.86f, 0.57f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -0.75f, 2.3f)
                lineToRelative(3.82f, 3.72f)
                lineToRelative(-0.9f, 5.25f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 1.95f, 1.42f)
                lineTo(12.0f, 18.86f)
                lineToRelative(4.72f, 2.48f)
                curveToRelative(0.99f, 0.52f, 2.14f, -0.32f, 1.96f, -1.42f)
                lineToRelative(-0.04f, -0.22f)
                lineToRelative(2.08f, 2.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(21.59f, 10.95f)
                lineTo(17.81f, 14.63f)
                lineTo(9.31f, 6.12f)
                lineTo(10.79f, 3.1f)
                curveToRelative(0.5f, -1.0f, 1.93f, -1.0f, 2.42f, 0.0f)
                lineToRelative(2.36f, 4.78f)
                lineToRelative(5.27f, 0.77f)
                curveToRelative(1.1f, 0.16f, 1.55f, 1.52f, 0.75f, 2.3f)
                close()
            }
        }
        return _starOff!!
    }

private var _starOff: ImageVector? = null
