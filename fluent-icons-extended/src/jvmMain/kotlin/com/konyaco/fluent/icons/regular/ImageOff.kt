

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ImageOff: ImageVector
    get() {
        if (_imageOff != null) {
            return _imageOff!!
        }
        _imageOff = fluentIcon(name = "Regular.ImageOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.26f, 1.26f)
                curveToRelative(-0.3f, 0.5f, -0.48f, 1.08f, -0.48f, 1.71f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.63f, 0.0f, 1.21f, -0.18f, 1.7f, -0.48f)
                lineToRelative(1.27f, 1.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(12.07f, 13.12f)
                lineToRelative(6.2f, 6.21f)
                lineToRelative(0.06f, 0.07f)
                curveToRelative(-0.18f, 0.07f, -0.38f, 0.1f, -0.58f, 0.1f)
                lineTo(6.25f, 19.5f)
                curveToRelative(-0.2f, 0.0f, -0.4f, -0.03f, -0.58f, -0.1f)
                lineToRelative(5.8f, -5.69f)
                lineToRelative(0.6f, -0.58f)
                close()
                moveTo(11.12f, 12.18f)
                curveToRelative(-0.25f, 0.1f, -0.49f, 0.26f, -0.7f, 0.46f)
                lineToRelative(-5.82f, 5.7f)
                curveToRelative(-0.06f, -0.18f, -0.1f, -0.38f, -0.1f, -0.59f)
                lineTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.2f, 0.04f, -0.4f, 0.1f, -0.59f)
                lineToRelative(6.52f, 6.52f)
                close()
                moveTo(19.5f, 16.32f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(7.68f, 4.5f)
                lineTo(6.18f, 3.0f)
                horizontalLineToRelative(11.57f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.57f)
                lineToRelative(-1.5f, -1.5f)
                close()
                moveTo(15.25f, 6.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                close()
                moveTo(15.25f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        return _imageOff!!
    }

private var _imageOff: ImageVector? = null
