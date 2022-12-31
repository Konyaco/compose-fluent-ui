

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardLink: ImageVector
    get() {
        if (_clipboardLink != null) {
            return _clipboardLink!!
        }
        _clipboardLink = fluentIcon(name = "Filled.ClipboardLink") {
            fluentPath {
                moveTo(10.25f, 2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.16f, 0.0f, 2.11f, 0.87f, 2.24f, 2.0f)
                horizontalLineToRelative(1.76f)
                curveTo(18.99f, 4.0f, 20.0f, 5.0f, 20.0f, 6.25f)
                lineTo(20.0f, 14.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.0f, 8.0f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 6.25f)
                curveTo(4.0f, 5.01f, 5.0f, 4.0f, 6.25f, 4.0f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.13f, -1.13f, 1.08f, -2.0f, 2.24f, -2.0f)
                close()
                moveTo(13.75f, 3.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(23.0f, 19.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(0.16f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.16f, 5.0f)
                horizontalLineToRelative(-0.1f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 19.0f, 23.0f)
                horizontalLineToRelative(0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, -4.0f)
                close()
                moveTo(15.75f, 15.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 15.0f, 15.0f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.2f, 8.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                horizontalLineToRelative(-0.16f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.16f, -5.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(18.75f, 18.25f)
                horizontalLineToRelative(-3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
            }
        }
        return _clipboardLink!!
    }

private var _clipboardLink: ImageVector? = null
