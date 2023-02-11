

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = fluentIcon(name = "Filled.CallMissed") {
            fluentPath {
                moveTo(20.93f, 5.66f)
                curveToRelative(-1.96f, -1.73f, -5.02f, -2.6f, -9.18f, -2.59f)
                curveToRelative(-4.16f, 0.0f, -7.13f, 0.88f, -8.9f, 2.6f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, false, -0.73f, 2.86f)
                lineToRelative(0.31f, 1.03f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, false, 2.28f, 1.51f)
                lineToRelative(2.03f, -0.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.71f, -1.55f)
                lineToRelative(0.4f, -2.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 6.22f, -0.18f)
                lineToRelative(0.64f, 2.35f)
                curveToRelative(0.22f, 0.85f, 0.98f, 1.48f, 1.87f, 1.57f)
                lineToRelative(2.05f, 0.2f)
                curveToRelative(1.03f, 0.1f, 1.94f, -0.56f, 2.12f, -1.53f)
                lineToRelative(0.2f, -1.04f)
                curveToRelative(0.2f, -1.02f, -0.2f, -2.1f, -1.02f, -2.83f)
                close()
                moveTo(11.75f, 14.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -11.0f)
                close()
                moveTo(8.0f, 16.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
            }
        }
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
