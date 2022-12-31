

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageOff: ImageVector
    get() {
        if (_imageOff != null) {
            return _imageOff!!
        }
        _imageOff = fluentIcon(name = "Filled.ImageOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.26f, 1.26f)
                curveToRelative(-0.3f, 0.5f, -0.48f, 1.08f, -0.48f, 1.71f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.63f, 0.18f, 1.21f, 0.49f, 1.7f)
                lineToRelative(6.93f, -6.8f)
                lineToRelative(0.14f, -0.13f)
                curveToRelative(0.17f, -0.14f, 0.36f, -0.25f, 0.56f, -0.34f)
                lineToRelative(0.95f, 0.95f)
                lineToRelative(-0.6f, 0.59f)
                lineToRelative(-6.92f, 6.8f)
                curveToRelative(0.5f, 0.3f, 1.08f, 0.48f, 1.7f, 0.48f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.62f, 0.0f, 1.2f, -0.18f, 1.7f, -0.48f)
                lineToRelative(-0.02f, -0.03f)
                lineToRelative(1.29f, 1.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.07f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(15.75f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(21.0f, 17.75f)
                verticalLineToRelative(0.07f)
                lineTo(6.18f, 3.0f)
                horizontalLineToRelative(11.57f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(15.75f, 6.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, -4.5f)
                close()
            }
        }
        return _imageOff!!
    }

private var _imageOff: ImageVector? = null
