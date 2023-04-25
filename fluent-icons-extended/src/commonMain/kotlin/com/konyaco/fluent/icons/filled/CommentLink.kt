

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentLink: ImageVector
    get() {
        if (_commentLink != null) {
            return _commentLink!!
        }
        _commentLink = fluentIcon(name = "Filled.CommentLink") {
            fluentPath {
                moveTo(23.0f, 5.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 19.25f, 2.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -0.15f, 4.5f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                lineTo(19.25f, 9.5f)
                horizontalLineToRelative(0.2f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 23.0f, 5.74f)
                close()
                moveTo(16.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 0.2f, 7.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                horizontalLineToRelative(-0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.15f, -4.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(20.0f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(11.0f, 5.75f)
                curveToRelative(0.0f, -1.02f, 0.32f, -1.97f, 0.88f, -2.75f)
                lineTo(5.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 6.25f)
                verticalLineToRelative(8.5f)
                curveTo(2.0f, 16.55f, 3.46f, 18.0f, 5.25f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(2.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.0f, 1.0f)
                lineTo(13.0f, 18.0f)
                horizontalLineToRelative(5.75f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(22.0f, 9.62f)
                curveToRelative(-0.78f, 0.56f, -1.73f, 0.88f, -2.75f, 0.88f)
                horizontalLineToRelative(-3.5f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 11.0f, 5.75f)
                close()
            }
        }
        return _commentLink!!
    }

private var _commentLink: ImageVector? = null
