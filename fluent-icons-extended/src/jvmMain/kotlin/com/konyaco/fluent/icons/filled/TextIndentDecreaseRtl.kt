

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextIndentDecreaseRtl: ImageVector
    get() {
        if (_textIndentDecreaseRtl != null) {
            return _textIndentDecreaseRtl!!
        }
        _textIndentDecreaseRtl = fluentIcon(name = "Filled.TextIndentDecreaseRtl") {
            fluentPath {
                moveTo(5.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.62f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 6.0f)
                lineTo(6.38f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.88f, 1.0f)
                close()
                moveTo(3.5f, 13.0f)
                horizontalLineToRelative(11.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.12f, -2.0f)
                lineTo(3.38f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.12f, 2.0f)
                close()
                moveTo(5.5f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.12f, -2.0f)
                lineTo(6.38f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.88f, 1.0f)
                close()
                moveTo(19.61f, 14.79f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, -1.5f)
                lineTo(19.6f, 12.0f)
                lineToRelative(-1.3f, -1.3f)
                lineToRelative(-0.08f, -0.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.5f, -1.32f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.08f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.08f, 1.32f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-0.1f, 0.08f)
                close()
            }
        }
        return _textIndentDecreaseRtl!!
    }

private var _textIndentDecreaseRtl: ImageVector? = null
