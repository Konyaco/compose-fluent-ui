

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardLetter: ImageVector
    get() {
        if (_clipboardLetter != null) {
            return _clipboardLetter!!
        }
        _clipboardLetter = fluentIcon(name = "Filled.ClipboardLetter") {
            fluentPath {
                moveTo(13.75f, 2.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.16f, 0.0f, -2.11f, 0.87f, -2.24f, 2.0f)
                lineTo(6.25f, 4.0f)
                curveTo(5.01f, 4.0f, 4.0f, 5.0f, 4.0f, 6.25f)
                verticalLineToRelative(13.5f)
                curveTo(4.0f, 20.99f, 5.0f, 22.0f, 6.25f, 22.0f)
                horizontalLineToRelative(4.83f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.05f, -1.12f)
                lineToRelative(1.79f, -3.98f)
                lineToRelative(0.01f, -0.03f)
                lineToRelative(0.84f, -1.86f)
                lineTo(13.77f, 15.0f)
                lineToRelative(1.85f, -4.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.74f, 0.0f)
                lineTo(20.0f, 14.52f)
                lineTo(20.0f, 6.25f)
                curveTo(20.0f, 5.01f, 19.0f, 4.0f, 17.75f, 4.0f)
                horizontalLineToRelative(-1.76f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.24f, -2.0f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(12.51f, 22.0f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.22f, -0.04f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.25f, -0.66f)
                lineToRelative(1.8f, -4.0f)
                verticalLineToRelative(-0.01f)
                lineToRelative(2.7f, -6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.9f, 0.0f)
                lineToRelative(2.7f, 6.0f)
                lineToRelative(0.02f, 0.02f)
                lineToRelative(1.8f, 3.98f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.92f, 0.42f)
                lineTo(19.37f, 18.0f)
                horizontalLineToRelative(-4.75f)
                lineToRelative(-1.67f, 3.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.44f, 0.3f)
                close()
                moveTo(16.99f, 12.72f)
                lineTo(15.07f, 17.0f)
                horizontalLineToRelative(3.85f)
                lineTo(17.0f, 12.72f)
                close()
            }
        }
        return _clipboardLetter!!
    }

private var _clipboardLetter: ImageVector? = null
