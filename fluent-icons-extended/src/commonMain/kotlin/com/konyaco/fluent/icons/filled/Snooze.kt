

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Snooze: ImageVector
    get() {
        if (_snooze != null) {
            return _snooze!!
        }
        _snooze = fluentIcon(name = "Filled.Snooze") {
            fluentPath {
                moveTo(9.0f, 12.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.85f, 1.54f)
                lineToRelative(-0.07f, 0.09f)
                lineTo(5.08f, 20.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.88f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.85f, -1.53f)
                lineToRelative(0.07f, -0.1f)
                lineToRelative(4.7f, -5.87f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                verticalLineToRelative(-0.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -0.99f)
                horizontalLineTo(9.0f)
                close()
                moveTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.84f, 1.54f)
                lineToRelative(-0.07f, 0.1f)
                lineTo(14.11f, 13.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.88f, 1.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.84f, -1.54f)
                lineToRelative(0.07f, -0.1f)
                lineTo(18.89f, 4.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -1.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        return _snooze!!
    }

private var _snooze: ImageVector? = null
