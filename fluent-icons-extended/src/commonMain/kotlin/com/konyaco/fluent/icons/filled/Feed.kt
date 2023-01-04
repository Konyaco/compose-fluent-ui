

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Feed: ImageVector
    get() {
        if (_feed != null) {
            return _feed!!
        }
        _feed = fluentIcon(name = "Filled.Feed") {
            fluentPath {
                moveTo(15.0f, 21.0f)
                curveToRelative(0.94f, 0.0f, 1.75f, -0.67f, 1.93f, -1.6f)
                lineToRelative(0.48f, -2.4f)
                horizontalLineToRelative(2.84f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(22.0f, 9.26f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.26f)
                lineTo(14.5f, 7.0f)
                lineTo(14.5f, 5.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-8.0f)
                curveTo(3.01f, 3.0f, 2.0f, 4.0f, 2.0f, 5.25f)
                verticalLineToRelative(12.5f)
                curveTo(2.0f, 19.55f, 3.46f, 21.0f, 5.25f, 21.0f)
                lineTo(15.0f, 21.0f)
                close()
                moveTo(17.52f, 8.82f)
                lineTo(15.46f, 19.1f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, -0.96f, -0.1f)
                lineTo(14.5f, 8.5f)
                horizontalLineToRelative(3.11f)
                curveToRelative(-0.04f, 0.1f, -0.07f, 0.2f, -0.09f, 0.32f)
                close()
                moveTo(5.78f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(5.03f, 15.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(5.78f, 11.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        return _feed!!
    }

private var _feed: ImageVector? = null
