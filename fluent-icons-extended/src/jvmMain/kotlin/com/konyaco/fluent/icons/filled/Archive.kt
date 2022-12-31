

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = fluentIcon(name = "Filled.Archive") {
            fluentPath {
                moveTo(3.0f, 4.5f)
                curveTo(3.0f, 3.67f, 3.67f, 3.0f, 4.5f, 3.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(21.0f, 6.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 6.0f)
                lineTo(3.0f, 4.5f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.25f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 16.25f, 21.0f)
                horizontalLineToRelative(-8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 4.0f, 17.25f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(10.25f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        return _archive!!
    }

private var _archive: ImageVector? = null
