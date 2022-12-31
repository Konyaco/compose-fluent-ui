

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BoardSplit: ImageVector
    get() {
        if (_boardSplit != null) {
            return _boardSplit!!
        }
        _boardSplit = fluentIcon(name = "Filled.BoardSplit") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                lineTo(3.0f, 11.0f)
                horizontalLineToRelative(11.0f)
                lineTo(14.0f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(3.0f, 17.75f)
                lineTo(3.0f, 12.5f)
                horizontalLineToRelative(11.0f)
                lineTo(14.0f, 21.0f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                close()
                moveTo(15.5f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 16.0f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(21.0f, 14.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(5.0f)
                lineTo(21.0f, 14.5f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-5.5f)
                lineTo(15.5f, 3.0f)
                horizontalLineToRelative(2.25f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 8.0f)
                close()
            }
        }
        return _boardSplit!!
    }

private var _boardSplit: ImageVector? = null
