

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentLightning: ImageVector
    get() {
        if (_commentLightning != null) {
            return _commentLightning!!
        }
        _commentLightning = fluentIcon(name = "Filled.CommentLightning") {
            fluentPath {
                moveTo(16.32f, 1.0f)
                horizontalLineToRelative(4.82f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.44f, 0.75f)
                lineTo(19.75f, 5.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.64f, 0.0f, 0.98f, 0.76f, 0.56f, 1.24f)
                lineToRelative(-4.82f, 5.51f)
                curveToRelative(-0.5f, 0.58f, -1.45f, 0.09f, -1.26f, -0.66f)
                lineTo(16.5f, 8.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.46f, -0.71f)
                lineToRelative(2.82f, -6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.46f, -0.29f)
                close()
                moveTo(5.25f, 3.0f)
                horizontalLineToRelative(8.7f)
                lineToRelative(-1.81f, 3.86f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 9.0f)
                horizontalLineToRelative(1.72f)
                lineToRelative(-0.46f, 1.85f)
                curveToRelative(-0.44f, 1.76f, 1.78f, 2.93f, 2.98f, 1.56f)
                lineTo(22.0f, 7.55f)
                verticalLineToRelative(7.2f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.79f)
                lineToRelative(-5.38f, 3.82f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.75f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                close()
            }
        }
        return _commentLightning!!
    }

private var _commentLightning: ImageVector? = null
