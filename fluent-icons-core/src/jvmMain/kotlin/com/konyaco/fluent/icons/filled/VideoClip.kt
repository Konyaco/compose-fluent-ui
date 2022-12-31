

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
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 3.0f, 22.0f, 4.46f, 22.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(5.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 17.75f)
                lineTo(2.0f, 6.25f)
                close()
                moveTo(9.5f, 9.38f)
                verticalLineToRelative(5.24f)
                curveToRelative(0.0f, 0.56f, 0.61f, 0.93f, 1.11f, 0.65f)
                lineToRelative(4.79f, -2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.32f)
                lineTo(10.6f, 8.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.11f, 0.65f)
                close()
            }
        }
        return _videoClip!!
    }

private var _videoClip: ImageVector? = null
