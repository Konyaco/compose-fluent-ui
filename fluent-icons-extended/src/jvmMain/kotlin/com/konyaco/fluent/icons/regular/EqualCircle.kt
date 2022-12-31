

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EqualCircle: ImageVector
    get() {
        if (_equalCircle != null) {
            return _equalCircle!!
        }
        _equalCircle = fluentIcon(name = "Regular.EqualCircle") {
            fluentPath {
                moveTo(16.26f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(7.77f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.49f)
                close()
                moveTo(16.26f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(7.77f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.49f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 0.0f, -17.0f)
                close()
            }
        }
        return _equalCircle!!
    }

private var _equalCircle: ImageVector? = null
