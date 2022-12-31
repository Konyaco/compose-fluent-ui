

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = fluentIcon(name = "Regular.TextStrikethrough") {
            fluentPath {
                moveTo(4.75f, 12.0f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(16.28f, 13.5f)
                curveToRelative(0.88f, 0.81f, 1.33f, 1.8f, 1.33f, 2.93f)
                curveToRelative(0.0f, 2.83f, -3.23f, 4.64f, -6.75f, 4.24f)
                curveToRelative(-2.24f, -0.26f, -3.81f, -1.16f, -4.64f, -2.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.33f, -0.71f)
                curveToRelative(0.57f, 1.06f, 1.7f, 1.7f, 3.48f, 1.92f)
                curveToRelative(2.74f, 0.31f, 5.08f, -1.0f, 5.08f, -2.75f)
                curveToRelative(0.0f, -1.17f, -0.8f, -2.12f, -2.56f, -2.88f)
                lineToRelative(-0.12f, -0.05f)
                lineTo(4.75f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(14.5f)
                horizontalLineToRelative(-14.5f)
                close()
                moveTo(6.26f, 8.12f)
                curveToRelative(0.15f, -2.83f, 2.82f, -4.47f, 6.32f, -4.06f)
                curveToRelative(2.2f, 0.26f, 3.87f, 1.05f, 4.99f, 2.41f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.16f, 0.96f)
                curveToRelative(-0.85f, -1.04f, -2.17f, -1.67f, -4.0f, -1.88f)
                curveToRelative(-2.72f, -0.31f, -4.65f, 0.8f, -4.65f, 2.57f)
                curveToRelative(0.0f, 0.78f, 0.23f, 1.35f, 0.83f, 1.98f)
                lineToRelative(0.13f, 0.14f)
                lineToRelative(0.25f, 0.24f)
                lineToRelative(0.03f, 0.02f)
                lineTo(7.08f, 10.5f)
                lineToRelative(-0.02f, -0.04f)
                curveToRelative(-0.15f, -0.2f, -0.86f, -1.2f, -0.8f, -2.34f)
                close()
            }
        }
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
