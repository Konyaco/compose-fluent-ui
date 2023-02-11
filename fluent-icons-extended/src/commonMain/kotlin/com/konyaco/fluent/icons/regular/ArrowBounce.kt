

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowBounce: ImageVector
    get() {
        if (_arrowBounce != null) {
            return _arrowBounce!!
        }
        _arrowBounce = fluentIcon(name = "Regular.ArrowBounce") {
            fluentPath {
                moveTo(11.0f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(8.56f)
                lineToRelative(8.72f, 8.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(8.5f, -8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-7.97f, 7.97f)
                lineTo(4.56f, 7.5f)
                horizontalLineToRelative(5.7f)
                curveToRelative(0.4f, 0.0f, 0.74f, -0.34f, 0.74f, -0.75f)
                close()
            }
        }
        return _arrowBounce!!
    }

private var _arrowBounce: ImageVector? = null
