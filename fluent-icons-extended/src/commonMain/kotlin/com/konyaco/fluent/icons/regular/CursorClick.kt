

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) {
            return _cursorClick!!
        }
        _cursorClick = fluentIcon(name = "Regular.CursorClick") {
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
                moveTo(10.68f, 8.49f)
                arcToRelative(1.32f, 1.32f, 0.0f, false, false, -2.18f, 1.0f)
                verticalLineToRelative(11.27f)
                curveToRelative(0.0f, 1.21f, 1.5f, 1.78f, 2.3f, 0.88f)
                lineToRelative(2.62f, -2.92f)
                curveToRelative(0.27f, -0.31f, 0.66f, -0.5f, 1.07f, -0.5f)
                lineToRelative(3.84f, -0.16f)
                arcToRelative(1.32f, 1.32f, 0.0f, false, false, 0.8f, -2.32f)
                lineToRelative(-8.45f, -7.25f)
                close()
                moveTo(10.0f, 20.29f)
                lineTo(10.0f, 9.89f)
                lineToRelative(7.81f, 6.69f)
                lineToRelative(-3.38f, 0.13f)
                curveToRelative(-0.82f, 0.03f, -1.59f, 0.4f, -2.13f, 1.0f)
                lineTo(10.0f, 20.3f)
                close()
            }
        }
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
