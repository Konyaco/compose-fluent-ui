

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentMultiple: ImageVector
    get() {
        if (_commentMultiple != null) {
            return _commentMultiple!!
        }
        _commentMultiple = fluentIcon(name = "Filled.CommentMultiple") {
            fluentPath {
                moveTo(8.25f, 2.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.24f, 3.0f)
                horizontalLineToRelative(9.74f)
                curveTo(17.1f, 5.0f, 19.0f, 6.9f, 19.0f, 9.25f)
                verticalLineToRelative(6.74f)
                curveToRelative(1.67f, -0.12f, 3.0f, -1.53f, 3.0f, -3.24f)
                verticalLineToRelative(-6.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 17.25f, 2.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(17.99f, 16.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, 3.0f)
                horizontalLineToRelative(-4.08f)
                lineTo(7.0f, 21.75f)
                curveToRelative(-0.82f, 0.62f, -2.0f, 0.03f, -2.0f, -1.0f)
                verticalLineToRelative(-1.76f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.0f, -3.24f)
                verticalLineToRelative(-6.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 5.25f, 6.0f)
                horizontalLineToRelative(9.5f)
                curveTo(16.55f, 6.0f, 18.0f, 7.46f, 18.0f, 9.25f)
                lineTo(18.0f, 16.0f)
                close()
            }
        }
        return _commentMultiple!!
    }

private var _commentMultiple: ImageVector? = null
