

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowPrevious: ImageVector
    get() {
        if (_arrowPrevious != null) {
            return _arrowPrevious!!
        }
        _arrowPrevious = fluentIcon(name = "Regular.ArrowPrevious") {
            fluentPath {
                moveTo(5.75f, 3.0f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.1f)
                lineTo(6.5f, 3.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 5.75f, 3.0f)
                close()
                moveTo(18.78f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, -0.07f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-8.25f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.07f, 0.98f)
                lineToRelative(0.07f, 0.08f)
                lineToRelative(8.25f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.13f, -0.98f)
                lineToRelative(-0.07f, -0.08f)
                lineTo(11.06f, 12.0f)
                lineToRelative(7.72f, -7.72f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                close()
            }
        }
        return _arrowPrevious!!
    }

private var _arrowPrevious: ImageVector? = null
