

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowTurnBidirectionalDownRight: ImageVector
    get() {
        if (_arrowTurnBidirectionalDownRight != null) {
            return _arrowTurnBidirectionalDownRight!!
        }
        _arrowTurnBidirectionalDownRight = fluentIcon(name =
                "Filled.ArrowTurnBidirectionalDownRight") {
            fluentPath {
                moveTo(17.7f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, 1.4f)
                lineTo(18.58f, 7.0f)
                horizontalLineTo(11.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.0f, 11.5f)
                verticalLineToRelative(7.09f)
                lineToRelative(-2.3f, -2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, 1.42f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.42f)
                lineTo(9.0f, 18.6f)
                verticalLineTo(11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.5f, 9.0f)
                horizontalLineToRelative(7.09f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.42f, 1.4f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.4f)
                lineToRelative(-4.0f, -4.0f)
                close()
            }
        }
        return _arrowTurnBidirectionalDownRight!!
    }

private var _arrowTurnBidirectionalDownRight: ImageVector? = null
