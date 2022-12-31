

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BoardHeart: ImageVector
    get() {
        if (_boardHeart != null) {
            return _boardHeart!!
        }
        _boardHeart = fluentIcon(name = "Regular.BoardHeart") {
            fluentPath {
                moveTo(21.5f, 5.56f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.25f, -3.06f)
                horizontalLineToRelative(-12.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(12.19f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 6.26f, 21.0f)
                horizontalLineToRelative(7.12f)
                lineToRelative(-1.46f, -1.5f)
                lineTo(6.25f, 19.5f)
                curveToRelative(-0.91f, 0.0f, -1.66f, -0.7f, -1.74f, -1.59f)
                lineToRelative(-0.01f, -0.16f)
                lineTo(4.5f, 9.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.67f)
                curveToRelative(0.45f, -0.41f, 0.96f, -0.71f, 1.5f, -0.9f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.91f, 0.0f, 1.66f, 0.7f, 1.74f, 1.59f)
                lineToRelative(0.01f, 0.16f)
                verticalLineToRelative(5.28f)
                curveToRelative(0.52f, 0.06f, 1.03f, 0.2f, 1.5f, 0.45f)
                lineTo(21.5f, 5.56f)
                close()
                moveTo(6.25f, 4.0f)
                horizontalLineToRelative(5.25f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(4.5f, 5.75f)
                curveToRelative(0.0f, -0.92f, 0.7f, -1.67f, 1.6f, -1.75f)
                horizontalLineToRelative(0.15f)
                close()
                moveTo(21.98f, 13.06f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 0.0f, 5.11f)
                lineToRelative(-4.45f, 4.6f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-4.45f, -4.6f)
                arcToRelative(3.73f, 3.73f, 0.0f, false, true, 0.0f, -5.11f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 4.94f, 0.0f)
                lineToRelative(0.04f, 0.04f)
                lineToRelative(0.04f, -0.04f)
                arcToRelative(3.42f, 3.42f, 0.0f, false, true, 4.94f, 0.0f)
                close()
            }
        }
        return _boardHeart!!
    }

private var _boardHeart: ImageVector? = null
