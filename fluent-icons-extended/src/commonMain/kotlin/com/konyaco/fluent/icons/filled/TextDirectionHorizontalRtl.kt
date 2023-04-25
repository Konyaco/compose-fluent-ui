

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextDirectionHorizontalRtl: ImageVector
    get() {
        if (_textDirectionHorizontalRtl != null) {
            return _textDirectionHorizontalRtl!!
        }
        _textDirectionHorizontalRtl = fluentIcon(name = "Filled.TextDirectionHorizontalRtl") {
            fluentPath {
                moveTo(16.25f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.92f, 0.62f)
                lineToRelative(-3.75f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.84f, 0.76f)
                lineToRelative(1.0f, -2.38f)
                horizontalLineToRelative(3.66f)
                lineToRelative(1.0f, 2.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.84f, -0.76f)
                lineToRelative(-3.75f, -9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.92f, -0.62f)
                close()
                moveTo(16.25f, 6.6f)
                lineTo(17.25f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(1.0f, -2.4f)
                close()
                moveTo(6.71f, 5.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                lineTo(3.37f, 7.22f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.55f)
                lineToRelative(1.92f, 1.93f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, -1.42f)
                lineTo(6.4f, 9.0f)
                lineTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(6.41f, 7.0f)
                lineToRelative(0.3f, -0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.4f)
                close()
                moveTo(5.29f, 14.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 1.4f)
                lineToRelative(-0.3f, 0.3f)
                lineTo(20.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(6.41f, 18.0f)
                lineToRelative(0.3f, 0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.42f, 1.4f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                lineToRelative(2.0f, -2.0f)
                close()
            }
        }
        return _textDirectionHorizontalRtl!!
    }

private var _textDirectionHorizontalRtl: ImageVector? = null
