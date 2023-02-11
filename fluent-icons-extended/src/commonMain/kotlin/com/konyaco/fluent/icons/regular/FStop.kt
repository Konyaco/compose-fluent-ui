

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FStop: ImageVector
    get() {
        if (_fStop != null) {
            return _fStop!!
        }
        _fStop = fluentIcon(name = "Regular.FStop") {
            fluentPath {
                moveTo(13.2f, 6.53f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 17.46f, 4.0f)
                lineToRelative(0.6f, 0.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.49f, -1.4f)
                lineToRelative(-0.6f, -0.21f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -6.23f, 3.69f)
                lineTo(11.0f, 10.5f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.99f)
                lineToRelative(-0.78f, 4.58f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -4.77f, 2.3f)
                lineToRelative(-0.08f, -0.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.72f, 1.32f)
                lineToRelative(0.07f, 0.04f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 6.98f, -3.36f)
                lineToRelative(0.82f, -4.84f)
                horizontalLineToRelative(3.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.73f)
                lineToRelative(0.68f, -3.97f)
                close()
            }
        }
        return _fStop!!
    }

private var _fStop: ImageVector? = null
