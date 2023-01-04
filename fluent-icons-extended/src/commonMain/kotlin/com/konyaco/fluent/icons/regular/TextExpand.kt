

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextExpand: ImageVector
    get() {
        if (_textExpand != null) {
            return _textExpand!!
        }
        _textExpand = fluentIcon(name = "Regular.TextExpand") {
            fluentPath {
                moveTo(6.75f, 19.5f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                lineTo(6.75f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(6.75f, 4.5f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                lineTo(6.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(13.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(13.0f, 13.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(11.0f, 11.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 9.0f, 0.0f)
                close()
                moveTo(7.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(6.0f, 11.0f)
                lineTo(4.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(6.0f, 12.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(7.0f, 12.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 9.5f)
                close()
            }
        }
        return _textExpand!!
    }

private var _textExpand: ImageVector? = null
