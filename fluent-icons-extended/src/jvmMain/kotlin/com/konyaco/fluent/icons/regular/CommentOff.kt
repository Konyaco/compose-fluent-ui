

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CommentOff: ImageVector
    get() {
        if (_commentOff != null) {
            return _commentOff!!
        }
        _commentOff = fluentIcon(name = "Regular.CommentOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(0.7f, 0.7f)
                arcTo(3.24f, 3.24f, 0.0f, false, false, 2.0f, 6.25f)
                verticalLineToRelative(8.5f)
                curveTo(2.0f, 16.55f, 3.46f, 18.0f, 5.25f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(2.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.0f, 1.0f)
                lineTo(13.0f, 18.0f)
                horizontalLineToRelative(3.93f)
                lineToRelative(3.78f, 3.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(15.44f, 16.5f)
                lineTo(12.5f, 16.5f)
                lineTo(7.5f, 20.25f)
                lineTo(7.5f, 16.5f)
                lineTo(5.25f, 16.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.47f, 0.18f, -0.9f, 0.48f, -1.2f)
                lineTo(15.44f, 16.5f)
                close()
                moveTo(20.5f, 14.75f)
                curveToRelative(0.0f, 0.7f, -0.4f, 1.3f, -1.0f, 1.58f)
                lineToRelative(1.1f, 1.1f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 1.4f, -2.68f)
                verticalLineToRelative(-8.5f)
                curveTo(22.0f, 4.45f, 20.54f, 3.0f, 18.75f, 3.0f)
                lineTo(6.18f, 3.0f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(11.07f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                close()
            }
        }
        return _commentOff!!
    }

private var _commentOff: ImageVector? = null
