

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TabDesktop: ImageVector
    get() {
        if (_tabDesktop != null) {
            return _tabDesktop!!
        }
        _tabDesktop = fluentIcon(name = "Regular.TabDesktop") {
            fluentPath {
                moveTo(5.75f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 5.75f, 21.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 21.0f, 18.25f)
                lineTo(21.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 3.0f)
                lineTo(5.75f, 3.0f)
                close()
                moveTo(11.0f, 4.5f)
                verticalLineToRelative(1.25f)
                curveTo(11.0f, 6.99f, 12.0f, 8.0f, 13.25f, 8.0f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(5.75f, 19.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(4.5f, 5.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                lineTo(11.0f, 4.5f)
                close()
                moveTo(19.5f, 6.5f)
                horizontalLineToRelative(-6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(12.5f, 4.5f)
                horizontalLineToRelative(5.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(0.75f)
                close()
            }
        }
        return _tabDesktop!!
    }

private var _tabDesktop: ImageVector? = null
