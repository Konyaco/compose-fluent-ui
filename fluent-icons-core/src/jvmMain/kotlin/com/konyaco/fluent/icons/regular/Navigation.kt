

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = fluentIcon(name = "Regular.Navigation") {
            fluentPath {
                moveTo(2.75f, 18.0f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(18.6f)
                horizontalLineToRelative(-18.5f)
                close()
                moveTo(2.75f, 11.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(18.6f)
                horizontalLineToRelative(-18.5f)
                close()
                moveTo(2.75f, 5.0f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.49f)
                horizontalLineToRelative(18.6f)
                horizontalLineToRelative(-18.5f)
                close()
            }
        }
        return _navigation!!
    }

private var _navigation: ImageVector? = null
