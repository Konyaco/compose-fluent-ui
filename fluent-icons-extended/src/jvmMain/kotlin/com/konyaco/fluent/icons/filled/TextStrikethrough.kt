

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = fluentIcon(name = "Filled.TextStrikethrough") {
            fluentPath {
                moveTo(13.85f, 11.5f)
                horizontalLineToRelative(5.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.39f)
                curveToRelative(0.66f, 0.77f, 1.0f, 1.67f, 1.0f, 2.68f)
                curveToRelative(0.0f, 2.93f, -3.28f, 4.92f, -7.03f, 4.48f)
                curveToRelative(-2.33f, -0.27f, -3.97f, -1.22f, -4.83f, -2.83f)
                curveToRelative(-0.26f, -0.49f, -0.2f, -1.01f, 0.25f, -1.33f)
                curveToRelative(0.46f, -0.32f, 1.26f, -0.1f, 1.52f, 0.39f)
                curveToRelative(0.53f, 1.0f, 1.6f, 1.59f, 3.29f, 1.79f)
                curveToRelative(2.59f, 0.3f, 4.8f, -0.91f, 4.8f, -2.5f)
                curveToRelative(0.0f, -1.1f, -0.55f, -1.94f, -2.1f, -2.68f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(8.85f)
                close()
                moveTo(6.99f, 9.7f)
                lineToRelative(-0.3f, -0.51f)
                curveToRelative(-0.3f, -0.6f, -0.47f, -1.22f, -0.44f, -1.84f)
                curveToRelative(0.16f, -2.96f, 2.94f, -4.71f, 6.6f, -4.29f)
                curveToRelative(2.27f, 0.27f, 4.0f, 1.09f, 5.15f, 2.49f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.15f, 1.4f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -1.4f, -0.1f)
                curveToRelative(-0.81f, -0.99f, -2.07f, -1.6f, -3.82f, -1.8f)
                curveToRelative(-2.57f, -0.3f, -4.38f, 0.72f, -4.38f, 2.32f)
                curveToRelative(0.0f, 0.72f, 0.24f, 1.22f, 0.77f, 1.81f)
                curveToRelative(0.22f, 0.26f, 0.64f, 0.53f, 1.26f, 0.82f)
                horizontalLineTo(7.2f)
                curveToRelative(-0.1f, -0.17f, -0.18f, -0.27f, -0.2f, -0.3f)
                close()
            }
        }
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
