

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataTreemap: ImageVector
    get() {
        if (_dataTreemap != null) {
            return _dataTreemap!!
        }
        _dataTreemap = fluentIcon(name = "Regular.DataTreemap") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(9.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                lineTo(6.25f, 4.5f)
                close()
                moveTo(10.5f, 4.5f)
                lineTo(10.5f, 14.0f)
                horizontalLineToRelative(9.0f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(10.5f, 4.5f)
                close()
                moveTo(19.5f, 15.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(7.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(19.5f, 15.5f)
                close()
            }
        }
        return _dataTreemap!!
    }

private var _dataTreemap: ImageVector? = null
