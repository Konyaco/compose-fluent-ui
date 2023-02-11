

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoPlayPause: ImageVector
    get() {
        if (_videoPlayPause != null) {
            return _videoPlayPause!!
        }
        _videoPlayPause = fluentIcon(name = "Filled.VideoPlayPause") {
            fluentPath {
                moveTo(12.0f, 7.75f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-4.13f)
                curveToRelative(-0.02f, 0.55f, -0.3f, 1.1f, -0.84f, 1.42f)
                lineToRelative(-6.5f, 3.95f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 15.99f)
                lineTo(2.0f, 8.0f)
                curveToRelative(0.0f, -1.37f, 1.5f, -2.2f, 2.67f, -1.48f)
                lineToRelative(6.5f, 4.03f)
                curveToRelative(0.53f, 0.33f, 0.8f, 0.87f, 0.83f, 1.41f)
                lineTo(12.0f, 7.75f)
                close()
                moveTo(18.0f, 7.75f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-8.5f)
                close()
            }
        }
        return _videoPlayPause!!
    }

private var _videoPlayPause: ImageVector? = null
