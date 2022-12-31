

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = fluentIcon(name = "Filled.Mail") {
            fluentPath {
                moveTo(22.0f, 8.6f)
                verticalLineToRelative(8.15f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                horizontalLineTo(5.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(8.61f)
                lineToRelative(9.65f, 5.05f)
                curveToRelative(0.22f, 0.12f, 0.48f, 0.12f, 0.7f, 0.0f)
                lineTo(22.0f, 8.61f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.23f, 2.92f)
                lineTo(12.0f, 12.15f)
                lineTo(2.02f, 6.92f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.04f, -2.91f)
                lineTo(5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
                horizontalLineToRelative(-13.5f)
                close()
            }
        }
        return _mail!!
    }

private var _mail: ImageVector? = null
