

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.VideoClip: ImageVector
    get() {
        if (_videoClip != null) {
            return _videoClip!!
        }
        _videoClip = fluentIcon(name = "Regular.VideoClip") {
            fluentPath {
                moveTo(9.5f, 9.38f)
                verticalLineToRelative(5.24f)
                curveToRelative(0.0f, 0.57f, 0.61f, 0.93f, 1.11f, 0.65f)
                lineToRelative(4.79f, -2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.32f)
                lineTo(10.6f, 8.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.11f, 0.65f)
                close()
                moveTo(5.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 19.55f, 3.46f, 21.0f, 5.25f, 21.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 4.45f, 20.54f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineTo(5.25f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        return _videoClip!!
    }

private var _videoClip: ImageVector? = null
