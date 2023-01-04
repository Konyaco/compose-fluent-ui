

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = fluentIcon(name = "Filled.Video") {
            fluentPath {
                moveTo(16.0f, 16.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-7.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.25f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 5.95f, 3.46f, 4.5f, 5.25f, 4.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(21.76f, 5.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.24f, 0.65f)
                verticalLineToRelative(10.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.65f, 0.76f)
                lineTo(17.0f, 15.37f)
                lineTo(17.0f, 8.63f)
                lineToRelative(3.35f, -2.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.11f)
                close()
            }
        }
        return _video!!
    }

private var _video: ImageVector? = null
