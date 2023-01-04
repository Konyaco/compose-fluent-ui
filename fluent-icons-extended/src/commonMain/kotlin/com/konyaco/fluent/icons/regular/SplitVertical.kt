

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) {
            return _splitVertical!!
        }
        _splitVertical = fluentIcon(name = "Regular.SplitVertical") {
            fluentPath {
                moveTo(12.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.5f, 2.75f)
                close()
                moveTo(4.25f, 4.0f)
                curveTo(3.01f, 4.0f, 2.0f, 5.0f, 2.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 18.99f, 3.0f, 20.0f, 4.25f, 20.0f)
                lineTo(10.0f, 20.0f)
                verticalLineToRelative(-1.5f)
                lineTo(4.25f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(3.5f, 6.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(10.0f, 5.5f)
                lineTo(10.0f, 4.0f)
                lineTo(4.25f, 4.0f)
                close()
                moveTo(19.25f, 18.5f)
                lineTo(13.5f, 18.5f)
                lineTo(13.5f, 20.0f)
                horizontalLineToRelative(5.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(21.5f, 6.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                lineTo(13.5f, 4.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                close()
            }
        }
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
