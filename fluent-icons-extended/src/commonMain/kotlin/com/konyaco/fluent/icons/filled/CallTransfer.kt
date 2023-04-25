

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CallTransfer: ImageVector
    get() {
        if (_callTransfer != null) {
            return _callTransfer!!
        }
        _callTransfer = fluentIcon(name = "Filled.CallTransfer") {
            fluentPath {
                moveTo(14.0f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(20.5f, 4.56f)
                lineToRelative(-3.97f, 3.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(3.97f, -3.97f)
                horizontalLineToRelative(-4.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(14.0f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(12.75f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(10.22f, 5.34f)
                lineTo(9.36f, 3.31f)
                arcTo(2.06f, 2.06f, 0.0f, false, false, 6.85f, 2.1f)
                lineToRelative(-1.08f, 0.35f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, false, -2.15f, 2.4f)
                curveToRelative(-0.63f, 2.73f, 0.13f, 6.05f, 2.26f, 9.97f)
                curveToRelative(2.13f, 3.91f, 4.46f, 6.26f, 7.0f, 7.05f)
                curveToRelative(1.08f, 0.34f, 2.24f, 0.04f, 3.05f, -0.77f)
                lineToRelative(0.82f, -0.82f)
                curveToRelative(0.76f, -0.77f, 0.87f, -2.02f, 0.26f, -2.92f)
                lineToRelative(-1.23f, -1.81f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, -2.33f, -0.82f)
                lineToRelative(-2.28f, 0.76f)
                arcTo(8.68f, 8.68f, 0.0f, false, true, 7.82f, 9.7f)
                lineTo(9.7f, 7.9f)
                curveToRelative(0.68f, -0.65f, 0.89f, -1.69f, 0.51f, -2.57f)
                close()
            }
        }
        return _callTransfer!!
    }

private var _callTransfer: ImageVector? = null
