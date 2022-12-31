

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FontIncrease: ImageVector
    get() {
        if (_fontIncrease != null) {
            return _fontIncrease!!
        }
        _fontIncrease = fluentIcon(name = "Filled.FontIncrease") {
            fluentPath {
                moveTo(16.62f, 5.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.24f, -1.56f)
                lineToRelative(2.5f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.24f, 0.0f)
                lineToRelative(2.5f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.24f, 1.56f)
                lineToRelative(-1.88f, -1.5f)
                lineToRelative(-1.88f, 1.5f)
                close()
                moveTo(12.92f, 4.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.84f, 0.0f)
                lineToRelative(-6.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.84f, 0.78f)
                lineTo(8.8f, 15.0f)
                horizontalLineToRelative(6.4f)
                lineToRelative(1.88f, 4.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.84f, -0.8f)
                lineToRelative(-6.0f, -14.0f)
                close()
                moveTo(12.0f, 7.54f)
                lineTo(14.34f, 13.0f)
                lineTo(9.66f, 13.0f)
                lineTo(12.0f, 7.54f)
                close()
            }
        }
        return _fontIncrease!!
    }

private var _fontIncrease: ImageVector? = null
