

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) {
            return _splitHorizontal!!
        }
        _splitHorizontal = fluentIcon(name = "Regular.SplitHorizontal") {
            fluentPath {
                moveTo(21.25f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(2.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                close()
                moveTo(20.0f, 4.25f)
                curveTo(20.0f, 3.01f, 19.0f, 2.0f, 17.75f, 2.0f)
                lineTo(6.25f, 2.0f)
                curveTo(5.01f, 2.0f, 4.0f, 3.0f, 4.0f, 4.25f)
                lineTo(4.0f, 10.0f)
                horizontalLineToRelative(1.5f)
                lineTo(5.5f, 4.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(18.5f, 10.0f)
                lineTo(20.0f, 10.0f)
                lineTo(20.0f, 4.25f)
                close()
                moveTo(5.5f, 19.25f)
                lineTo(5.5f, 13.5f)
                lineTo(4.0f, 13.5f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(20.0f, 13.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(6.25f, 20.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
