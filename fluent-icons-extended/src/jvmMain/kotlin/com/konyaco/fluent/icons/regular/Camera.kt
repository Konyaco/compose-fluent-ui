

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = fluentIcon(name = "Regular.Camera") {
            fluentPath {
                moveTo(13.92f, 2.5f)
                curveToRelative(0.8f, 0.0f, 1.54f, 0.43f, 1.94f, 1.11f)
                lineToRelative(0.82f, 1.4f)
                horizontalLineToRelative(2.07f)
                curveTo(20.55f, 5.0f, 22.0f, 6.45f, 22.0f, 8.24f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(5.25f, 20.99f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 17.75f)
                verticalLineToRelative(-9.5f)
                curveTo(2.0f, 6.45f, 3.46f, 5.0f, 5.25f, 5.0f)
                horizontalLineToRelative(2.08f)
                lineToRelative(0.88f, -1.42f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 1.91f, -1.08f)
                horizontalLineToRelative(3.8f)
                close()
                moveTo(13.92f, 4.0f)
                horizontalLineToRelative(-3.8f)
                curveToRelative(-0.22f, 0.0f, -0.43f, 0.1f, -0.57f, 0.27f)
                lineToRelative(-0.07f, 0.1f)
                lineToRelative(-1.1f, 1.77f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.63f, 0.36f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.65f, -0.37f)
                lineToRelative(-1.03f, -1.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, -0.37f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, -9.0f)
                close()
                moveTo(12.0f, 9.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        return _camera!!
    }

private var _camera: ImageVector? = null
