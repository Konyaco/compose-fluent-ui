

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PhonePageHeader: ImageVector
    get() {
        if (_phonePageHeader != null) {
            return _phonePageHeader!!
        }
        _phonePageHeader = fluentIcon(name = "Filled.PhonePageHeader") {
            fluentPath {
                moveTo(18.0f, 6.0f)
                verticalLineToRelative(13.75f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-7.5f)
                curveTo(7.01f, 22.0f, 6.0f, 21.0f, 6.0f, 19.75f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(15.75f, 2.0f)
                curveTo(16.99f, 2.0f, 18.0f, 3.0f, 18.0f, 4.25f)
                lineTo(18.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(-0.75f)
                curveTo(6.0f, 3.01f, 7.0f, 2.0f, 8.25f, 2.0f)
                horizontalLineToRelative(7.5f)
                close()
            }
        }
        return _phonePageHeader!!
    }

private var _phonePageHeader: ImageVector? = null
