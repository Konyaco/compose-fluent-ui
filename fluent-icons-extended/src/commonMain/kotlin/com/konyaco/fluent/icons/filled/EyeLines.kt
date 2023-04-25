

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EyeLines: ImageVector
    get() {
        if (_eyeLines != null) {
            return _eyeLines!!
        }
        _eyeLines = fluentIcon(name = "Filled.EyeLines") {
            fluentPath {
                moveTo(4.39f, 7.06f)
                curveToRelative(0.3f, -0.37f, 0.63f, -0.72f, 1.0f, -1.06f)
                horizontalLineToRelative(6.6f)
                lineTo(11.99f, 5.0f)
                lineTo(6.69f, 5.0f)
                arcTo(9.65f, 9.65f, 0.0f, false, true, 12.0f, 3.5f)
                curveToRelative(3.64f, 0.0f, 6.1f, 1.7f, 7.61f, 3.56f)
                curveToRelative(0.76f, 0.92f, 1.28f, 1.88f, 1.63f, 2.7f)
                curveToRelative(0.33f, 0.8f, 0.51f, 1.53f, 0.51f, 1.99f)
                curveToRelative(0.0f, 0.46f, -0.18f, 1.2f, -0.51f, 1.99f)
                curveToRelative(-0.35f, 0.82f, -0.87f, 1.78f, -1.63f, 2.7f)
                arcTo(9.51f, 9.51f, 0.0f, false, true, 12.0f, 20.0f)
                arcToRelative(9.65f, 9.65f, 0.0f, false, true, -5.32f, -1.5f)
                lineTo(12.0f, 18.5f)
                verticalLineToRelative(-1.0f)
                lineTo(5.38f, 17.5f)
                arcTo(10.2f, 10.2f, 0.0f, false, true, 4.04f, 16.0f)
                lineTo(12.0f, 16.0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                lineTo(12.0f, 7.5f)
                lineTo(4.04f, 7.5f)
                lineToRelative(0.35f, -0.44f)
                close()
                moveTo(10.69f, 8.5f)
                lineTo(3.4f, 8.5f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, false, -0.72f, 1.5f)
                horizontalLineToRelative(6.3f)
                curveToRelative(0.39f, -0.67f, 1.0f, -1.2f, 1.73f, -1.5f)
                close()
                moveTo(8.6f, 11.0f)
                lineTo(2.34f, 11.0f)
                curveToRelative(-0.06f, 0.3f, -0.1f, 0.55f, -0.1f, 0.75f)
                curveToRelative(0.0f, 0.2f, 0.04f, 0.46f, 0.1f, 0.75f)
                horizontalLineToRelative(6.23f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(8.98f, 13.5f)
                horizontalLineToRelative(-6.3f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, false, 0.72f, 1.5f)
                horizontalLineToRelative(7.3f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -1.72f, -1.5f)
                close()
            }
        }
        return _eyeLines!!
    }

private var _eyeLines: ImageVector? = null
