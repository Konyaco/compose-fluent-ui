

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowRedo: ImageVector
    get() {
        if (_arrowRedo != null) {
            return _arrowRedo!!
        }
        _arrowRedo = fluentIcon(name = "Filled.ArrowRedo") {
            fluentPath {
                moveToRelative(18.0f, 7.59f)
                lineToRelative(-3.64f, -3.64f)
                arcToRelative(6.66f, 6.66f, 0.0f, true, false, -9.42f, 9.42f)
                lineToRelative(8.34f, 8.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, -1.42f)
                lineToRelative(-8.34f, -8.33f)
                arcToRelative(4.66f, 4.66f, 0.0f, false, true, 6.42f, -6.76f)
                lineToRelative(0.18f, 0.17f)
                lineTo(16.59f, 9.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.88f)
                verticalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.88f, 1.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.88f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, -0.11f)
                verticalLineToRelative(4.7f)
                lineToRelative(-3.64f, -3.64f)
                lineTo(18.0f, 7.6f)
                close()
            }
        }
        return _arrowRedo!!
    }

private var _arrowRedo: ImageVector? = null
