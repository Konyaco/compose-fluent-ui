

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = fluentIcon(name = "Filled.Tv") {
            fluentPath {
                moveTo(4.75f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 6.75f)
                verticalLineToRelative(8.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 18.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 15.25f)
                verticalLineToRelative(-8.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 4.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(5.0f, 20.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _tv!!
    }

private var _tv: ImageVector? = null
