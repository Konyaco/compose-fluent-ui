

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Highlight: ImageVector
    get() {
        if (_highlight != null) {
            return _highlight!!
        }
        _highlight = fluentIcon(name = "Filled.Highlight") {
            fluentPath {
                moveTo(5.25f, 2.0f)
                curveTo(4.01f, 2.0f, 3.0f, 3.0f, 3.0f, 4.25f)
                verticalLineToRelative(3.0f)
                curveTo(3.0f, 8.49f, 4.0f, 9.5f, 5.25f, 9.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-3.0f)
                curveTo(21.0f, 3.01f, 20.0f, 2.0f, 18.75f, 2.0f)
                lineTo(5.25f, 2.0f)
                close()
                moveTo(5.0f, 11.75f)
                lineTo(5.0f, 11.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(0.75f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-9.5f)
                curveTo(6.01f, 14.0f, 5.0f, 13.0f, 5.0f, 11.75f)
                close()
                moveTo(7.5f, 15.5f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.29f)
                curveToRelative(0.0f, 0.81f, -0.44f, 1.56f, -1.14f, 1.96f)
                lineToRelative(-0.15f, 0.08f)
                lineToRelative(-6.64f, 3.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -0.58f)
                lineTo(7.51f, 15.5f)
                close()
            }
        }
        return _highlight!!
    }

private var _highlight: ImageVector? = null
