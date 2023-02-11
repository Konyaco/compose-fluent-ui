

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = fluentIcon(name = "Filled.Badge") {
            fluentPath {
                moveTo(16.0f, 4.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 5.0f, 3.16f)
                verticalLineToRelative(10.59f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(10.59f)
                curveToRelative(-0.22f, 0.46f, -0.34f, 0.96f, -0.34f, 1.5f)
                close()
                moveTo(19.5f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
            }
        }
        return _badge!!
    }

private var _badge: ImageVector? = null
