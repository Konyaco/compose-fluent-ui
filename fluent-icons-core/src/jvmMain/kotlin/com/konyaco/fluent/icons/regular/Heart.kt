

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = fluentIcon(name = "Regular.Heart") {
            fluentPath {
                moveTo(12.82f, 5.58f)
                lineTo(12.0f, 6.4f)
                lineToRelative(-0.82f, -0.82f)
                arcToRelative(5.37f, 5.37f, 0.0f, true, false, -7.6f, 7.6f)
                lineToRelative(7.89f, 7.9f)
                curveToRelative(0.3f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f)
                lineToRelative(7.9f, -7.9f)
                arcToRelative(5.38f, 5.38f, 0.0f, true, false, -7.61f, -7.6f)
                close()
                moveTo(19.37f, 12.12f)
                lineTo(12.0f, 19.48f)
                lineToRelative(-7.36f, -7.36f)
                arcToRelative(3.87f, 3.87f, 0.0f, true, true, 5.48f, -5.48f)
                lineTo(11.47f, 8.0f)
                curveToRelative(0.3f, 0.3f, 0.79f, 0.29f, 1.08f, -0.02f)
                lineToRelative(1.33f, -1.34f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, 5.49f, 5.48f)
                close()
            }
        }
        return _heart!!
    }

private var _heart: ImageVector? = null
