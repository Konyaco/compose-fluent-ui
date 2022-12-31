

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SpeakerMute: ImageVector
    get() {
        if (_speakerMute != null) {
            return _speakerMute!!
        }
        _speakerMute = fluentIcon(name = "Regular.SpeakerMute") {
            fluentPath {
                moveTo(12.92f, 3.32f)
                curveToRelative(0.8f, -0.72f, 2.08f, -0.15f, 2.08f, 0.93f)
                verticalLineToRelative(15.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.08f, 0.93f)
                lineToRelative(-4.5f, -4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.49f, -0.18f)
                lineTo(4.25f, 16.5f)
                curveTo(3.01f, 16.5f, 2.0f, 15.49f, 2.0f, 14.25f)
                verticalLineToRelative(-4.5f)
                curveTo(2.0f, 8.5f, 3.0f, 7.5f, 4.25f, 7.5f)
                horizontalLineToRelative(3.68f)
                curveToRelative(0.18f, 0.0f, 0.36f, -0.07f, 0.5f, -0.2f)
                lineToRelative(4.49f, -3.98f)
                close()
                moveTo(13.5f, 4.81f)
                lineTo(9.42f, 8.43f)
                curveToRelative(-0.4f, 0.37f, -0.94f, 0.57f, -1.49f, 0.57f)
                lineTo(4.25f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.68f)
                curveToRelative(0.55f, 0.0f, 1.08f, 0.2f, 1.5f, 0.56f)
                lineToRelative(4.07f, 3.63f)
                lineTo(13.5f, 4.8f)
                close()
                moveTo(16.22f, 9.21f)
                curveToRelative(0.3f, -0.28f, 0.77f, -0.28f, 1.06f, 0.0f)
                lineTo(19.0f, 10.95f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(20.06f, 12.0f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
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
