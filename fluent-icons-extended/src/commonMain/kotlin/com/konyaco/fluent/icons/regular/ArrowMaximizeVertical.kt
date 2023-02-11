

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowMaximizeVertical: ImageVector
    get() {
        if (_arrowMaximizeVertical != null) {
            return _arrowMaximizeVertical!!
        }
        _arrowMaximizeVertical = fluentIcon(name = "Regular.ArrowMaximizeVertical") {
            fluentPath {
                moveTo(13.72f, 5.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineTo(11.0f, 4.56f)
                verticalLineToRelative(4.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.5f, 4.56f)
                lineToRelative(1.22f, 1.22f)
                close()
                moveTo(4.0f, 11.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(4.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(12.5f, 14.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(4.69f)
                lineToRelative(-1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.22f, 1.22f)
                verticalLineToRelative(-4.69f)
                close()
            }
        }
        return _arrowMaximizeVertical!!
    }

private var _arrowMaximizeVertical: ImageVector? = null
