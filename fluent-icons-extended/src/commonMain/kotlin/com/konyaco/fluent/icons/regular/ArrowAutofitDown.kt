

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowAutofitDown: ImageVector
    get() {
        if (_arrowAutofitDown != null) {
            return _arrowAutofitDown!!
        }
        _arrowAutofitDown = fluentIcon(name = "Regular.ArrowAutofitDown") {
            fluentPath {
                moveTo(13.22f, 17.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.07f, 0.98f)
                lineToRelative(0.07f, 0.08f)
                lineToRelative(2.37f, 2.37f)
                curveToRelative(0.12f, 0.2f, 0.37f, 0.35f, 0.66f, 0.35f)
                curveToRelative(0.25f, 0.0f, 0.48f, -0.1f, 0.61f, -0.28f)
                lineToRelative(0.05f, -0.07f)
                lineToRelative(2.37f, -2.37f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.2f, -0.27f, 0.2f, -0.62f, 0.01f, -0.89f)
                lineToRelative(-0.08f, -0.1f)
                lineToRelative(-0.08f, -0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.88f, -0.01f)
                lineToRelative(-0.1f, 0.08f)
                lineTo(17.0f, 18.44f)
                verticalLineTo(3.56f)
                curveToRelative(-0.06f, -0.31f, -0.37f, -0.56f, -0.75f, -0.56f)
                reflectiveCurveToRelative(-0.7f, 0.25f, -0.74f, 0.57f)
                lineToRelative(-0.01f, 0.09f)
                verticalLineToRelative(14.78f)
                lineToRelative(-1.22f, -1.22f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                close()
                moveTo(6.25f, 20.0f)
                curveTo(5.01f, 20.0f, 4.0f, 19.0f, 4.0f, 17.76f)
                verticalLineTo(6.26f)
                curveTo(4.0f, 5.02f, 5.0f, 4.0f, 6.25f, 4.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        return _arrowAutofitDown!!
    }

private var _arrowAutofitDown: ImageVector? = null
