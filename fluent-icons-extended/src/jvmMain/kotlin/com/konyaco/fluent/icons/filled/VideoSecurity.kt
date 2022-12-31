

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoSecurity: ImageVector
    get() {
        if (_videoSecurity != null) {
            return _videoSecurity!!
        }
        _videoSecurity = fluentIcon(name = "Filled.VideoSecurity") {
            fluentPath {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(8.5f)
                curveTo(15.55f, 3.0f, 17.0f, 4.46f, 17.0f, 6.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-8.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 12.75f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(21.62f, 3.6f)
                curveToRelative(0.23f, 0.13f, 0.38f, 0.38f, 0.38f, 0.65f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.14f, 0.64f)
                lineTo(18.0f, 13.67f)
                verticalLineTo(5.33f)
                lineToRelative(2.86f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.76f, -0.01f)
                close()
                moveTo(8.14f, 17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.39f, 1.75f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(1.6f)
                curveToRelative(0.0f, 0.5f, 0.4f, 0.9f, 0.9f, 0.9f)
                horizontalLineToRelative(1.94f)
                curveToRelative(3.0f, 0.0f, 5.51f, -2.15f, 6.05f, -5.0f)
                horizontalLineTo(8.14f)
                close()
            }
        }
        return _videoSecurity!!
    }

private var _videoSecurity: ImageVector? = null
