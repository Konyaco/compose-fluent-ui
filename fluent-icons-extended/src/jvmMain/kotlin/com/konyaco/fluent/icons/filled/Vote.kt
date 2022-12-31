

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Vote: ImageVector
    get() {
        if (_vote != null) {
            return _vote!!
        }
        _vote = fluentIcon(name = "Filled.Vote") {
            fluentPath {
                moveTo(21.94f, 14.47f)
                lineToRelative(0.03f, 0.06f)
                lineToRelative(0.02f, 0.1f)
                lineTo(21.99f, 21.25f)
                curveToRelative(0.0f, 0.38f, -0.27f, 0.7f, -0.64f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                lineTo(2.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(2.0f, 14.7f)
                lineToRelative(0.01f, -0.09f)
                lineToRelative(0.05f, -0.15f)
                lineToRelative(2.76f, -6.02f)
                curveToRelative(0.1f, -0.23f, 0.32f, -0.4f, 0.57f, -0.43f)
                horizontalLineToRelative(2.65f)
                lineToRelative(-0.79f, 1.36f)
                lineToRelative(-0.07f, 0.13f)
                horizontalLineToRelative(-1.2f)
                lineTo(3.92f, 14.0f)
                horizontalLineToRelative(16.15f)
                lineToRelative(-2.03f, -4.35f)
                lineToRelative(0.87f, -1.5f)
                curveToRelative(0.06f, 0.06f, 0.12f, 0.12f, 0.17f, 0.2f)
                lineToRelative(0.05f, 0.09f)
                lineToRelative(2.81f, 6.03f)
                close()
                moveTo(13.37f, 2.06f)
                lineToRelative(0.09f, 0.04f)
                lineToRelative(5.18f, 3.0f)
                curveToRelative(0.33f, 0.2f, 0.46f, 0.6f, 0.32f, 0.94f)
                lineToRelative(-0.04f, 0.09f)
                lineToRelative(-2.8f, 4.87f)
                horizontalLineToRelative(1.13f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(6.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(8.57f, 11.0f)
                lineToRelative(-0.18f, -0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.32f, -0.94f)
                lineToRelative(0.05f, -0.09f)
                lineToRelative(4.31f, -7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.94f, -0.31f)
                close()
                moveTo(13.36f, 3.78f)
                lineToRelative(-3.57f, 6.2f)
                lineTo(11.57f, 11.0f)
                horizontalLineToRelative(2.81f)
                lineToRelative(2.87f, -4.97f)
                lineToRelative(-3.9f, -2.25f)
                close()
            }
        }
        return _vote!!
    }

private var _vote: ImageVector? = null
