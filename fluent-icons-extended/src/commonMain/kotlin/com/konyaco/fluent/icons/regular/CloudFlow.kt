

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CloudFlow: ImageVector
    get() {
        if (_cloudFlow != null) {
            return _cloudFlow!!
        }
        _cloudFlow = fluentIcon(name = "Regular.CloudFlow") {
            fluentPath {
                moveTo(7.5f, 7.79f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 9.0f, 0.0f)
                curveToRelative(0.01f, 0.4f, 0.34f, 0.71f, 0.74f, 0.71f)
                horizontalLineToRelative(0.26f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.99f, 2.7f)
                curveToRelative(0.56f, 0.2f, 1.06f, 0.53f, 1.46f, 0.95f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.03f, -5.13f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.84f, 0.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 6.5f, 16.0f)
                horizontalLineToRelative(6.68f)
                lineToRelative(0.13f, -0.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.47f, -1.0f)
                lineTo(6.5f, 14.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                horizontalLineToRelative(0.26f)
                curveToRelative(0.4f, 0.0f, 0.73f, -0.31f, 0.75f, -0.71f)
                close()
                moveTo(19.25f, 13.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(16.22f, 15.75f)
                horizontalLineToRelative(0.47f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -0.14f, -1.5f)
                horizontalLineToRelative(-0.33f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.94f, 1.5f)
                lineToRelative(-1.01f, 3.88f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.49f, 0.37f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -0.28f, 1.5f)
                horizontalLineToRelative(1.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.94f, -1.5f)
                lineToRelative(1.01f, -3.88f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.49f, -0.37f)
                close()
                moveTo(8.0f, 20.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                close()
            }
        }
        return _cloudFlow!!
    }

private var _cloudFlow: ImageVector? = null
