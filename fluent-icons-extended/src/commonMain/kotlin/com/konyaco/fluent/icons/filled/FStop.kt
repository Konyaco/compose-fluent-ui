

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FStop: ImageVector
    get() {
        if (_fStop != null) {
            return _fStop!!
        }
        _fStop = fluentIcon(name = "Filled.FStop") {
            fluentPath {
                moveTo(13.44f, 6.57f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.94f, -2.33f)
                lineToRelative(0.6f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.65f, -1.88f)
                lineToRelative(-0.6f, -0.21f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -6.56f, 3.88f)
                lineToRelative(-0.73f, 4.27f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.4f)
                lineToRelative(-0.69f, 4.04f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.4f, 2.13f)
                lineToRelative(-0.08f, -0.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.96f, 1.76f)
                lineToRelative(0.07f, 0.04f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 7.34f, -3.54f)
                lineToRelative(0.75f, -4.38f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-3.23f)
                lineToRelative(0.67f, -3.93f)
                close()
            }
        }
        return _fStop!!
    }

private var _fStop: ImageVector? = null
