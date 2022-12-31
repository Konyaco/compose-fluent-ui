

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextPositionTopBottom: ImageVector
    get() {
        if (_textPositionTopBottom != null) {
            return _textPositionTopBottom!!
        }
        _textPositionTopBottom = fluentIcon(name = "Filled.TextPositionTopBottom") {
            fluentPath {
                moveTo(2.75f, 4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(3.75f, 5.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(2.75f, 18.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(3.75f, 19.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(9.75f, 11.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 4.5f, 0.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(16.25f, 11.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -8.5f, 0.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(9.75f, 11.0f)
                close()
            }
        }
        return _textPositionTopBottom!!
    }

private var _textPositionTopBottom: ImageVector? = null
