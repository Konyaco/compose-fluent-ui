

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextPositionFront: ImageVector
    get() {
        if (_textPositionFront != null) {
            return _textPositionFront!!
        }
        _textPositionFront = fluentIcon(name = "Filled.TextPositionFront") {
            fluentPath {
                moveTo(3.75f, 3.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(3.75f, 3.75f)
                close()
                moveTo(12.0f, 8.75f)
                curveToRelative(-0.78f, 0.0f, -1.47f, 0.4f, -1.87f, 1.0f)
                horizontalLineToRelative(-2.2f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 8.13f, 0.0f)
                horizontalLineToRelative(-2.19f)
                curveToRelative(-0.4f, -0.6f, -1.09f, -1.0f, -1.87f, -1.0f)
                close()
                moveTo(3.75f, 10.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(3.75f, 10.75f)
                close()
                moveTo(7.75f, 13.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.25f, 13.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.75f, 18.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(3.75f, 19.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        return _textPositionFront!!
    }

private var _textPositionFront: ImageVector? = null
