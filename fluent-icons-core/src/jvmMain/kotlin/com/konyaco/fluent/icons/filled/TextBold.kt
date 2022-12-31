

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextBold: ImageVector
    get() {
        if (_textBold != null) {
            return _textBold!!
        }
        _textBold = fluentIcon(name = "Filled.TextBold") {
            fluentPath {
                moveTo(6.0f, 5.75f)
                curveTo(6.0f, 4.78f, 6.78f, 4.0f, 7.75f, 4.0f)
                horizontalLineToRelative(4.75f)
                arcToRelative(4.76f, 4.76f, 0.0f, false, true, 3.95f, 7.38f)
                arcTo(4.84f, 4.84f, 0.0f, false, true, 18.0f, 15.0f)
                curveToRelative(0.0f, 3.13f, -2.68f, 5.0f, -5.0f, 5.0f)
                lineTo(7.75f, 20.0f)
                curveTo(6.78f, 20.0f, 6.0f, 19.22f, 6.0f, 18.25f)
                lineTo(6.0f, 5.75f)
                close()
                moveTo(9.5f, 13.5f)
                verticalLineToRelative(3.0f)
                lineTo(13.0f, 16.5f)
                curveToRelative(0.31f, 0.0f, 0.71f, -0.14f, 1.02f, -0.42f)
                curveToRelative(0.3f, -0.26f, 0.48f, -0.62f, 0.48f, -1.08f)
                curveToRelative(0.0f, -0.89f, -0.75f, -1.5f, -1.5f, -1.5f)
                lineTo(9.5f, 13.5f)
                close()
                moveTo(9.5f, 10.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.71f, 0.0f, 1.25f, -0.6f, 1.25f, -1.25f)
                curveToRelative(0.0f, -0.66f, -0.54f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-3.0f)
                lineTo(9.5f, 10.0f)
                close()
            }
        }
        return _textBold!!
    }

private var _textBold: ImageVector? = null
