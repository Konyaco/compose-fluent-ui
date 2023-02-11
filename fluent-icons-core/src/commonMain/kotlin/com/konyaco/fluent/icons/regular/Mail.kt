

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = fluentIcon(name = "Regular.Mail") {
            fluentPath {
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.24f, 3.07f)
                lineToRelative(0.01f, 0.18f)
                verticalLineToRelative(9.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                horizontalLineTo(5.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineTo(5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
                horizontalLineToRelative(-13.5f)
                close()
                moveTo(20.5f, 9.37f)
                lineToRelative(-8.15f, 4.3f)
                curveToRelative(-0.19f, 0.1f, -0.4f, 0.1f, -0.6f, 0.04f)
                lineToRelative(-0.1f, -0.05f)
                lineTo(3.5f, 9.37f)
                verticalLineToRelative(7.38f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.92f, 0.0f, 1.67f, -0.7f, 1.74f, -1.6f)
                lineToRelative(0.01f, -0.15f)
                verticalLineTo(9.37f)
                close()
                moveTo(18.75f, 5.5f)
                horizontalLineTo(5.25f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                lineToRelative(-0.01f, 0.15f)
                verticalLineToRelative(0.43f)
                lineToRelative(8.5f, 4.47f)
                lineToRelative(8.5f, -4.47f)
                verticalLineToRelative(-0.43f)
                curveToRelative(0.0f, -0.92f, -0.7f, -1.67f, -1.6f, -1.74f)
                lineToRelative(-0.15f, -0.01f)
                close()
            }
        }
        return _mail!!
    }

private var _mail: ImageVector? = null
