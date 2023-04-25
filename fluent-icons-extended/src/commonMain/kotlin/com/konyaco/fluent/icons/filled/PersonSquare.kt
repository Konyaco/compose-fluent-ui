

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonSquare: ImageVector
    get() {
        if (_personSquare != null) {
            return _personSquare!!
        }
        _personSquare = fluentIcon(name = "Filled.PersonSquare") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                close()
                moveTo(15.5f, 12.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.97f, -1.86f, 4.0f, -5.0f, 4.0f)
                curveToRelative(-3.14f, 0.0f, -5.0f, -2.03f, -5.0f, -4.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(12.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -5.5f)
                close()
            }
        }
        return _personSquare!!
    }

private var _personSquare: ImageVector? = null
