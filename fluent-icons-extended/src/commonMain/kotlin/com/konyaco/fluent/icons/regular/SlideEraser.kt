

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideEraser: ImageVector
    get() {
        if (_slideEraser != null) {
            return _slideEraser!!
        }
        _slideEraser = fluentIcon(name = "Regular.SlideEraser") {
            fluentPath {
                moveTo(2.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 4.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(5.79f)
                lineToRelative(-0.8f, -0.8f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.7f, -0.5f)
                verticalLineTo(6.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineTo(4.75f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(7.26f)
                curveToRelative(0.02f, 0.53f, 0.2f, 1.06f, 0.57f, 1.5f)
                horizontalLineTo(4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 17.25f)
                verticalLineTo(6.75f)
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
                moveToRelative(13.45f, 17.36f)
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
