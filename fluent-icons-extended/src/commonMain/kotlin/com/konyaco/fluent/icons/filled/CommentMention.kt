

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentMention: ImageVector
    get() {
        if (_commentMention != null) {
            return _commentMention!!
        }
        _commentMention = fluentIcon(name = "Filled.CommentMention") {
            fluentPath {
                moveTo(14.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineToRelative(0.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(20.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.3f, 3.73f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.2f, -0.98f)
                verticalLineToRelative(-0.74f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -2.22f, 4.16f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.56f, -0.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 6.0f)
                close()
                moveTo(18.0f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(5.25f, 3.0f)
                horizontalLineToRelative(7.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.2f, 7.47f)
                verticalLineToRelative(4.28f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(13.0f, 18.0f)
                lineToRelative(-5.0f, 3.75f)
                curveToRelative(-0.82f, 0.62f, -2.0f, 0.03f, -2.0f, -1.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.75f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                close()
            }
        }
        return _commentMention!!
    }

private var _commentMention: ImageVector? = null
