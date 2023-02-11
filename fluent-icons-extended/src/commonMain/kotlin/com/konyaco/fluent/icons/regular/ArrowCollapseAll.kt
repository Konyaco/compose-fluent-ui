

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowCollapseAll: ImageVector
    get() {
        if (_arrowCollapseAll != null) {
            return _arrowCollapseAll!!
        }
        _arrowCollapseAll = fluentIcon(name = "Regular.ArrowCollapseAll") {
            fluentPath {
                moveTo(2.0f, 4.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 2.0f, 4.75f)
                close()
                moveTo(6.22f, 8.22f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(7.5f, 10.56f)
                verticalLineToRelative(8.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-8.19f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(11.5f, 8.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _arrowCollapseAll!!
    }

private var _arrowCollapseAll: ImageVector? = null
