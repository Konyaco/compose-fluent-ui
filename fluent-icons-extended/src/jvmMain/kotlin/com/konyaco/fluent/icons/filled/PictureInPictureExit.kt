

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PictureInPictureExit: ImageVector
    get() {
        if (_pictureInPictureExit != null) {
            return _pictureInPictureExit!!
        }
        _pictureInPictureExit = fluentIcon(name = "Filled.PictureInPictureExit") {
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
                moveTo(10.0f, 12.0f)
                lineTo(3.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.0f, -0.17f)
                verticalLineToRelative(5.92f)
                curveTo(2.0f, 19.55f, 3.46f, 21.0f, 5.25f, 21.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 6.45f, 20.54f, 5.0f, 18.75f, 5.0f)
                lineTo(13.0f, 5.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                close()
                moveTo(14.25f, 16.0f)
                horizontalLineToRelative(1.69f)
                lineToRelative(-2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineTo(17.0f, 14.94f)
                verticalLineToRelative(-1.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        return _pictureInPictureExit!!
    }

private var _pictureInPictureExit: ImageVector? = null
