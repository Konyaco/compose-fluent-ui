

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoClip: ImageVector
    get() {
        if (_videoClip != null) {
            return _videoClip!!
        }
        _videoClip = fluentIcon(name = "Filled.VideoClip") {
            fluentPath {
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
                moveTo(9.0f, 9.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.48f, -0.88f)
                lineToRelative(5.0f, 2.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.76f)
                lineToRelative(-5.0f, 2.75f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 14.75f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }
        return _videoClip!!
    }

private var _videoClip: ImageVector? = null
