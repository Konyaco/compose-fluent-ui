

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PhoneKey: ImageVector
    get() {
        if (_phoneKey != null) {
            return _phoneKey!!
        }
        _phoneKey = fluentIcon(name = "Filled.PhoneKey") {
            fluentPath {
                moveTo(15.75f, 2.0f)
                curveTo(16.99f, 2.0f, 18.0f, 3.0f, 18.0f, 4.25f)
                verticalLineToRelative(7.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -2.97f, 4.8f)
                lineTo(13.1f, 18.0f)
                horizontalLineToRelative(-2.34f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.84f)
                lineToRelative(-0.08f, 0.07f)
                curveToRelative(-0.33f, 0.33f, -0.51f, 0.78f, -0.51f, 1.24f)
                lineTo(11.01f, 22.0f)
                lineTo(8.25f, 22.0f)
                curveTo(7.01f, 22.0f, 6.0f, 21.0f, 6.0f, 19.75f)
                lineTo(6.0f, 4.25f)
                curveTo(6.0f, 3.01f, 7.0f, 2.0f, 8.25f, 2.0f)
                horizontalLineToRelative(7.5f)
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
