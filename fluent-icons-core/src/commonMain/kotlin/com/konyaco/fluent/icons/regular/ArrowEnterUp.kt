

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowEnterUp: ImageVector
    get() {
        if (_arrowEnterUp != null) {
            return _arrowEnterUp!!
        }
        _arrowEnterUp = fluentIcon(name = "Regular.ArrowEnterUp") {
            fluentPath {
                moveTo(20.0f, 21.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-6.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 9.0f, 18.25f)
                verticalLineTo(4.6f)
                lineTo(5.28f, 8.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.08f)
                lineToRelative(0.08f, 0.08f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 1.13f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-3.72f, -3.72f)
                verticalLineToRelative(13.66f)
                curveToRelative(0.0f, 1.2f, 0.93f, 2.17f, 2.1f, 2.25f)
                horizontalLineToRelative(6.65f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                close()
            }
        }
        return _arrowEnterUp!!
    }

private var _arrowEnterUp: ImageVector? = null
