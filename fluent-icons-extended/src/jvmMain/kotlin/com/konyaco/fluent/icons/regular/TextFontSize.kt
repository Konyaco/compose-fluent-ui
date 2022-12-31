

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextFontSize: ImageVector
    get() {
        if (_textFontSize != null) {
            return _textFontSize!!
        }
        _textFontSize = fluentIcon(name = "Regular.TextFontSize") {
            fluentPath {
                moveTo(10.21f, 17.11f)
                lineTo(15.04f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.37f, -0.11f)
                lineToRelative(0.05f, 0.1f)
                lineTo(21.96f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.38f, 0.6f)
                lineToRelative(-0.04f, -0.1f)
                lineToRelative(-1.6f, -4.5f)
                horizontalLineToRelative(-6.39f)
                lineToRelative(-1.58f, 4.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.35f, 0.45f)
                lineToRelative(-0.1f, 0.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.92f, -0.33f)
                lineToRelative(-0.05f, -0.1f)
                lineToRelative(-1.0f, -2.52f)
                horizontalLineToRelative(-4.1f)
                lineToRelative(-1.0f, 2.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.88f, 0.45f)
                lineToRelative(-0.1f, -0.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.45f, -0.87f)
                lineToRelative(0.03f, -0.1f)
                lineToRelative(3.76f, -9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.34f, -0.1f)
                lineToRelative(0.05f, 0.1f)
                lineToRelative(3.01f, 7.64f)
                lineTo(15.04f, 3.5f)
                lineTo(10.21f, 17.1f)
                close()
                moveTo(6.51f, 11.79f)
                lineTo(5.03f, 15.5f)
                horizontalLineToRelative(2.92f)
                lineTo(6.5f, 11.8f)
                close()
                moveTo(15.74f, 6.0f)
                lineToRelative(-2.67f, 7.51f)
                horizontalLineToRelative(5.33f)
                lineTo(15.75f, 6.0f)
                close()
            }
        }
        return _textFontSize!!
    }

private var _textFontSize: ImageVector? = null
