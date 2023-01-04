

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextIndentDecreaseLtr: ImageVector
    get() {
        if (_textIndentDecreaseLtr != null) {
            return _textIndentDecreaseLtr!!
        }
        _textIndentDecreaseLtr = fluentIcon(name = "Filled.TextIndentDecreaseLtr") {
            fluentPath {
                moveTo(9.0f, 16.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(9.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineToRelative(8.62f)
                lineTo(9.0f, 16.0f)
                close()
                moveTo(2.3f, 11.3f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.49f, 1.31f)
                lineToRelative(-0.08f, 0.1f)
                lineTo(4.4f, 12.0f)
                lineToRelative(1.3f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.49f)
                lineToRelative(-0.1f, -0.08f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, -1.32f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(-2.0f, 2.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(9.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(20.5f, 11.0f)
                lineTo(9.0f, 11.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(9.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineToRelative(8.62f)
                lineTo(9.0f, 6.0f)
                close()
            }
        }
        return _textIndentDecreaseLtr!!
    }

private var _textIndentDecreaseLtr: ImageVector? = null
