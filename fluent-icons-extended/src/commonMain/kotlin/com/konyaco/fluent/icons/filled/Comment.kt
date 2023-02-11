

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = fluentIcon(name = "Filled.Comment") {
            fluentPath {
                moveTo(5.25f, 18.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.75f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 3.0f, 22.0f, 4.46f, 22.0f, 6.25f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.79f)
                lineToRelative(-5.38f, 3.82f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.75f)
                close()
            }
        }
        return _comment!!
    }

private var _comment: ImageVector? = null
