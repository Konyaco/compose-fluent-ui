

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PictureInPictureEnter: ImageVector
    get() {
        if (_pictureInPictureEnter != null) {
            return _pictureInPictureEnter!!
        }
        _pictureInPictureEnter = fluentIcon(name = "Regular.PictureInPictureEnter") {
            fluentPath {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 3.0f, 22.0f, 4.46f, 22.0f, 6.25f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineTo(5.25f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 15.75f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(5.22f, 6.22f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineTo(9.5f, 9.44f)
                verticalLineTo(7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.69f)
                lineTo(5.22f, 7.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        return _pictureInPictureEnter!!
    }

private var _pictureInPictureEnter: ImageVector? = null
