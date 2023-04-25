

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
                moveTo(6.08f, 9.02f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.84f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.75f, 6.18f)
                lineToRelative(-1.68f, -1.69f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -2.82f, 1.99f)
                horizontalLineToRelative(-2.34f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -2.82f, -1.99f)
                lineToRelative(-2.5f, 2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 9.17f, 18.0f)
                lineTo(6.5f, 18.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.42f, -8.98f)
                close()
                moveTo(13.78f, 15.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(12.56f, 18.0f)
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
