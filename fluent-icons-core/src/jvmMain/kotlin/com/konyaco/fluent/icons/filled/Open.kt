

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Open: ImageVector
    get() {
        if (_open != null) {
            return _open!!
        }
        _open = fluentIcon(name = "Filled.Open") {
            fluentPath {
                moveTo(6.25f, 4.75f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                lineTo(6.25f, 21.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, -3.5f)
                lineTo(2.75f, 6.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(12.75f, 3.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(19.25f, 6.16f)
                lineToRelative(-4.8f, 4.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4f, -1.42f)
                lineToRelative(4.79f, -4.79f)
                horizontalLineToRelative(-4.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        return _open!!
    }

private var _open: ImageVector? = null
