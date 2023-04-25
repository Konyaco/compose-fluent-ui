

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PhoneChat: ImageVector
    get() {
        if (_phoneChat != null) {
            return _phoneChat!!
        }
        _phoneChat = fluentIcon(name = "Regular.PhoneChat") {
            fluentPath {
                moveTo(18.0f, 4.25f)
                curveTo(18.0f, 3.01f, 17.0f, 2.0f, 15.75f, 2.0f)
                horizontalLineToRelative(-7.5f)
                curveTo(7.01f, 2.0f, 6.0f, 3.0f, 6.0f, 4.25f)
                verticalLineToRelative(15.5f)
                curveTo(6.0f, 20.99f, 7.0f, 22.0f, 8.25f, 22.0f)
                horizontalLineToRelative(2.84f)
                lineToRelative(0.45f, -1.5f)
                lineTo(8.25f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(7.5f, 4.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.83f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, 1.5f, -0.06f)
                lineTo(18.0f, 4.25f)
                close()
                moveTo(21.0f, 13.25f)
                arcTo(5.48f, 5.48f, 0.0f, false, false, 17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -4.81f, 8.17f)
                lineToRelative(-0.67f, 2.19f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.63f, 0.62f)
                lineToRelative(2.18f, -0.67f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 21.0f, 13.25f)
                close()
                moveTo(15.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(17.5f, 19.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                close()
            }
        }
        return _phoneChat!!
    }

private var _phoneChat: ImageVector? = null
