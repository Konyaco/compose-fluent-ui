

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FontIncrease: ImageVector
    get() {
        if (_fontIncrease != null) {
            return _fontIncrease!!
        }
        _fontIncrease = fluentIcon(name = "Regular.FontIncrease") {
            fluentPath {
                moveTo(15.2f, 5.75f)
                curveToRelative(0.27f, 0.31f, 0.75f, 0.33f, 1.05f, 0.05f)
                lineToRelative(2.25f, -2.04f)
                lineToRelative(2.25f, 2.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.0f, -1.1f)
                lineTo(19.0f, 2.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.0f, 0.0f)
                lineToRelative(-2.75f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.05f, 1.05f)
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
                moveTo(9.34f, 13.5f)
                horizontalLineToRelative(5.32f)
                lineTo(12.0f, 6.78f)
                lineTo(9.34f, 13.5f)
                close()
            }
        }
        return _fontIncrease!!
    }

private var _fontIncrease: ImageVector? = null
