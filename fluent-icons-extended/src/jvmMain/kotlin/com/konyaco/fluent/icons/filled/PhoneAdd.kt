

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PhoneAdd: ImageVector
    get() {
        if (_phoneAdd != null) {
            return _phoneAdd!!
        }
        _phoneAdd = fluentIcon(name = "Filled.PhoneAdd") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(14.99f, 2.0f, 16.0f, 3.0f, 16.0f, 4.25f)
                verticalLineToRelative(6.92f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -5.0f, 6.33f)
                lineTo(8.75f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.42f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, 1.64f, 3.0f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 4.25f)
                curveTo(4.0f, 3.01f, 5.0f, 2.0f, 6.25f, 2.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(17.5f, 14.0f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.4f)
                lineToRelative(-0.01f, 0.1f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(-2.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.41f)
                verticalLineToRelative(0.18f)
                curveToRelative(0.04f, 0.2f, 0.2f, 0.36f, 0.4f, 0.4f)
                lineToRelative(0.1f, 0.01f)
                lineTo(17.0f, 18.0f)
                verticalLineToRelative(2.6f)
                curveToRelative(0.05f, 0.2f, 0.2f, 0.36f, 0.41f, 0.4f)
                horizontalLineToRelative(0.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.4f)
                lineToRelative(0.01f, -0.1f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(2.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.41f)
                verticalLineToRelative(-0.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, -0.4f)
                lineToRelative(-0.1f, -0.01f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-2.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.41f, -0.4f)
                horizontalLineToRelative(-0.09f)
                close()
            }
        }
        return _phoneAdd!!
    }

private var _phoneAdd: ImageVector? = null
