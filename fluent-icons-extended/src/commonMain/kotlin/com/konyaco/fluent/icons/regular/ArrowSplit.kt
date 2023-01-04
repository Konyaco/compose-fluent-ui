

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowSplit: ImageVector
    get() {
        if (_arrowSplit != null) {
            return _arrowSplit!!
        }
        _arrowSplit = fluentIcon(name = "Regular.ArrowSplit") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(2.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.0f, 12.25f)
                verticalLineToRelative(6.2f)
                lineToRelative(1.72f, -1.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.0f, 3.0f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.07f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(1.73f, 1.72f)
                verticalLineToRelative(-6.19f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-0.7f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(6.19f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.0f, 3.0f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineTo(6.0f, 18.44f)
                verticalLineToRelative(-6.19f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 8.75f, 9.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _arrowSplit!!
    }

private var _arrowSplit: ImageVector? = null
