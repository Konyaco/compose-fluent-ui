

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FontDecrease: ImageVector
    get() {
        if (_fontDecrease != null) {
            return _fontDecrease!!
        }
        _fontDecrease = fluentIcon(name = "Regular.FontDecrease") {
            fluentPath {
                moveTo(16.25f, 2.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.0f, 1.1f)
                lineTo(18.0f, 5.8f)
                curveToRelative(0.28f, 0.26f, 0.72f, 0.26f, 1.0f, 0.0f)
                lineToRelative(2.75f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.0f, -1.1f)
                lineTo(18.5f, 4.24f)
                lineTo(16.25f, 2.2f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(0.3f, 0.0f, 0.58f, 0.19f, 0.7f, 0.47f)
                lineToRelative(5.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.4f, 0.56f)
                lineTo(15.25f, 15.0f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(-1.8f, 4.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.4f, -0.56f)
                lineToRelative(5.75f, -14.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 6.78f)
                lineTo(9.34f, 13.5f)
                horizontalLineToRelative(5.32f)
                lineTo(12.0f, 6.78f)
                close()
            }
        }
        return _fontDecrease!!
    }

private var _fontDecrease: ImageVector? = null
