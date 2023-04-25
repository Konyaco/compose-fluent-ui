

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentEdit: ImageVector
    get() {
        if (_commentEdit != null) {
            return _commentEdit!!
        }
        _commentEdit = fluentIcon(name = "Filled.CommentEdit") {
            fluentPath {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 3.0f, 22.0f, 4.46f, 22.0f, 6.25f)
                verticalLineToRelative(4.67f)
                arcToRelative(3.29f, 3.29f, 0.0f, false, false, -4.6f, 0.04f)
                lineToRelative(-5.91f, 5.9f)
                curveToRelative(-0.47f, 0.48f, -0.8f, 1.07f, -0.97f, 1.72f)
                lineToRelative(-0.4f, 1.58f)
                lineTo(8.0f, 21.75f)
                curveToRelative(-0.82f, 0.62f, -2.0f, 0.03f, -2.0f, -1.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.75f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(18.1f, 11.67f)
                lineTo(12.2f, 17.57f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.47f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.53f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _commentEdit!!
    }

private var _commentEdit: ImageVector? = null
