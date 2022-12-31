

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowRouting: ImageVector
    get() {
        if (_arrowRouting != null) {
            return _arrowRouting!!
        }
        _arrowRouting = fluentIcon(name = "Regular.ArrowRouting") {
            fluentPath {
                moveTo(18.78f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(19.44f, 5.0f)
                horizontalLineToRelative(-6.19f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.75f, 2.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-1.3f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -0.12f, 1.5f)
                horizontalLineToRelative(1.42f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 12.0f, 17.25f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(6.19f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(3.0f, -3.0f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(3.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
            }
        }
        return _arrowRouting!!
    }

private var _arrowRouting: ImageVector? = null
