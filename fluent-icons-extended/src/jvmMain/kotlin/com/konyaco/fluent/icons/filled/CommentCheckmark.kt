

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentCheckmark: ImageVector
    get() {
        if (_commentCheckmark != null) {
            return _commentCheckmark!!
        }
        _commentCheckmark = fluentIcon(name = "Filled.CommentCheckmark") {
            fluentPath {
                moveTo(12.02f, 3.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 22.0f, 11.2f)
                verticalLineToRelative(3.55f)
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
                moveTo(20.15f, 4.15f)
                lineToRelative(-4.1f, 4.09f)
                lineTo(14.9f, 6.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.8f, 0.6f)
                lineToRelative(1.5f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.75f, 0.05f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                close()
            }
        }
        return _commentCheckmark!!
    }

private var _commentCheckmark: ImageVector? = null
