

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BroadActivityFeed: ImageVector
    get() {
        if (_broadActivityFeed != null) {
            return _broadActivityFeed!!
        }
        _broadActivityFeed = fluentIcon(name = "Filled.BroadActivityFeed") {
            fluentPath {
                moveTo(9.25f, 14.0f)
                curveToRelative(0.96f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.97f, -0.79f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-5.5f)
                curveTo(2.78f, 21.0f, 2.0f, 20.22f, 2.0f, 19.25f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(20.25f, 14.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.96f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.97f, 0.79f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(20.25f, 3.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 12.0f)
                curveTo(2.78f, 12.0f, 2.0f, 11.22f, 2.0f, 10.25f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.92f, 0.7f, -1.68f, 1.6f, -1.75f)
                horizontalLineToRelative(16.65f)
                close()
            }
        }
        return _broadActivityFeed!!
    }

private var _broadActivityFeed: ImageVector? = null
