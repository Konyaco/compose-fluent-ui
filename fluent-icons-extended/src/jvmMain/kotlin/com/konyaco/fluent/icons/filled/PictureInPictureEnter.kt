

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PictureInPictureEnter: ImageVector
    get() {
        if (_pictureInPictureEnter != null) {
            return _pictureInPictureEnter!!
        }
        _pictureInPictureEnter = fluentIcon(name = "Filled.PictureInPictureEnter") {
            fluentPath {
                moveTo(5.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 6.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 17.55f, 3.46f, 19.0f, 5.25f, 19.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.0f, 0.17f)
                lineTo(22.0f, 6.25f)
                curveTo(22.0f, 4.45f, 20.54f, 3.0f, 18.75f, 3.0f)
                lineTo(5.25f, 3.0f)
                close()
                moveTo(6.28f, 6.22f)
                lineTo(9.5f, 9.44f)
                lineTo(9.5f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.69f)
                lineTo(5.22f, 7.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                close()
                moveTo(22.0f, 13.27f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.0f, -0.27f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.0f, -1.73f)
                close()
            }
        }
        return _pictureInPictureEnter!!
    }

private var _pictureInPictureEnter: ImageVector? = null
