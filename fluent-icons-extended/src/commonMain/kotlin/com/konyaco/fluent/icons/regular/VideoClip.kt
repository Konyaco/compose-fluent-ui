

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
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 3.0f, 22.0f, 4.46f, 22.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineTo(5.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(5.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineTo(6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineTo(5.25f)
                close()
                moveTo(9.0f, 9.25f)
                verticalLineToRelative(5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.48f, 0.88f)
                lineToRelative(5.0f, -2.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.76f)
                lineToRelative(-5.0f, -2.75f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 9.25f)
                close()
            }
        }
        return _videoClip!!
    }

private var _videoClip: ImageVector? = null
