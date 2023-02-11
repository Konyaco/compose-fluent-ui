

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardTextLtr: ImageVector
    get() {
        if (_clipboardTextLtr != null) {
            return _clipboardTextLtr!!
        }
        _clipboardTextLtr = fluentIcon(name = "Filled.ClipboardTextLtr") {
            fluentPath {
                moveTo(13.75f, 3.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(13.75f, 2.0f)
                curveToRelative(1.14f, 0.0f, 2.08f, 0.85f, 2.23f, 1.94f)
                lineToRelative(0.01f, 0.14f)
                lineTo(15.99f, 4.0f)
                horizontalLineToRelative(1.76f)
                curveTo(18.99f, 4.0f, 20.0f, 5.0f, 20.0f, 6.25f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(6.25f, 22.0f)
                curveTo(5.01f, 22.0f, 4.0f, 21.0f, 4.0f, 19.75f)
                lineTo(4.0f, 6.25f)
                curveTo(4.0f, 5.01f, 5.0f, 4.0f, 6.25f, 4.0f)
                horizontalLineToRelative(1.76f)
                verticalLineToRelative(0.08f)
                lineToRelative(0.01f, -0.14f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 10.25f, 2.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(14.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(12.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(16.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.0f, 9.0f)
                close()
            }
        }
        return _clipboardTextLtr!!
    }

private var _clipboardTextLtr: ImageVector? = null
