

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowSwap: ImageVector
    get() {
        if (_arrowSwap != null) {
            return _arrowSwap!!
        }
        _arrowSwap = fluentIcon(name = "Filled.ArrowSwap") {
            fluentPath {
                moveTo(15.2f, 2.3f)
                lineToRelative(4.0f, 3.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.1f, 1.32f)
                lineToRelative(-0.1f, 0.09f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.49f, -1.31f)
                lineToRelative(0.08f, -0.1f)
                lineTo(16.1f, 8.0f)
                lineTo(5.5f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.87f)
                lineTo(4.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -1.0f)
                lineTo(16.1f, 6.0f)
                lineToRelative(-2.3f, -2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.09f, -1.31f)
                lineToRelative(0.08f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                close()
                moveTo(19.5f, 16.88f)
                lineTo(19.5f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.89f, 1.0f)
                lineTo(7.91f, 18.0f)
                lineToRelative(2.3f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.31f)
                lineToRelative(-0.08f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, -1.32f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.5f, 1.32f)
                lineToRelative(-0.08f, 0.1f)
                lineTo(7.9f, 16.0f)
                lineTo(18.5f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                lineTo(19.5f, 17.0f)
                verticalLineToRelative(-0.12f)
                close()
            }
        }
        return _arrowSwap!!
    }

private var _arrowSwap: ImageVector? = null
