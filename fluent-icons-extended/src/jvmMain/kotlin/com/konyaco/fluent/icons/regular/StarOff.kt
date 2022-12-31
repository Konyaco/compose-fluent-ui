

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.StarOff: ImageVector
    get() {
        if (_starOff != null) {
            return _starOff!!
        }
        _starOff = fluentIcon(name = "Regular.StarOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(4.8f, 4.8f)
                lineToRelative(-3.86f, 0.57f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -0.75f, 2.3f)
                lineToRelative(3.81f, 3.72f)
                lineToRelative(-0.9f, 5.25f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 1.96f, 1.42f)
                lineTo(12.0f, 18.86f)
                lineToRelative(4.71f, 2.48f)
                curveToRelative(1.0f, 0.52f, 2.15f, -0.32f, 1.96f, -1.42f)
                lineToRelative(-0.04f, -0.22f)
                lineToRelative(2.09f, 2.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(16.8f, 17.86f)
                lineToRelative(0.34f, 2.01f)
                lineToRelative(-4.51f, -2.37f)
                curveToRelative(-0.4f, -0.2f, -0.87f, -0.2f, -1.26f, 0.0f)
                lineToRelative(-4.52f, 2.37f)
                lineToRelative(0.87f, -5.03f)
                curveToRelative(0.07f, -0.43f, -0.07f, -0.88f, -0.4f, -1.2f)
                lineTo(3.68f, 10.1f)
                lineToRelative(4.68f, -0.68f)
                lineToRelative(8.45f, 8.45f)
                close()
                moveTo(20.32f, 10.09f)
                lineToRelative(-3.57f, 3.48f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(3.78f, -3.68f)
                curveToRelative(0.8f, -0.78f, 0.36f, -2.14f, -0.75f, -2.3f)
                lineToRelative(-5.27f, -0.77f)
                lineTo(13.2f, 3.1f)
                curveToRelative(-0.5f, -1.0f, -1.93f, -1.0f, -2.42f, 0.0f)
                lineTo(9.3f, 6.12f)
                lineToRelative(1.12f, 1.12f)
                lineTo(12.0f, 4.04f)
                lineToRelative(2.26f, 4.57f)
                curveToRelative(0.2f, 0.4f, 0.57f, 0.68f, 1.01f, 0.74f)
                lineToRelative(5.05f, 0.74f)
                close()
            }
        }
        return _starOff!!
    }

private var _starOff: ImageVector? = null
