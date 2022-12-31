

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PhoneKey: ImageVector
    get() {
        if (_phoneKey != null) {
            return _phoneKey!!
        }
        _phoneKey = fluentIcon(name = "Regular.PhoneKey") {
            fluentPath {
                moveTo(15.75f, 2.0f)
                curveTo(16.99f, 2.0f, 18.0f, 3.0f, 18.0f, 4.25f)
                verticalLineToRelative(7.0f)
                curveToRelative(-0.56f, 0.2f, -1.07f, 0.5f, -1.5f, 0.9f)
                verticalLineToRelative(-7.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2.78f)
                curveToRelative(-0.02f, 0.1f, -0.03f, 0.2f, -0.03f, 0.31f)
                lineTo(11.0f, 22.0f)
                lineTo(8.25f, 22.0f)
                curveTo(7.01f, 22.0f, 6.0f, 21.0f, 6.0f, 19.75f)
                lineTo(6.0f, 4.25f)
                curveTo(6.0f, 3.01f, 7.0f, 2.0f, 8.25f, 2.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(13.25f, 17.5f)
                curveToRelative(0.1f, 0.0f, 0.2f, 0.02f, 0.28f, 0.05f)
                lineTo(12.08f, 19.0f)
                horizontalLineToRelative(-1.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(19.5f, 19.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.38f, -2.59f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.15f, 0.12f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.22f, 0.53f)
                verticalLineToRelative(1.44f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(21.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        return _phoneKey!!
    }

private var _phoneKey: ImageVector? = null
