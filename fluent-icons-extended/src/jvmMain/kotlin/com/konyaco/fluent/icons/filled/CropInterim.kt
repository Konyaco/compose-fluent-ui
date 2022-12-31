

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CropInterim: ImageVector
    get() {
        if (_cropInterim != null) {
            return _cropInterim!!
        }
        _cropInterim = fluentIcon(name = "Filled.CropInterim") {
            fluentPath {
                moveTo(16.67f, 9.1f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -5.17f, 11.52f)
                verticalLineToRelative(0.63f)
                curveToRelative(0.0f, 0.38f, -0.29f, 0.7f, -0.65f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.65f)
                verticalLineToRelative(-2.6f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.64f, -0.74f)
                horizontalLineToRelative(2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.48f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineToRelative(-0.74f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, 8.0f, -4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.6f, -4.8f)
                lineToRelative(-0.24f, -1.6f)
                close()
                moveTo(14.5f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.97f, 4.8f)
                lineToRelative(0.82f, 5.32f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 13.5f, 17.0f)
                lineTo(6.5f, 17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -2.78f, -3.88f)
                lineToRelative(0.82f, -5.3f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 7.5f, 4.0f)
                horizontalLineToRelative(4.99f)
                curveToRelative(0.46f, -0.6f, 1.18f, -1.0f, 2.0f, -1.0f)
                close()
                moveTo(12.0f, 5.5f)
                lineTo(8.0f, 5.5f)
                curveToRelative(0.0f, 1.2f, -0.84f, 2.2f, -1.96f, 2.45f)
                lineToRelative(-0.8f, 5.16f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.0f, 15.31f)
                lineToRelative(0.01f, 0.19f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.76f, -2.39f)
                lineToRelative(-0.8f, -5.16f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 5.67f)
                lineTo(12.0f, 5.5f)
                close()
            }
        }
        return _cropInterim!!
    }

private var _cropInterim: ImageVector? = null
