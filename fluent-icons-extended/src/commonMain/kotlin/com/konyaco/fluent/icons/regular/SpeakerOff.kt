

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SpeakerOff: ImageVector
    get() {
        if (_speakerOff != null) {
            return _speakerOff!!
        }
        _speakerOff = fluentIcon(name = "Regular.SpeakerOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(6.44f, 7.5f)
                lineTo(4.25f, 7.5f)
                curveTo(3.01f, 7.5f, 2.0f, 8.5f, 2.0f, 9.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(3.68f)
                curveToRelative(0.18f, 0.0f, 0.36f, 0.06f, 0.5f, 0.19f)
                lineToRelative(4.49f, 3.99f)
                curveToRelative(0.8f, 0.72f, 2.08f, 0.14f, 2.08f, -0.93f)
                verticalLineToRelative(-3.69f)
                lineToRelative(5.72f, 5.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(13.5f, 14.56f)
                verticalLineToRelative(4.63f)
                lineToRelative(-4.08f, -3.63f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 7.93f, 15.0f)
                lineTo(4.25f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(3.68f)
                lineToRelative(5.57f, 5.56f)
                close()
                moveTo(13.5f, 4.81f)
                verticalLineToRelative(5.5f)
                lineToRelative(1.5f, 1.5f)
                lineTo(15.0f, 4.26f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -2.08f, -0.93f)
                lineToRelative(-3.4f, 3.02f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(2.92f, -2.6f)
                close()
                moveTo(17.14f, 13.96f)
                lineTo(18.28f, 15.1f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -0.12f, -6.43f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.32f, 0.72f)
                arcToRelative(5.47f, 5.47f, 0.0f, false, true, 0.3f, 4.57f)
                close()
                moveTo(19.39f, 16.21f)
                lineTo(20.49f, 17.3f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, false, -0.45f, -11.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.2f, 0.9f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, 0.55f, 9.26f)
                close()
            }
        }
        return _speakerOff!!
    }

private var _speakerOff: ImageVector? = null
