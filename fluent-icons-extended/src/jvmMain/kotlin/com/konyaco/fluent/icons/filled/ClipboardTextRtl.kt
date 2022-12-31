

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClipboardTextRtl: ImageVector
    get() {
        if (_clipboardTextRtl != null) {
            return _clipboardTextRtl!!
        }
        _clipboardTextRtl = fluentIcon(name = "Filled.ClipboardTextRtl") {
            fluentPath {
                moveTo(15.98f, 3.94f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 13.75f, 2.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.14f, 0.0f, -2.08f, 0.85f, -2.23f, 1.94f)
                lineToRelative(-0.01f, 0.14f)
                lineTo(8.01f, 4.0f)
                lineTo(6.25f, 4.0f)
                curveTo(5.01f, 4.0f, 4.0f, 5.0f, 4.0f, 6.25f)
                verticalLineToRelative(13.5f)
                curveTo(4.0f, 20.99f, 5.0f, 22.0f, 6.25f, 22.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(20.0f, 6.25f)
                curveTo(20.0f, 5.01f, 19.0f, 4.0f, 17.75f, 4.0f)
                horizontalLineToRelative(-1.76f)
                verticalLineToRelative(0.08f)
                lineToRelative(-0.01f, -0.14f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(8.0f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 9.0f)
                close()
                moveTo(11.25f, 13.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        return _clipboardTextRtl!!
    }

private var _clipboardTextRtl: ImageVector? = null
