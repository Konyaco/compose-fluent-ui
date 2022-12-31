

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowMinimizeVertical: ImageVector
    get() {
        if (_arrowMinimizeVertical != null) {
            return _arrowMinimizeVertical!!
        }
        _arrowMinimizeVertical = fluentIcon(name = "Filled.ArrowMinimizeVertical") {
            fluentPath {
                moveTo(13.8f, 18.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, -1.4f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, 1.4f)
                lineToRelative(0.8f, -0.79f)
                lineTo(11.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-3.09f)
                lineToRelative(0.8f, 0.8f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(5.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(13.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(3.09f)
                lineToRelative(-0.8f, -0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.42f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.42f)
                lineToRelative(-0.8f, 0.8f)
                lineTo(13.0f, 3.0f)
                close()
            }
        }
        return _arrowMinimizeVertical!!
    }

private var _arrowMinimizeVertical: ImageVector? = null
