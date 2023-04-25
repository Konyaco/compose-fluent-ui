

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextDirectionHorizontalRight: ImageVector
    get() {
        if (_textDirectionHorizontalRight != null) {
            return _textDirectionHorizontalRight!!
        }
        _textDirectionHorizontalRight = fluentIcon(name = "Filled.TextDirectionHorizontalRight") {
            fluentPath {
                moveTo(7.75f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.92f, 0.62f)
                lineToRelative(3.75f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.84f, 0.76f)
                lineToRelative(-1.0f, -2.38f)
                lineTo(5.92f, 11.0f)
                lineToRelative(-1.0f, 2.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.84f, -0.76f)
                lineToRelative(3.75f, -9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.75f, 3.0f)
                close()
                moveTo(7.75f, 6.6f)
                lineTo(6.75f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-1.0f, -2.4f)
                close()
                moveTo(17.29f, 5.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 0.0f)
                lineToRelative(1.92f, 1.93f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.55f)
                lineToRelative(-1.92f, 1.93f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.42f)
                lineToRelative(0.3f, -0.29f)
                lineTo(13.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.59f)
                lineToRelative(-0.3f, -0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                close()
                moveTo(18.71f, 14.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.4f)
                lineToRelative(0.3f, 0.3f)
                lineTo(4.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(13.59f)
                lineToRelative(-0.3f, 0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 1.4f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.4f)
                lineToRelative(-2.0f, -2.0f)
                close()
            }
        }
        return _textDirectionHorizontalRight!!
    }

private var _textDirectionHorizontalRight: ImageVector? = null
