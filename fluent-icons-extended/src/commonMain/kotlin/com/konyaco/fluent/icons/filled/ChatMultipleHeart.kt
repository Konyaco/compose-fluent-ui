

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatMultipleHeart: ImageVector
    get() {
        if (_chatMultipleHeart != null) {
            return _chatMultipleHeart!!
        }
        _chatMultipleHeart = fluentIcon(name = "Filled.ChatMultipleHeart") {
            fluentPath {
                moveTo(2.0f, 10.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 4.41f, 6.84f)
                curveToRelative(-1.26f, 0.29f, -2.61f, 0.54f, -3.24f, 0.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.15f, -1.17f)
                curveToRelative(0.12f, -0.61f, 0.38f, -1.92f, 0.68f, -3.15f)
                arcTo(7.47f, 7.47f, 0.0f, false, true, 2.0f, 10.5f)
                close()
                moveTo(6.34f, 8.34f)
                curveToRelative(-0.79f, 0.8f, -0.79f, 2.08f, 0.0f, 2.87f)
                lineToRelative(2.95f, 2.95f)
                curveToRelative(0.12f, 0.12f, 0.32f, 0.12f, 0.44f, 0.0f)
                lineToRelative(2.93f, -2.93f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, -2.88f, -2.88f)
                lineToRelative(-0.28f, 0.28f)
                lineToRelative(-0.29f, -0.28f)
                curveToRelative(-0.8f, -0.8f, -2.08f, -0.8f, -2.87f, 0.0f)
                close()
                moveTo(14.56f, 21.0f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, -5.1f, -2.0f)
                arcToRelative(8.28f, 8.28f, 0.0f, false, false, 2.18f, -0.26f)
                arcToRelative(5.97f, 5.97f, 0.0f, false, false, 5.6f, 0.14f)
                lineToRelative(0.24f, -0.13f)
                lineToRelative(0.26f, 0.07f)
                curveToRelative(0.92f, 0.22f, 1.96f, 0.44f, 2.74f, 0.6f)
                curveToRelative(-0.18f, -0.74f, -0.41f, -1.75f, -0.64f, -2.64f)
                lineToRelative(-0.07f, -0.28f)
                lineToRelative(0.13f, -0.25f)
                arcToRelative(5.97f, 5.97f, 0.0f, false, false, -2.09f, -7.8f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, false, -0.8f, -2.04f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 4.35f, 10.26f)
                lineToRelative(0.67f, 2.8f)
                curveToRelative(0.2f, 0.9f, -0.57f, 1.7f, -1.47f, 1.5f)
                curveToRelative(-0.72f, -0.15f, -1.87f, -0.39f, -2.91f, -0.63f)
                curveToRelative(-0.94f, 0.42f, -1.99f, 0.66f, -3.09f, 0.66f)
                close()
            }
        }
        return _chatMultipleHeart!!
    }

private var _chatMultipleHeart: ImageVector? = null
