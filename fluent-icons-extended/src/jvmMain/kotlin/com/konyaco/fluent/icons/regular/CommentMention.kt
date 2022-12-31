

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CommentMention: ImageVector
    get() {
        if (_commentMention != null) {
            return _commentMention!!
        }
        _commentMention = fluentIcon(name = "Regular.CommentMention") {
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
                moveTo(22.0f, 14.75f)
                verticalLineToRelative(-4.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.5f, 0.99f)
                verticalLineToRelative(3.29f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-6.24f)
                lineTo(7.5f, 20.25f)
                lineTo(7.5f, 16.5f)
                lineTo(5.25f, 16.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(6.94f)
                curveToRelative(0.14f, -0.53f, 0.34f, -1.04f, 0.61f, -1.5f)
                lineTo(5.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 6.25f)
                verticalLineToRelative(8.5f)
                curveTo(2.0f, 16.55f, 3.46f, 18.0f, 5.25f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(2.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.0f, 1.0f)
                lineTo(13.0f, 18.0f)
                horizontalLineToRelative(5.74f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.45f, 3.25f, -3.25f)
                close()
            }
        }
        return _commentMention!!
    }

private var _commentMention: ImageVector? = null
