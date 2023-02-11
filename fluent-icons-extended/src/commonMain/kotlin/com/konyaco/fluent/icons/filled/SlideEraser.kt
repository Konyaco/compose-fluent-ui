

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SlideEraser: ImageVector
    get() {
        if (_slideEraser != null) {
            return _slideEraser!!
        }
        _slideEraser = fluentIcon(name = "Filled.SlideEraser") {
            fluentPath {
                moveTo(4.75f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 20.0f)
                horizontalLineToRelative(7.83f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.17f, -3.35f)
                lineToRelative(4.91f, -4.92f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.54f, 0.0f)
                lineToRelative(0.8f, 0.8f)
                verticalLineTo(6.76f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 4.0f)
                horizontalLineTo(4.75f)
                close()
            }
            fluentPath {
                moveTo(20.5f, 12.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.13f, 0.0f)
                lineToRelative(-3.11f, 3.11f)
                lineToRelative(4.2f, 4.2f)
                lineToRelative(3.12f, -3.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -2.12f)
                lineToRelative(-2.09f, -2.09f)
                close()
            }
            fluentPath {
                moveTo(13.45f, 17.36f)
                lineToRelative(1.1f, -1.1f)
                lineToRelative(4.21f, 4.2f)
                lineToRelative(-1.1f, 1.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, 0.0f)
                lineToRelative(-2.09f, -2.08f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -2.12f)
                close()
            }
        }
        return _slideEraser!!
    }

private var _slideEraser: ImageVector? = null
