

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CommentMultiple: ImageVector
    get() {
        if (_commentMultiple != null) {
            return _commentMultiple!!
        }
        _commentMultiple = fluentIcon(name = "Regular.CommentMultiple") {
            fluentPath {
                moveTo(5.0f, 5.0f)
                curveToRelative(0.13f, -1.67f, 1.54f, -3.0f, 3.25f, -3.0f)
                horizontalLineToRelative(9.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.0f, 3.24f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 15.74f, 19.0f)
                horizontalLineToRelative(-5.08f)
                lineTo(7.0f, 21.75f)
                curveToRelative(-0.82f, 0.62f, -2.0f, 0.03f, -2.0f, -1.0f)
                verticalLineToRelative(-1.76f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.0f, -3.24f)
                verticalLineToRelative(-7.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.0f, -3.24f)
                close()
                moveTo(6.52f, 5.0f)
                horizontalLineToRelative(9.23f)
                curveTo(17.55f, 5.0f, 19.0f, 6.46f, 19.0f, 8.25f)
                verticalLineToRelative(6.23f)
                curveToRelative(0.85f, -0.12f, 1.5f, -0.85f, 1.5f, -1.73f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-0.88f, 0.0f, -1.61f, 0.65f, -1.73f, 1.5f)
                close()
                moveTo(5.25f, 17.5f)
                lineTo(6.5f, 17.5f)
                verticalLineToRelative(2.75f)
                lineToRelative(3.67f, -2.75f)
                horizontalLineToRelative(5.58f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(5.25f, 6.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                close()
            }
        }
        return _commentMultiple!!
    }

private var _commentMultiple: ImageVector? = null
