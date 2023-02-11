

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SpeakerMute: ImageVector
    get() {
        if (_speakerMute != null) {
            return _speakerMute!!
        }
        _speakerMute = fluentIcon(name = "Filled.SpeakerMute") {
            fluentPath {
                moveTo(15.0f, 4.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -2.08f, -0.93f)
                lineTo(8.42f, 7.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.49f, 0.19f)
                lineTo(4.25f, 7.49f)
                curveTo(3.01f, 7.5f, 2.0f, 8.5f, 2.0f, 9.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(3.68f)
                curveToRelative(0.18f, 0.0f, 0.36f, 0.06f, 0.5f, 0.19f)
                lineToRelative(4.49f, 3.99f)
                curveToRelative(0.8f, 0.72f, 2.08f, 0.14f, 2.08f, -0.93f)
                lineTo(15.0f, 4.25f)
                close()
                moveTo(16.22f, 9.22f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineTo(19.0f, 10.94f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(20.06f, 12.0f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(19.0f, 13.06f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(17.94f, 12.0f)
                lineToRelative(-1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        return _speakerMute!!
    }

private var _speakerMute: ImageVector? = null
