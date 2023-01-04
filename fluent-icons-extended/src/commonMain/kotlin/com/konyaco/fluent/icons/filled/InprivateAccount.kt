

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.InprivateAccount: ImageVector
    get() {
        if (_inprivateAccount != null) {
            return _inprivateAccount!!
        }
        _inprivateAccount = fluentIcon(name = "Filled.InprivateAccount") {
            fluentPath {
                moveTo(17.75f, 14.0f)
                curveToRelative(1.21f, 0.0f, 2.2f, 0.95f, 2.25f, 2.15f)
                verticalLineToRelative(0.1f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.98f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -0.51f, 1.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.64f)
                curveTo(17.08f, 21.25f, 14.85f, 22.0f, 12.0f, 22.0f)
                curveToRelative(-3.15f, 0.0f, -5.53f, -0.9f, -7.1f, -2.74f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -0.9f, -2.43f)
                verticalLineToRelative(-0.58f)
                curveTo(4.0f, 15.0f, 5.01f, 14.0f, 6.25f, 14.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.58f)
                curveToRelative(0.2f, 0.47f, 0.34f, 0.97f, 0.4f, 1.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.98f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, -0.4f, 1.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -4.0f, -8.0f)
                close()
            }
        }
        return _inprivateAccount!!
    }

private var _inprivateAccount: ImageVector? = null
