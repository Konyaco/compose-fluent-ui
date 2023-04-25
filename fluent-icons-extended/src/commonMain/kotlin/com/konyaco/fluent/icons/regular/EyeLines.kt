

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EyeLines: ImageVector
    get() {
        if (_eyeLines != null) {
            return _eyeLines!!
        }
        _eyeLines = fluentIcon(name = "Regular.EyeLines") {
            fluentPath {
                moveTo(9.35f, 12.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.06f, 0.3f, -0.1f, 0.55f, -0.1f, 0.75f)
                curveToRelative(0.0f, 0.2f, 0.04f, 0.46f, 0.1f, 0.75f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(12.0f, 18.5f)
                lineTo(6.68f, 18.5f)
                arcTo(9.65f, 9.65f, 0.0f, false, false, 12.0f, 20.0f)
                curveToRelative(3.64f, 0.0f, 6.1f, -1.7f, 7.61f, -3.56f)
                curveToRelative(0.76f, -0.92f, 1.29f, -1.88f, 1.63f, -2.7f)
                curveToRelative(0.33f, -0.8f, 0.51f, -1.53f, 0.51f, -1.99f)
                curveToRelative(0.0f, -0.46f, -0.18f, -1.2f, -0.51f, -1.99f)
                curveToRelative(-0.34f, -0.82f, -0.87f, -1.78f, -1.63f, -2.7f)
                arcToRelative(9.51f, 9.51f, 0.0f, false, false, -7.6f, -3.56f)
                lineTo(12.0f, 3.5f)
                curveToRelative(-2.18f, 0.0f, -3.94f, 0.61f, -5.32f, 1.5f)
                lineTo(12.0f, 5.0f)
                curveToRelative(3.11f, 0.0f, 5.16f, 1.43f, 6.45f, 3.0f)
                curveToRelative(0.65f, 0.8f, 1.1f, 1.64f, 1.4f, 2.34f)
                curveToRelative(0.3f, 0.73f, 0.4f, 1.24f, 0.4f, 1.41f)
                curveToRelative(0.0f, 0.17f, -0.1f, 0.68f, -0.4f, 1.41f)
                curveToRelative(-0.3f, 0.7f, -0.75f, 1.54f, -1.4f, 2.33f)
                arcTo(8.02f, 8.02f, 0.0f, false, true, 12.0f, 18.5f)
                close()
                moveTo(5.38f, 6.0f)
                arcToRelative(10.21f, 10.21f, 0.0f, false, false, -1.34f, 1.5f)
                lineTo(12.0f, 7.5f)
                lineTo(12.0f, 6.0f)
                lineTo(5.38f, 6.0f)
                close()
                moveTo(12.0f, 8.5f)
                lineTo(3.4f, 8.5f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, false, -0.73f, 1.5f)
                horizontalLineToRelative(7.2f)
                arcToRelative(2.74f, 2.74f, 0.0f, true, true, 0.0f, 3.5f)
                horizontalLineToRelative(-7.2f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, false, 0.72f, 1.5f)
                lineTo(12.0f, 15.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, false, 0.0f, -8.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 16.0f)
                lineTo(4.04f, 16.0f)
                arcToRelative(10.72f, 10.72f, 0.0f, false, false, 1.34f, 1.5f)
                lineTo(12.0f, 17.5f)
                lineTo(12.0f, 16.0f)
                close()
            }
        }
        return _eyeLines!!
    }

private var _eyeLines: ImageVector? = null
