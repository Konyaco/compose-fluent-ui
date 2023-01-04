

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.VideoSecurity: ImageVector
    get() {
        if (_videoSecurity != null) {
            return _videoSecurity!!
        }
        _videoSecurity = fluentIcon(name = "Regular.VideoSecurity") {
            fluentPath {
                moveTo(5.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 6.25f)
                verticalLineToRelative(6.5f)
                curveTo(2.0f, 14.55f, 3.46f, 16.0f, 5.25f, 16.0f)
                horizontalLineToRelative(2.24f)
                curveToRelative(-0.08f, 0.84f, -0.78f, 1.5f, -1.65f, 1.5f)
                horizontalLineTo(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.0f)
                arcTo(5.75f, 5.75f, 0.0f, false, false, 12.0f, 16.25f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(1.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 3.23f, -2.93f)
                lineToRelative(3.88f, 2.32f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.14f, -0.64f)
                verticalLineTo(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.14f, -0.64f)
                lineToRelative(-3.88f, 2.32f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 13.75f, 3.0f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(17.0f, 7.67f)
                lineToRelative(3.5f, -2.1f)
                verticalLineToRelative(7.86f)
                lineToRelative(-3.5f, -2.1f)
                verticalLineTo(7.67f)
                close()
                moveTo(6.25f, 20.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(1.84f)
                curveToRelative(1.7f, 0.0f, 3.07f, -1.33f, 3.16f, -3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 2.35f, -1.9f, 4.25f, -4.25f, 4.25f)
                close()
                moveTo(3.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        return _videoSecurity!!
    }

private var _videoSecurity: ImageVector? = null
