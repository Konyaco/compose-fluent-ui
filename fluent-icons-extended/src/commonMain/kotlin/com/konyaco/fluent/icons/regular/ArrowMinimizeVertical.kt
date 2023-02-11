

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowMinimizeVertical: ImageVector
    get() {
        if (_arrowMinimizeVertical != null) {
            return _arrowMinimizeVertical!!
        }
        _arrowMinimizeVertical = fluentIcon(name = "Regular.ArrowMinimizeVertical") {
            fluentPath {
                moveTo(11.75f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.19f)
                lineToRelative(1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineTo(11.0f, 6.94f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
            fluentPath {
                moveTo(4.0f, 11.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
            fluentPath {
                moveTo(13.72f, 17.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(11.0f, 16.56f)
                verticalLineToRelative(4.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-4.69f)
                lineToRelative(1.22f, 1.22f)
                close()
            }
        }
        return _arrowMinimizeVertical!!
    }

private var _arrowMinimizeVertical: ImageVector? = null
