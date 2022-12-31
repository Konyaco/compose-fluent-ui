

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowSortDownLines: ImageVector
    get() {
        if (_arrowSortDownLines != null) {
            return _arrowSortDownLines!!
        }
        _arrowSortDownLines = fluentIcon(name = "Filled.ArrowSortDownLines") {
            fluentPath {
                moveTo(8.5f, 4.0f)
                lineToRelative(-0.12f, 0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.88f, 1.0f)
                verticalLineToRelative(11.57f)
                lineTo(5.2f, 14.3f)
                lineToRelative(-0.09f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.5f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -0.08f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.08f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.08f, -1.32f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 0.08f)
                lineTo(9.5f, 16.6f)
                lineTo(9.5f, 4.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -0.89f)
                close()
                moveTo(13.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(13.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        return _arrowSortDownLines!!
    }

private var _arrowSortDownLines: ImageVector? = null
