

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Compose: ImageVector
    get() {
        if (_compose != null) {
            return _compose!!
        }
        _compose = fluentIcon(name = "Filled.Compose") {
            fluentPath {
                moveTo(11.96f, 13.46f)
                lineTo(21.7f, 3.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.42f)
                lineToRelative(-9.75f, 9.75f)
                lineToRelative(-0.29f, 1.71f)
                lineToRelative(1.7f, -0.3f)
                close()
                moveTo(6.5f, 3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 6.5f)
                verticalLineToRelative(11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 21.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 17.5f)
                verticalLineToRelative(-11.0f)
                curveTo(5.0f, 5.67f, 5.67f, 5.0f, 6.5f, 5.0f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }
        return _compose!!
    }

private var _compose: ImageVector? = null
