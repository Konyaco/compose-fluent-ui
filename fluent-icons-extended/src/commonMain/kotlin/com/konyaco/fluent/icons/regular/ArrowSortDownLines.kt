

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowSortDownLines: ImageVector
    get() {
        if (_arrowSortDownLines != null) {
            return _arrowSortDownLines!!
        }
        _arrowSortDownLines = fluentIcon(name = "Regular.ArrowSortDownLines") {
            fluentPath {
                moveTo(8.75f, 4.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                verticalLineToRelative(12.7f)
                lineToRelative(-3.22f, -3.23f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 1.14f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(0.09f, 0.07f)
                curveToRelative(0.3f, 0.22f, 0.7f, 0.2f, 0.97f, -0.07f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(0.07f, -0.09f)
                curveToRelative(0.22f, -0.3f, 0.2f, -0.7f, -0.07f, -0.98f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                lineTo(9.5f, 17.45f)
                lineTo(9.5f, 4.65f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 8.74f, 4.0f)
                close()
                moveTo(12.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(11.5f, 8.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(12.25f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        return _arrowSortDownLines!!
    }

private var _arrowSortDownLines: ImageVector? = null
