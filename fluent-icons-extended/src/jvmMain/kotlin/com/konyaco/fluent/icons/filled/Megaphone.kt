

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = fluentIcon(name = "Filled.Megaphone") {
            fluentPath {
                moveTo(21.9f, 5.62f)
                curveToRelative(0.07f, 0.21f, 0.1f, 0.43f, 0.1f, 0.64f)
                verticalLineToRelative(11.48f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.9f, 2.16f)
                lineToRelative(-5.5f, -1.64f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 16.7f)
                verticalLineTo(16.0f)
                lineToRelative(-2.4f, -0.71f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 2.0f, 13.13f)
                verticalLineToRelative(-2.26f)
                curveToRelative(0.0f, -1.0f, 0.65f, -1.87f, 1.6f, -2.16f)
                lineToRelative(15.5f, -4.6f)
                curveToRelative(1.2f, -0.36f, 2.45f, 0.32f, 2.8f, 1.51f)
                close()
                moveTo(7.5f, 16.44f)
                verticalLineToRelative(0.06f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.62f, 1.32f)
                lineTo(7.5f, 16.44f)
                close()
            }
        }
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
