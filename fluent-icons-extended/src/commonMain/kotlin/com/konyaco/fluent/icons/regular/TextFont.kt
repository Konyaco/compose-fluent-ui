

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextFont: ImageVector
    get() {
        if (_textFont != null) {
            return _textFont!!
        }
        _textFont = fluentIcon(name = "Regular.TextFont") {
            fluentPath {
                moveTo(7.0f, 2.0f)
                curveToRelative(0.31f, 0.0f, 0.6f, 0.2f, 0.7f, 0.49f)
                lineToRelative(2.96f, 7.98f)
                verticalLineToRelative(0.04f)
                lineToRelative(0.23f, 0.6f)
                lineToRelative(-0.83f, 2.09f)
                lineToRelative(-0.62f, -1.7f)
                lineTo(4.56f, 11.5f)
                lineToRelative(-1.1f, 3.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.42f, -0.52f)
                lineToRelative(1.3f, -3.48f)
                verticalLineToRelative(-0.04f)
                lineTo(6.3f, 2.5f)
                curveToRelative(0.1f, -0.3f, 0.39f, -0.49f, 0.7f, -0.49f)
                close()
                moveTo(5.12f, 10.0f)
                horizontalLineToRelative(3.76f)
                lineTo(7.0f, 4.91f)
                lineToRelative(-1.88f, 5.1f)
                close()
                moveTo(13.81f, 6.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.4f, 0.0f)
                lineToRelative(5.55f, 14.03f)
                horizontalLineToRelative(0.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.4f)
                lineToRelative(-1.2f, -3.0f)
                horizontalLineToRelative(-6.9f)
                lineToRelative(-1.2f, 3.0f)
                horizontalLineToRelative(0.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.49f)
                lineTo(13.8f, 6.47f)
                close()
                moveTo(17.36f, 16.0f)
                lineTo(14.5f, 8.79f)
                lineTo(11.64f, 16.0f)
                horizontalLineToRelative(5.72f)
                close()
            }
        }
        return _textFont!!
    }

private var _textFont: ImageVector? = null
