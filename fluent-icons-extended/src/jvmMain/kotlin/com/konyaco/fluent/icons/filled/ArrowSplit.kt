

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowSplit: ImageVector
    get() {
        if (_arrowSplit != null) {
            return _arrowSplit!!
        }
        _arrowSplit = fluentIcon(name = "Filled.ArrowSplit") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.0f, 11.75f)
                verticalLineToRelative(5.84f)
                lineToRelative(1.3f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.42f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, -1.42f)
                lineToRelative(1.3f, 1.3f)
                verticalLineToRelative(-5.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(5.84f)
                lineToRelative(1.3f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.42f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, -1.42f)
                lineTo(6.0f, 17.6f)
                verticalLineToRelative(-5.84f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 8.75f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _arrowSplit!!
    }

private var _arrowSplit: ImageVector? = null
