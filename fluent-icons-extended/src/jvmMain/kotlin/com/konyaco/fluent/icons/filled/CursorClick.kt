

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) {
            return _cursorClick!!
        }
        _cursorClick = fluentIcon(name = "Filled.CursorClick") {
            fluentPath {
                moveTo(9.25f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(4.47f, 3.97f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(1.75f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(4.47f, 5.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(14.03f, 3.97f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-1.75f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.75f, -1.75f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(2.5f, 8.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(8.5f, 9.49f)
                arcToRelative(1.32f, 1.32f, 0.0f, false, true, 2.18f, -1.0f)
                lineToRelative(8.46f, 7.25f)
                curveToRelative(0.9f, 0.78f, 0.39f, 2.27f, -0.8f, 2.32f)
                lineToRelative(-3.85f, 0.15f)
                curveToRelative(-0.41f, 0.02f, -0.8f, 0.2f, -1.07f, 0.5f)
                lineToRelative(-2.62f, 2.93f)
                curveToRelative(-0.8f, 0.9f, -2.3f, 0.33f, -2.3f, -0.88f)
                lineTo(8.5f, 9.5f)
                close()
            }
        }
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
