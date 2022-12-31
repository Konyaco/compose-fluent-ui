

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageMultiple: ImageVector
    get() {
        if (_imageMultiple != null) {
            return _imageMultiple!!
        }
        _imageMultiple = fluentIcon(name = "Filled.ImageMultiple") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.65f, -0.19f, 1.25f, -0.51f, 1.75f)
                lineToRelative(-5.7f, -5.37f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.09f, 0.0f)
                lineTo(3.51f, 17.0f)
                curveTo(3.2f, 16.5f, 3.0f, 15.9f, 3.0f, 15.25f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(13.75f, 9.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(11.26f, 12.72f)
                lineToRelative(5.65f, 5.33f)
                curveToRelative(-0.49f, 0.28f, -1.06f, 0.45f, -1.66f, 0.45f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-0.6f, 0.0f, -1.17f, -0.17f, -1.66f, -0.45f)
                lineToRelative(5.64f, -5.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.03f, 0.0f)
                close()
                moveTo(8.75f, 21.0f)
                curveTo(7.6f, 21.0f, 6.59f, 20.4f, 6.0f, 19.5f)
                horizontalLineToRelative(9.74f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 3.75f, -3.75f)
                lineTo(19.49f, 6.01f)
                curveToRelative(0.9f, 0.58f, 1.5f, 1.59f, 1.5f, 2.74f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        return _imageMultiple!!
    }

private var _imageMultiple: ImageVector? = null
