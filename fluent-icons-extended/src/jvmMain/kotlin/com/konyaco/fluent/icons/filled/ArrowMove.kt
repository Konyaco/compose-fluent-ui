

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowMove: ImageVector
    get() {
        if (_arrowMove != null) {
            return _arrowMove!!
        }
        _arrowMove = fluentIcon(name = "Filled.ArrowMove") {
            fluentPath {
                moveTo(15.46f, 6.46f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 0.0f)
                lineTo(13.0f, 5.4f)
                verticalLineToRelative(2.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(11.0f, 5.41f)
                lineTo(9.96f, 6.46f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.42f)
                lineTo(11.3f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 0.0f)
                lineToRelative(2.75f, 2.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                close()
                moveTo(6.46f, 14.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.42f, 1.42f)
                lineTo(2.3f, 12.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.42f)
                lineToRelative(2.75f, -2.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 1.42f)
                lineTo(5.4f, 11.0f)
                horizontalLineToRelative(2.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(5.41f, 13.0f)
                lineToRelative(1.05f, 1.04f)
                close()
                moveTo(18.96f, 15.46f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.42f)
                lineTo(18.6f, 13.0f)
                horizontalLineToRelative(-2.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.84f)
                lineToRelative(-1.05f, -1.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, -1.42f)
                lineToRelative(2.75f, 2.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                lineToRelative(-2.75f, 2.75f)
                close()
                moveTo(11.0f, 18.59f)
                verticalLineToRelative(-2.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(2.84f)
                lineToRelative(1.04f, -1.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 1.42f)
                lineTo(12.7f, 21.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 0.0f)
                lineToRelative(-2.75f, -2.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.42f, -1.42f)
                lineTo(11.0f, 18.6f)
                close()
            }
        }
        return _arrowMove!!
    }

private var _arrowMove: ImageVector? = null
