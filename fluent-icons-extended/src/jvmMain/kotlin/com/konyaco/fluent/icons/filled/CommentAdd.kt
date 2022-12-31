

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentAdd: ImageVector
    get() {
        if (_commentAdd != null) {
            return _commentAdd!!
        }
        _commentAdd = fluentIcon(name = "Filled.CommentAdd") {
            fluentPath {
                moveTo(12.02f, 3.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 22.0f, 11.19f)
                verticalLineToRelative(3.56f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.79f)
                lineToRelative(-5.38f, 3.82f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.75f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(6.77f)
                close()
                moveTo(17.5f, 1.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(17.5f, 2.5f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.41f)
                lineTo(17.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(13.9f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.41f)
                lineToRelative(-0.01f, 0.09f)
                verticalLineToRelative(0.09f)
                curveToRelative(0.05f, 0.2f, 0.2f, 0.36f, 0.41f, 0.4f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.09f)
                curveToRelative(0.05f, 0.2f, 0.2f, 0.36f, 0.41f, 0.4f)
                lineToRelative(0.09f, 0.01f)
                horizontalLineToRelative(0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.41f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(3.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.41f)
                lineToRelative(0.01f, -0.09f)
                verticalLineToRelative(-0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.41f, -0.4f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 2.91f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.41f, -0.4f)
                lineToRelative(-0.09f, -0.01f)
                close()
            }
        }
        return _commentAdd!!
    }

private var _commentAdd: ImageVector? = null
