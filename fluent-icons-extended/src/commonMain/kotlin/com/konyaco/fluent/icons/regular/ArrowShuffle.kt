

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowShuffle: ImageVector
    get() {
        if (_arrowShuffle != null) {
            return _arrowShuffle!!
        }
        _arrowShuffle = fluentIcon(name = "Regular.ArrowShuffle") {
            fluentPath {
                moveTo(19.28f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(19.44f, 7.0f)
                horizontalLineToRelative(-0.19f)
                curveToRelative(-3.92f, 0.0f, -6.42f, 2.3f, -8.7f, 4.39f)
                lineToRelative(-0.06f, 0.06f)
                curveTo(8.15f, 13.6f, 6.04f, 15.5f, 2.75f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                curveToRelative(3.92f, 0.0f, 6.42f, -2.3f, 8.7f, -4.39f)
                lineToRelative(0.06f, -0.06f)
                curveToRelative(2.34f, -2.15f, 4.45f, -4.05f, 7.74f, -4.05f)
                horizontalLineToRelative(0.19f)
                lineToRelative(-1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                close()
                moveTo(2.75f, 7.0f)
                curveToRelative(3.25f, 0.0f, 5.52f, 1.58f, 7.5f, 3.31f)
                lineToRelative(-0.3f, 0.28f)
                lineToRelative(-0.13f, 0.12f)
                lineToRelative(-0.68f, 0.62f)
                curveTo(7.28f, 9.73f, 5.4f, 8.5f, 2.75f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                close()
                moveTo(19.25f, 17.0f)
                curveToRelative(-3.25f, 0.0f, -5.52f, -1.58f, -7.5f, -3.31f)
                lineToRelative(0.3f, -0.28f)
                lineToRelative(0.13f, -0.12f)
                lineToRelative(0.68f, -0.62f)
                curveToRelative(1.86f, 1.6f, 3.74f, 2.83f, 6.39f, 2.83f)
                horizontalLineToRelative(0.19f)
                lineToRelative(-1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(19.44f, 17.0f)
                horizontalLineToRelative(-0.19f)
                close()
            }
        }
        return _arrowShuffle!!
    }

private var _arrowShuffle: ImageVector? = null
