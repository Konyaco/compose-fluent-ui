

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextBold: ImageVector
    get() {
        if (_textBold != null) {
            return _textBold!!
        }
        _textBold = fluentIcon(name = "Regular.TextBold") {
            fluentPath {
                moveTo(6.94f, 4.44f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 4.0f)
                horizontalLineToRelative(4.38f)
                arcToRelative(4.64f, 4.64f, 0.0f, false, true, 3.75f, 7.3f)
                arcTo(4.7f, 4.7f, 0.0f, false, true, 18.0f, 15.13f)
                curveToRelative(0.0f, 3.11f, -2.7f, 4.88f, -4.88f, 4.88f)
                lineTo(8.0f, 20.01f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -0.4f, 0.15f, -0.78f, 0.44f, -1.06f)
                close()
                moveTo(9.5f, 10.25f)
                horizontalLineToRelative(2.88f)
                curveToRelative(0.9f, 0.0f, 1.62f, -0.76f, 1.62f, -1.62f)
                curveTo(14.0f, 7.76f, 13.28f, 7.0f, 12.38f, 7.0f)
                lineTo(9.5f, 7.0f)
                verticalLineToRelative(3.25f)
                close()
                moveTo(9.5f, 13.25f)
                lineTo(9.5f, 17.0f)
                horizontalLineToRelative(3.62f)
                curveToRelative(0.87f, 0.0f, 1.88f, -0.75f, 1.88f, -1.88f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.88f, -1.87f)
                lineTo(9.5f, 13.25f)
                close()
            }
        }
        return _textBold!!
    }

private var _textBold: ImageVector? = null
