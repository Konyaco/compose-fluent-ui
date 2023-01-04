

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CloudSwap: ImageVector
    get() {
        if (_cloudSwap != null) {
            return _cloudSwap!!
        }
        _cloudSwap = fluentIcon(name = "Filled.CloudSwap") {
            fluentPath {
                moveTo(11.75f, 4.25f)
                arcTo(5.75f, 5.75f, 0.0f, false, false, 6.09f, 9.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(3.17f)
                curveToRelative(-0.31f, -0.65f, -0.2f, -1.45f, 0.34f, -1.99f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.82f, 1.99f)
                horizontalLineToRelative(2.34f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.82f, -1.99f)
                lineToRelative(1.4f, 1.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 17.5f, 9.0f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -5.66f, -4.75f)
                close()
                moveTo(13.78f, 14.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(12.56f, 17.0f)
                horizontalLineToRelative(6.88f)
                lineToRelative(-1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.5f, -2.5f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.22f, 1.22f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(1.22f, -1.22f)
                close()
            }
        }
        return _cloudSwap!!
    }

private var _cloudSwap: ImageVector? = null
