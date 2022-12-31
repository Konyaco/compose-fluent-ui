

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextFontInfo: ImageVector
    get() {
        if (_textFontInfo != null) {
            return _textFontInfo!!
        }
        _textFontInfo = fluentIcon(name = "Regular.TextFontInfo") {
            fluentPath {
                moveTo(9.51f, 2.0f)
                curveToRelative(0.31f, 0.0f, 0.6f, 0.2f, 0.7f, 0.5f)
                lineToRelative(3.18f, 8.97f)
                curveToRelative(-0.44f, 0.35f, -0.83f, 0.76f, -1.16f, 1.22f)
                lineTo(9.47f, 4.91f)
                lineTo(6.34f, 13.0f)
                horizontalLineToRelative(5.68f)
                curveToRelative(-0.3f, 0.46f, -0.53f, 0.97f, -0.7f, 1.5f)
                lineTo(5.75f, 14.5f)
                lineTo(4.2f, 18.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.4f, -0.54f)
                lineToRelative(6.0f, -15.5f)
                curveToRelative(0.11f, -0.3f, 0.4f, -0.48f, 0.71f, -0.48f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                close()
                moveTo(18.25f, 13.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(23.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(22.0f, 16.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 9.0f, 0.0f)
                close()
            }
        }
        return _textFontInfo!!
    }

private var _textFontInfo: ImageVector? = null
