

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentArrowLeft: ImageVector
    get() {
        if (_commentArrowLeft != null) {
            return _commentArrowLeft!!
        }
        _commentArrowLeft = fluentIcon(name = "Filled.CommentArrowLeft") {
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
                moveTo(17.72f, 3.59f)
                lineTo(17.65f, 3.65f)
                lineTo(17.59f, 3.72f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.56f)
                lineToRelative(0.06f, 0.07f)
                lineTo(19.29f, 6.0f)
                horizontalLineToRelative(-5.38f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.41f)
                lineToRelative(-0.01f, 0.09f)
                verticalLineToRelative(0.09f)
                curveToRelative(0.05f, 0.2f, 0.2f, 0.36f, 0.41f, 0.4f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(5.3f)
                lineToRelative(-1.65f, 1.65f)
                lineToRelative(-0.06f, 0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(0.06f, -0.07f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(0.04f, -0.05f)
                lineToRelative(0.03f, -0.07f)
                lineToRelative(0.02f, -0.06f)
                lineToRelative(0.02f, -0.08f)
                verticalLineToRelative(-0.1f)
                lineToRelative(-0.02f, -0.08f)
                lineToRelative(-0.03f, -0.08f)
                lineToRelative(-0.04f, -0.07f)
                lineToRelative(-0.04f, -0.06f)
                lineToRelative(-2.52f, -2.51f)
                lineToRelative(-0.07f, -0.06f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.56f, 0.0f)
                close()
            }
        }
        return _commentArrowLeft!!
    }

private var _commentArrowLeft: ImageVector? = null
