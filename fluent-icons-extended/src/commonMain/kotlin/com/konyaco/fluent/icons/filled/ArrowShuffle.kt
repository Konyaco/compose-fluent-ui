

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowShuffle: ImageVector
    get() {
        if (_arrowShuffle != null) {
            return _arrowShuffle!!
        }
        _arrowShuffle = fluentIcon(name = "Filled.ArrowShuffle") {
            fluentPath {
                moveTo(19.2f, 4.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, 1.4f)
                lineToRelative(0.8f, 0.8f)
                curveToRelative(-3.81f, 0.17f, -6.17f, 2.6f, -8.23f, 4.72f)
                lineToRelative(-0.09f, 0.08f)
                curveTo(8.06f, 13.6f, 6.15f, 15.5f, 3.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                curveToRelative(4.05f, 0.0f, 6.5f, -2.52f, 8.63f, -4.72f)
                lineToRelative(0.09f, -0.08f)
                curveToRelative(2.12f, -2.19f, 3.96f, -4.02f, 6.85f, -4.19f)
                lineToRelative(-0.78f, 0.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 1.42f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineToRelative(-2.5f, -2.5f)
                close()
                moveTo(3.0f, 6.5f)
                curveToRelative(3.23f, 0.0f, 5.44f, 1.6f, 7.29f, 3.37f)
                lineToRelative(-0.58f, 0.58f)
                lineToRelative(-0.14f, 0.16f)
                lineToRelative(-0.68f, 0.69f)
                curveTo(7.19f, 9.68f, 5.48f, 8.5f, 3.0f, 8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                close()
                moveTo(18.6f, 17.5f)
                curveToRelative(-3.02f, -0.14f, -5.12f, -1.68f, -6.89f, -3.37f)
                lineToRelative(0.58f, -0.58f)
                lineToRelative(0.14f, -0.16f)
                lineToRelative(0.68f, -0.69f)
                curveToRelative(1.6f, 1.53f, 3.21f, 2.66f, 5.46f, 2.79f)
                lineToRelative(-0.78f, -0.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, -1.42f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.42f)
                lineToRelative(0.8f, -0.8f)
                close()
            }
        }
        return _arrowShuffle!!
    }

private var _arrowShuffle: ImageVector? = null
