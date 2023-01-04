

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FontDecrease: ImageVector
    get() {
        if (_fontDecrease != null) {
            return _fontDecrease!!
        }
        _fontDecrease = fluentIcon(name = "Filled.FontDecrease") {
            fluentPath {
                moveTo(16.62f, 2.22f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.24f, 1.56f)
                lineToRelative(2.5f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.24f, 0.0f)
                lineToRelative(2.5f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.24f, -1.56f)
                lineToRelative(-1.88f, 1.5f)
                lineToRelative(-1.88f, -1.5f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.92f, 0.6f)
                lineToRelative(6.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.84f, 0.8f)
                lineTo(15.2f, 15.0f)
                lineTo(8.8f, 15.0f)
                lineToRelative(-1.88f, 4.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.84f, -0.8f)
                lineToRelative(6.0f, -14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 7.54f)
                lineTo(9.66f, 13.0f)
                horizontalLineToRelative(4.68f)
                lineTo(12.0f, 7.54f)
                close()
            }
        }
        return _fontDecrease!!
    }

private var _fontDecrease: ImageVector? = null
