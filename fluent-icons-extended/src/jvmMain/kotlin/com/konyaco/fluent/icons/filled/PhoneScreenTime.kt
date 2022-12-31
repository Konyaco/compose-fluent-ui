

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PhoneScreenTime: ImageVector
    get() {
        if (_phoneScreenTime != null) {
            return _phoneScreenTime!!
        }
        _phoneScreenTime = fluentIcon(name = "Filled.PhoneScreenTime") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(14.99f, 2.0f, 16.0f, 3.0f, 16.0f, 4.25f)
                verticalLineToRelative(6.92f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 11.02f, 18.0f)
                lineTo(8.75f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(2.66f)
                curveToRelative(0.3f, 0.95f, 0.83f, 1.8f, 1.5f, 2.5f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 4.25f)
                curveTo(4.0f, 3.01f, 5.0f, 2.0f, 6.25f, 2.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(16.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(17.0f, 18.0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        return _phoneScreenTime!!
    }

private var _phoneScreenTime: ImageVector? = null
