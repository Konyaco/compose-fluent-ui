

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextPositionTopBottom: ImageVector
    get() {
        if (_textPositionTopBottom != null) {
            return _textPositionTopBottom!!
        }
        _textPositionTopBottom = fluentIcon(name = "Regular.TextPositionTopBottom") {
            fluentPath {
                moveTo(3.0f, 4.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 4.75f)
                close()
                moveTo(3.0f, 18.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(9.5f, 11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(16.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(9.5f, 11.0f)
                close()
            }
        }
        return _textPositionTopBottom!!
    }

private var _textPositionTopBottom: ImageVector? = null
