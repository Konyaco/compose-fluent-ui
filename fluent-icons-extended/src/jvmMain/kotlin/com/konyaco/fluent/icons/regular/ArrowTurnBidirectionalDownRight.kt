

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowTurnBidirectionalDownRight: ImageVector
    get() {
        if (_arrowTurnBidirectionalDownRight != null) {
            return _arrowTurnBidirectionalDownRight!!
        }
        _arrowTurnBidirectionalDownRight = fluentIcon(name =
                "Regular.ArrowTurnBidirectionalDownRight") {
            fluentPath {
                moveTo(17.28f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(3.22f, 3.22f)
                horizontalLineToRelative(-7.69f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.25f, 4.25f)
                verticalLineToRelative(7.69f)
                lineToRelative(-3.22f, -3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(9.0f, 19.44f)
                verticalLineToRelative(-7.69f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 11.75f, 9.0f)
                horizontalLineToRelative(7.69f)
                lineToRelative(-3.22f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                lineToRelative(-4.5f, -4.5f)
                close()
            }
        }
        return _arrowTurnBidirectionalDownRight!!
    }

private var _arrowTurnBidirectionalDownRight: ImageVector? = null
