

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextIndentDecreaseRotate90: ImageVector
    get() {
        if (_textIndentDecreaseRotate90 != null) {
            return _textIndentDecreaseRotate90!!
        }
        _textIndentDecreaseRotate90 = fluentIcon(name = "Filled.TextIndentDecreaseRotate90") {
            fluentPath {
                moveTo(8.0f, 9.0f)
                verticalLineToRelative(8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                lineTo(6.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(12.7f, 2.3f)
                lineTo(14.7f, 4.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.31f, 1.49f)
                lineToRelative(-0.1f, -0.08f)
                lineTo(12.0f, 4.4f)
                lineToRelative(-1.3f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.49f, -1.32f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                lineTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(18.0f, 9.0f)
                verticalLineToRelative(8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                lineTo(16.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(18.0f, 9.0f)
                close()
            }
        }
        return _textIndentDecreaseRotate90!!
    }

private var _textIndentDecreaseRotate90: ImageVector? = null
