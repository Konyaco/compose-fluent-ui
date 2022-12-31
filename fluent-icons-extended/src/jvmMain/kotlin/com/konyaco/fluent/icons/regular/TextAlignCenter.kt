

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextAlignCenter: ImageVector
    get() {
        if (_textAlignCenter != null) {
            return _textAlignCenter!!
        }
        _textAlignCenter = fluentIcon(name = "Regular.TextAlignCenter") {
            fluentPath {
                moveTo(4.0f, 5.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(4.75f, 6.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 5.75f)
                close()
                moveTo(6.0f, 18.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(6.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(2.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(2.75f, 11.5f)
                close()
            }
        }
        return _textAlignCenter!!
    }

private var _textAlignCenter: ImageVector? = null
