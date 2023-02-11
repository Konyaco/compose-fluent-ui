

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CameraOff: ImageVector
    get() {
        if (_cameraOff != null) {
            return _cameraOff!!
        }
        _cameraOff = fluentIcon(name = "Filled.CameraOff") {
            fluentPath {
                moveTo(2.22f, 2.22f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-0.95f, -0.94f)
                curveToRelative(-0.32f, 0.1f, -0.66f, 0.16f, -1.02f, 0.16f)
                lineTo(5.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 17.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -1.4f, 0.89f, -2.6f, 2.14f, -3.05f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(13.82f, 14.88f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.2f, -4.2f)
                lineTo(8.55f, 9.6f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 6.34f, 6.34f)
                lineToRelative(-1.07f, -1.07f)
                close()
                moveTo(16.44f, 13.26f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -5.2f, -5.2f)
                lineTo(7.65f, 4.47f)
                lineToRelative(0.55f, -0.9f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 1.92f, -1.07f)
                horizontalLineToRelative(3.8f)
                curveToRelative(0.8f, 0.0f, 1.54f, 0.43f, 1.94f, 1.11f)
                lineTo(16.68f, 5.0f)
                horizontalLineToRelative(2.07f)
                curveTo(20.55f, 5.0f, 22.0f, 6.46f, 22.0f, 8.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.32f, -0.05f, 0.64f, -0.14f, 0.93f)
                lineToRelative(-5.42f, -5.42f)
                close()
            }
        }
        return _cameraOff!!
    }

private var _cameraOff: ImageVector? = null
