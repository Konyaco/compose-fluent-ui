

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonAlert: ImageVector
    get() {
        if (_personAlert != null) {
            return _personAlert!!
        }
        _personAlert = fluentIcon(name = "Filled.PersonAlert") {
            fluentPath {
                moveTo(17.75f, 14.0f)
                curveTo(19.0f, 14.0f, 20.0f, 15.0f, 20.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, -0.18f, 1.13f, -0.5f, 1.6f)
                curveTo(17.93f, 20.93f, 15.41f, 22.0f, 12.0f, 22.0f)
                horizontalLineToRelative(-0.48f)
                curveToRelative(0.12f, -0.01f, 0.37f, -0.03f, 0.62f, -0.14f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.72f, -1.99f)
                curveToRelative(-0.1f, -0.24f, -0.3f, -0.41f, -0.38f, -0.5f)
                lineToRelative(-0.37f, -0.32f)
                lineToRelative(-0.61f, -0.51f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, -0.71f, -0.15f, -1.39f, -0.42f, -2.0f)
                horizontalLineToRelative(6.67f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(6.5f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-0.95f, 0.8f)
                curveToRelative(-0.3f, 0.26f, -0.46f, 0.39f, -0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.24f, 0.65f)
                curveToRelative(0.1f, 0.05f, 0.3f, 0.05f, 0.7f, 0.05f)
                horizontalLineToRelative(9.02f)
                curveToRelative(0.4f, 0.0f, 0.6f, 0.0f, 0.7f, -0.05f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.25f, -0.66f)
                curveToRelative(-0.05f, -0.1f, -0.2f, -0.23f, -0.5f, -0.49f)
                lineToRelative(-0.96f, -0.8f)
                verticalLineToRelative(-3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(8.0f, 22.0f)
                curveToRelative(-0.22f, 0.58f, -0.8f, 1.0f, -1.5f, 1.0f)
                curveToRelative(-0.69f, 0.0f, -1.28f, -0.42f, -1.5f, -1.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        return _personAlert!!
    }

private var _personAlert: ImageVector? = null
