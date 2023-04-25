

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CloudSwap: ImageVector
    get() {
        if (_cloudSwap != null) {
            return _cloudSwap!!
        }
        _cloudSwap = fluentIcon(name = "Regular.CloudSwap") {
            fluentPath {
                moveTo(12.0f, 5.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 0.71f)
                lineTo(6.5f, 10.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                horizontalLineToRelative(2.67f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(6.5f, 18.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.42f, -8.98f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.84f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.75f, 6.18f)
                lineToRelative(-1.2f, -1.21f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.96f, -3.49f)
                horizontalLineToRelative(-0.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.71f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 12.0f, 5.5f)
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
