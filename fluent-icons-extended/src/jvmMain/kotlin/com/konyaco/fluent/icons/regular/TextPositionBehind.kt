

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextPositionBehind: ImageVector
    get() {
        if (_textPositionBehind != null) {
            return _textPositionBehind!!
        }
        _textPositionBehind = fluentIcon(name = "Regular.TextPositionBehind") {
            fluentPath {
                moveTo(3.0f, 4.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 4.75f)
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
                moveTo(20.25f, 12.5f)
                lineTo(17.0f, 12.5f)
                lineTo(17.0f, 11.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(3.75f, 12.5f)
                lineTo(7.0f, 12.5f)
                lineTo(7.0f, 11.0f)
                lineTo(3.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(3.75f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.75f, 18.0f)
                close()
                moveTo(10.5f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 11.0f)
                close()
            }
        }
        return _textPositionBehind!!
    }

private var _textPositionBehind: ImageVector? = null
