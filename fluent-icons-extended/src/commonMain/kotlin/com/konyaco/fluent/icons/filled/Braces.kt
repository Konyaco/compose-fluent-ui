

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Braces: ImageVector
    get() {
        if (_braces != null) {
            return _braces!!
        }
        _braces = fluentIcon(name = "Filled.Braces") {
            fluentPath {
                moveTo(4.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.94f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.18f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 14.06f)
                lineTo(6.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-3.94f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.76f, -0.97f)
                lineToRelative(-0.48f, -0.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.94f)
                lineToRelative(0.48f, -0.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 9.94f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(20.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.94f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.82f, 2.06f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.82f, 2.06f)
                lineTo(18.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-3.94f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.76f, -0.97f)
                lineToRelative(0.48f, -0.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.94f)
                lineToRelative(-0.48f, -0.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.76f, -0.97f)
                lineTo(20.0f, 6.0f)
                close()
            }
        }
        return _braces!!
    }

private var _braces: ImageVector? = null
