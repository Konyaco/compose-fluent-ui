

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowMinimize: ImageVector
    get() {
        if (_arrowMinimize != null) {
            return _arrowMinimize!!
        }
        _arrowMinimize = fluentIcon(name = "Filled.ArrowMinimize") {
            fluentPath {
                moveTo(10.5f, 12.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.89f)
                lineTo(11.5f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                lineTo(9.5f, 15.9f)
                lineToRelative(-5.8f, 5.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.31f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, -1.32f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(5.79f, -5.78f)
                lineTo(3.0f, 14.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineToRelative(7.62f)
                close()
                moveTo(13.5f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                lineTo(14.5f, 8.1f)
                lineToRelative(5.8f, -5.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.31f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.32f)
                lineToRelative(-0.08f, 0.1f)
                lineToRelative(-5.8f, 5.8f)
                lineTo(21.0f, 9.52f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 1.99f)
                lineTo(13.5f, 11.51f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                lineTo(12.5f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _arrowMinimize!!
    }

private var _arrowMinimize: ImageVector? = null
