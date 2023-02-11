

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
                moveTo(18.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 2.22f, 7.34f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.56f, 0.83f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 23.0f, 6.0f)
                verticalLineToRelative(0.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.2f, 0.98f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.0f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(22.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 2.0f)
                close()
                moveTo(16.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(1.54f, 0.0f, 2.94f, -0.58f, 4.0f, -1.53f)
                verticalLineToRelative(4.28f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.79f)
                lineToRelative(-5.38f, 3.82f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.75f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(7.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.2f, 9.0f)
                close()
            }
        }
        return _commentMention!!
    }

private var _commentMention: ImageVector? = null
