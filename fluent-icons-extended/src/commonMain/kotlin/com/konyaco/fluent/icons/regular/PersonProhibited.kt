

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonProhibited: ImageVector
    get() {
        if (_personProhibited != null) {
            return _personProhibited!!
        }
        _personProhibited = fluentIcon(name = "Regular.PersonProhibited") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(12.02f, 14.0f)
                curveToRelative(-0.3f, 0.46f, -0.53f, 0.97f, -0.7f, 1.5f)
                lineTo(4.24f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.9f)
                curveToRelative(0.0f, 0.66f, 0.29f, 1.29f, 0.79f, 1.71f)
                curveTo(5.55f, 19.95f, 7.44f, 20.5f, 10.0f, 20.5f)
                curveToRelative(0.6f, 0.0f, 1.16f, -0.03f, 1.69f, -0.09f)
                curveToRelative(0.25f, 0.5f, 0.56f, 0.96f, 0.93f, 1.38f)
                curveToRelative(-0.8f, 0.14f, -1.68f, 0.21f, -2.62f, 0.21f)
                curveToRelative(-2.89f, 0.0f, -5.13f, -0.66f, -6.7f, -2.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 2.0f, 17.16f)
                verticalLineToRelative(-0.91f)
                curveTo(2.0f, 15.01f, 3.01f, 14.0f, 4.25f, 14.0f)
                horizontalLineToRelative(7.77f)
                close()
                moveTo(20.81f, 15.25f)
                lineToRelative(-5.56f, 5.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.56f, -5.56f)
                close()
                moveTo(17.5f, 13.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.3f, 6.25f)
                lineToRelative(5.55f, -5.56f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -2.25f, -0.69f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(10.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
            }
        }
        return _personProhibited!!
    }

private var _personProhibited: ImageVector? = null
