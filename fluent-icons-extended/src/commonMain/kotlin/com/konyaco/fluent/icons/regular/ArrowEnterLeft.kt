

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowEnterLeft: ImageVector
    get() {
        if (_arrowEnterLeft != null) {
            return _arrowEnterLeft!!
        }
        _arrowEnterLeft = fluentIcon(name = "Regular.ArrowEnterLeft") {
            fluentPath {
                moveTo(21.25f, 4.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 18.25f, 15.0f)
                horizontalLineTo(4.6f)
                lineToRelative(3.72f, 3.72f)
                curveToRelative(0.26f, 0.27f, 0.29f, 0.68f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 0.07f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.08f, -0.98f)
                lineToRelative(0.08f, -0.08f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-3.72f, 3.72f)
                horizontalLineToRelative(13.66f)
                curveToRelative(1.2f, 0.0f, 2.17f, -0.93f, 2.25f, -2.1f)
                verticalLineTo(4.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _arrowEnterLeft!!
    }

private var _arrowEnterLeft: ImageVector? = null
