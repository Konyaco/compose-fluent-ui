

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextFirstLine: ImageVector
    get() {
        if (_textFirstLine != null) {
            return _textFirstLine!!
        }
        _textFirstLine = fluentIcon(name = "Regular.TextFirstLine") {
            fluentPath {
                moveTo(20.22f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-1.47f, 1.47f)
                lineToRelative(1.47f, 1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(14.25f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(21.25f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(18.5f)
                close()
                moveTo(22.0f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(2.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                close()
            }
        }
        return _textFirstLine!!
    }

private var _textFirstLine: ImageVector? = null
