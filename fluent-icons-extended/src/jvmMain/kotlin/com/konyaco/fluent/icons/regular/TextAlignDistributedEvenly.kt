

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextAlignDistributedEvenly: ImageVector
    get() {
        if (_textAlignDistributedEvenly != null) {
            return _textAlignDistributedEvenly!!
        }
        _textAlignDistributedEvenly = fluentIcon(name = "Regular.TextAlignDistributedEvenly") {
            fluentPath {
                moveTo(2.0f, 5.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 6.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 5.75f)
                close()
                moveTo(5.28f, 20.22f)
                lineToRelative(-0.72f, -0.72f)
                horizontalLineToRelative(14.88f)
                lineToRelative(-0.72f, 0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(0.72f, 0.72f)
                lineTo(4.56f, 18.0f)
                lineToRelative(0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
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
            }
        }
        return _textAlignDistributedEvenly!!
    }

private var _textAlignDistributedEvenly: ImageVector? = null
