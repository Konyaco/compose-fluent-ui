

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) {
            return _splitVertical!!
        }
        _splitVertical = fluentIcon(name = "Filled.SplitVertical") {
            fluentPath {
                moveTo(12.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(2.75f)
                close()
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 5.01f, 3.0f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(4.25f)
                curveTo(3.01f, 20.0f, 2.0f, 19.0f, 2.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(19.25f, 20.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(5.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                close()
            }
        }
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
