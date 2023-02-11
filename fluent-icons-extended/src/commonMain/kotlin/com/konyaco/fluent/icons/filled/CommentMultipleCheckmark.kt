

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentMultipleCheckmark: ImageVector
    get() {
        if (_commentMultipleCheckmark != null) {
            return _commentMultipleCheckmark!!
        }
        _commentMultipleCheckmark = fluentIcon(name = "Filled.CommentMultipleCheckmark") {
            fluentPath {
                moveTo(8.25f, 2.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.24f, 3.0f)
                horizontalLineToRelative(9.74f)
                curveTo(17.1f, 5.0f, 19.0f, 6.9f, 19.0f, 9.25f)
                verticalLineToRelative(1.92f)
                curveToRelative(1.15f, 0.27f, 2.18f, 0.85f, 3.0f, 1.64f)
                lineTo(22.0f, 6.75f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 17.25f, 2.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(18.0f, 9.25f)
                verticalLineToRelative(1.77f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 11.17f, 19.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(7.0f, 21.75f)
                curveToRelative(-0.82f, 0.62f, -2.0f, 0.03f, -2.0f, -1.0f)
                verticalLineToRelative(-1.76f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.0f, -3.24f)
                verticalLineToRelative(-6.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 5.25f, 6.0f)
                horizontalLineToRelative(9.5f)
                curveTo(16.55f, 6.0f, 18.0f, 7.46f, 18.0f, 9.25f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(20.85f, 15.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.5f, 0.0f, 0.7f)
                lineToRelative(-4.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.7f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, -0.7f)
                lineToRelative(1.65f, 1.64f)
                lineToRelative(3.65f, -3.64f)
                curveToRelative(0.2f, -0.2f, 0.5f, -0.2f, 0.7f, 0.0f)
                close()
            }
        }
        return _commentMultipleCheckmark!!
    }

private var _commentMultipleCheckmark: ImageVector? = null
