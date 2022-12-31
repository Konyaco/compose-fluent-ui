

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextPositionFront: ImageVector
    get() {
        if (_textPositionFront != null) {
            return _textPositionFront!!
        }
        _textPositionFront = fluentIcon(name = "Regular.TextPositionFront") {
            fluentPath {
                moveTo(3.75f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.75f, 4.0f)
                close()
                moveTo(12.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.7f, 10.0f)
                lineTo(8.14f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.74f, 0.0f)
                lineTo(14.3f, 10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 8.5f)
                close()
                moveTo(8.0f, 13.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(8.0f, 13.5f)
                close()
                moveTo(16.0f, 13.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(16.0f, 13.5f)
                close()
                moveTo(20.25f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(16.5f)
                close()
                moveTo(3.0f, 18.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _textPositionFront!!
    }

private var _textPositionFront: ImageVector? = null
