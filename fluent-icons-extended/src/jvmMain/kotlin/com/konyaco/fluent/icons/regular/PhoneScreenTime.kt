

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PhoneScreenTime: ImageVector
    get() {
        if (_phoneScreenTime != null) {
            return _phoneScreenTime!!
        }
        _phoneScreenTime = fluentIcon(name = "Regular.PhoneScreenTime") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(14.99f, 2.0f, 16.0f, 3.0f, 16.0f, 4.25f)
                verticalLineToRelative(6.92f)
                curveToRelative(-0.53f, 0.13f, -1.03f, 0.32f, -1.5f, 0.56f)
                lineTo(14.5f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(5.48f)
                curveToRelative(0.29f, 0.55f, 0.65f, 1.06f, 1.08f, 1.5f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 4.25f)
                curveTo(4.0f, 3.01f, 5.0f, 2.0f, 6.25f, 2.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(8.75f, 17.5f)
                lineTo(11.0f, 17.5f)
                curveToRelative(0.0f, 0.52f, 0.06f, 1.02f, 0.17f, 1.5f)
                lineTo(8.75f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
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
