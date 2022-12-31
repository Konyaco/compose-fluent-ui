

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) {
            return _splitHorizontal!!
        }
        _splitHorizontal = fluentIcon(name = "Filled.SplitHorizontal") {
            fluentPath {
                moveTo(21.25f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                close()
                moveTo(17.75f, 2.0f)
                curveTo(18.99f, 2.0f, 20.0f, 3.0f, 20.0f, 4.25f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.01f, 5.0f, 2.0f, 6.25f, 2.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(4.0f, 19.25f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineTo(6.25f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                close()
            }
        }
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
