

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonChat: ImageVector
    get() {
        if (_personChat != null) {
            return _personChat!!
        }
        _personChat = fluentIcon(name = "Filled.PersonChat") {
            fluentPath {
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, -1.29f, 0.37f, -2.5f, 1.02f, -3.5f)
                lineTo(6.25f, 14.0f)
                curveTo(5.0f, 14.0f, 4.0f, 15.0f, 4.0f, 16.25f)
                verticalLineToRelative(0.92f)
                curveToRelative(0.0f, 0.57f, 0.18f, 1.13f, 0.51f, 1.6f)
                curveToRelative(1.4f, 1.96f, 3.62f, 3.03f, 6.58f, 3.2f)
                lineToRelative(0.52f, -1.7f)
                arcTo(6.48f, 6.48f, 0.0f, false, true, 11.0f, 17.5f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -8.17f, 4.81f)
                lineToRelative(-2.19f, 0.67f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.62f, -0.63f)
                lineToRelative(0.67f, -2.18f)
                arcTo(5.5f, 5.5f, 0.0f, true, true, 23.0f, 17.5f)
                close()
                moveTo(15.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(15.0f, 18.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
            }
        }
        return _personChat!!
    }

private var _personChat: ImageVector? = null
