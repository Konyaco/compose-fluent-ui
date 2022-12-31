

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Feed: ImageVector
    get() {
        if (_feed != null) {
            return _feed!!
        }
        _feed = fluentIcon(name = "Regular.Feed") {
            fluentPath {
                moveTo(6.53f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(5.78f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(5.03f, 11.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
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
                moveTo(3.5f, 5.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(13.76f)
                curveToRelative(0.0f, 0.17f, 0.02f, 0.33f, 0.06f, 0.49f)
                lineTo(5.25f, 19.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(3.5f, 5.25f)
                close()
                moveTo(14.5f, 8.5f)
                horizontalLineToRelative(3.11f)
                curveToRelative(-0.04f, 0.1f, -0.07f, 0.2f, -0.09f, 0.32f)
                lineTo(15.46f, 19.1f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, -0.96f, -0.1f)
                lineTo(14.5f, 8.5f)
                close()
                moveTo(19.0f, 9.11f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 1.5f, 0.15f)
                verticalLineToRelative(5.99f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                horizontalLineToRelative(-2.54f)
                lineTo(19.0f, 9.11f)
                close()
            }
        }
        return _feed!!
    }

private var _feed: ImageVector? = null
