

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PictureInPictureExit: ImageVector
    get() {
        if (_pictureInPictureExit != null) {
            return _pictureInPictureExit!!
        }
        _pictureInPictureExit = fluentIcon(name = "Regular.PictureInPictureExit") {
            fluentPath {
                moveTo(10.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(12.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(3.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(18.75f, 6.5f)
                lineTo(13.0f, 6.5f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(5.75f)
                curveTo(20.55f, 5.0f, 22.0f, 6.46f, 22.0f, 8.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(5.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 17.75f)
                verticalLineToRelative(-5.92f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 12.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(15.94f, 16.0f)
                horizontalLineToRelative(-1.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(1.69f)
                lineToRelative(-2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(15.94f, 16.0f)
                close()
            }
        }
        return _pictureInPictureExit!!
    }

private var _pictureInPictureExit: ImageVector? = null
