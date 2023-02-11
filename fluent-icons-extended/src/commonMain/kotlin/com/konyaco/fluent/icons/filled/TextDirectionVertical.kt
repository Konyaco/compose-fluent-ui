

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextDirectionVertical: ImageVector
    get() {
        if (_textDirectionVertical != null) {
            return _textDirectionVertical!!
        }
        _textDirectionVertical = fluentIcon(name = "Filled.TextDirectionVertical") {
            fluentPath {
                moveTo(8.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(13.59f)
                lineToRelative(-0.3f, -0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.42f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.42f)
                lineToRelative(-0.3f, 0.3f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(17.17f, 3.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.84f, 0.0f)
                lineToRelative(-3.75f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.84f, 0.76f)
                lineToRelative(1.0f, -2.38f)
                horizontalLineToRelative(3.66f)
                lineToRelative(1.0f, 2.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.84f, -0.76f)
                lineToRelative(-3.75f, -9.0f)
                close()
                moveTo(17.25f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(1.0f, -2.4f)
                lineToRelative(1.0f, 2.4f)
                close()
                moveTo(16.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.59f)
                lineToRelative(-0.3f, -0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.42f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.42f)
                lineToRelative(-0.3f, 0.3f)
                lineTo(17.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        return _textDirectionVertical!!
    }

private var _textDirectionVertical: ImageVector? = null
