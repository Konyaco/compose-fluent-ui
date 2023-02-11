

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CloudCheckmark: ImageVector
    get() {
        if (_cloudCheckmark != null) {
            return _cloudCheckmark!!
        }
        _cloudCheckmark = fluentIcon(name = "Regular.CloudCheckmark") {
            fluentPath {
                moveTo(6.09f, 7.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 11.32f, 0.0f)
                horizontalLineToRelative(0.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.96f, 4.55f)
                curveToRelative(-0.45f, -0.53f, -1.0f, -1.0f, -1.6f, -1.36f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.36f, -1.69f)
                horizontalLineToRelative(-0.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.71f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -8.48f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.71f)
                lineTo(6.0f, 9.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                horizontalLineToRelative(4.4f)
                curveToRelative(-0.18f, 0.48f, -0.3f, 0.98f, -0.36f, 1.5f)
                lineTo(6.0f, 15.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(0.09f)
                close()
                moveTo(22.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(19.85f, 14.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineToRelative(-3.65f, 3.64f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                close()
            }
        }
        return _cloudCheckmark!!
    }

private var _cloudCheckmark: ImageVector? = null
