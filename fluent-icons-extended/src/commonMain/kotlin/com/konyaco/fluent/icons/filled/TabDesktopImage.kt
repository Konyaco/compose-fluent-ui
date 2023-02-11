

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TabDesktopImage: ImageVector
    get() {
        if (_tabDesktopImage != null) {
            return _tabDesktopImage!!
        }
        _tabDesktopImage = fluentIcon(name = "Filled.TabDesktopImage") {
            fluentPath {
                moveTo(11.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.54f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 5.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.73f, -0.2f, 1.41f, -0.54f, 2.0f)
                lineTo(18.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-7.75f)
                curveTo(12.01f, 8.0f, 11.0f, 7.0f, 11.0f, 5.75f)
                lineTo(11.0f, 3.0f)
                close()
                moveTo(21.0f, 6.5f)
                lineTo(21.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(2.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                lineTo(21.0f, 6.5f)
                close()
                moveTo(5.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.56f, 0.15f, 1.08f, 0.42f, 1.52f)
                lineToRelative(3.49f, -3.49f)
                curveToRelative(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.26f, -0.45f, 0.41f, -0.97f, 0.41f, -1.53f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(5.0f, 11.0f)
                close()
                moveTo(5.0f, 22.0f)
                curveToRelative(-0.56f, 0.0f, -1.08f, -0.15f, -1.52f, -0.42f)
                lineToRelative(3.49f, -3.49f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(-0.45f, 0.26f, -0.97f, 0.41f, -1.53f, 0.41f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(10.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        return _tabDesktopImage!!
    }

private var _tabDesktopImage: ImageVector? = null
