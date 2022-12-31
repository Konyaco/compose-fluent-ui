

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextFont: ImageVector
    get() {
        if (_textFont != null) {
            return _textFont!!
        }
        _textFont = fluentIcon(name = "Filled.TextFont") {
            fluentPath {
                moveTo(7.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.94f, 0.66f)
                lineToRelative(2.88f, 7.92f)
                lineToRelative(-1.1f, 2.8f)
                lineTo(9.2f, 12.0f)
                lineTo(4.79f, 12.0f)
                lineToRelative(-0.85f, 2.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.88f, -0.68f)
                lineToRelative(4.0f, -11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 2.0f)
                close()
                moveTo(5.52f, 10.0f)
                horizontalLineToRelative(2.96f)
                lineTo(7.0f, 5.93f)
                lineTo(5.52f, 10.0f)
                close()
                moveTo(15.37f, 6.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.86f, 0.0f)
                lineToRelative(-5.36f, 13.5f)
                lineTo(8.0f, 20.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-0.7f)
                lineToRelative(0.8f, -2.03f)
                horizontalLineToRelative(6.66f)
                lineToRelative(0.8f, 2.02f)
                lineTo(18.0f, 20.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-0.3f)
                lineToRelative(-5.34f, -13.5f)
                close()
                moveTo(16.97f, 16.0f)
                lineTo(11.9f, 16.0f)
                lineToRelative(2.54f, -6.39f)
                lineTo(16.97f, 16.0f)
                close()
            }
        }
        return _textFont!!
    }

private var _textFont: ImageVector? = null
