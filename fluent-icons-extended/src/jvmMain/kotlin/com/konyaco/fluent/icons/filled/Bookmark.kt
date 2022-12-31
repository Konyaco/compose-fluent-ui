

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = fluentIcon(name = "Filled.Bookmark") {
            fluentPath {
                moveTo(6.2f, 21.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.2f, -0.6f)
                verticalLineToRelative(-15.0f)
                curveTo(5.0f, 4.45f, 6.46f, 3.0f, 8.25f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveTo(17.55f, 3.0f, 19.0f, 4.46f, 19.0f, 6.25f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.6f, -0.7f, 0.96f, -1.19f, 0.6f)
                lineToRelative(-5.8f, -4.18f)
                lineToRelative(-5.82f, 4.18f)
                close()
            }
        }
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
