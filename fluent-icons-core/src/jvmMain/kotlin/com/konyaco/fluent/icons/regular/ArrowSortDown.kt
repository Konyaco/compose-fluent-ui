

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowSortDown: ImageVector
    get() {
        if (_arrowSortDown != null) {
            return _arrowSortDown!!
        }
        _arrowSortDown = fluentIcon(name = "Regular.ArrowSortDown") {
            fluentPath {
                moveTo(11.65f, 4.0f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(12.7f)
                lineToRelative(3.22f, -3.23f)
                curveToRelative(0.27f, -0.26f, 0.68f, -0.29f, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.69f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.09f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.97f, 0.07f)
                lineToRelative(-0.09f, -0.07f)
                lineToRelative(-4.5f, -4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -1.14f)
                lineToRelative(0.08f, 0.07f)
                lineTo(11.0f, 17.44f)
                verticalLineTo(4.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _arrowSortDown!!
    }

private var _arrowSortDown: ImageVector? = null
