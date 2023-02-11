

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PersonChat: ImageVector
    get() {
        if (_personChat != null) {
            return _personChat!!
        }
        _personChat = fluentIcon(name = "Regular.PersonChat") {
            fluentPath {
                moveTo(11.31f, 15.5f)
                curveToRelative(0.17f, -0.54f, 0.41f, -1.04f, 0.7f, -1.5f)
                lineTo(6.26f, 14.0f)
                curveTo(5.0f, 14.0f, 4.0f, 15.0f, 4.0f, 16.25f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.89f, 0.32f, 1.75f, 0.9f, 2.43f)
                curveToRelative(1.41f, 1.65f, 3.49f, 2.55f, 6.19f, 2.71f)
                lineToRelative(0.45f, -1.48f)
                curveToRelative(-2.5f, -0.08f, -4.32f, -0.82f, -5.5f, -2.2f)
                curveToRelative(-0.35f, -0.41f, -0.54f, -0.93f, -0.54f, -1.46f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0.0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.06f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
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
