

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextAlignDistributed: ImageVector
    get() {
        if (_textAlignDistributed != null) {
            return _textAlignDistributed!!
        }
        _textAlignDistributed = fluentIcon(name = "Regular.TextAlignDistributed") {
            fluentPath {
                moveTo(5.28f, 7.22f)
                lineToRelative(-0.72f, -0.72f)
                horizontalLineToRelative(16.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(4.56f, 5.0f)
                lineToRelative(0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                close()
                moveTo(2.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(2.75f, 11.5f)
                close()
                moveTo(2.75f, 19.5f)
                horizontalLineToRelative(16.69f)
                lineToRelative(-0.72f, 0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(0.72f, 0.72f)
                lineTo(2.75f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
            }
        }
        return _textAlignDistributed!!
    }

private var _textAlignDistributed: ImageVector? = null
