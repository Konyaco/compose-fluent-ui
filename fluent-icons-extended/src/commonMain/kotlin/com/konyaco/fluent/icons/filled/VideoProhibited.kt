

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoProhibited: ImageVector
    get() {
        if (_videoProhibited != null) {
            return _videoProhibited!!
        }
        _videoProhibited = fluentIcon(name = "Filled.VideoProhibited") {
            fluentPath {
                moveTo(11.0f, 17.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 5.0f, -6.33f)
                lineTo(16.0f, 8.25f)
                curveTo(16.0f, 6.45f, 14.54f, 5.0f, 12.75f, 5.0f)
                horizontalLineToRelative(-7.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 8.25f)
                verticalLineToRelative(8.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(6.25f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, -0.5f, -2.5f)
                close()
                moveTo(17.5f, 11.0f)
                curveToRelative(1.75f, 0.0f, 3.33f, 0.69f, 4.5f, 1.81f)
                lineTo(22.0f, 7.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.65f, -0.76f)
                lineTo(17.0f, 9.13f)
                verticalLineToRelative(1.89f)
                lineToRelative(0.5f, -0.02f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(13.5f, 17.5f)
                curveToRelative(0.0f, 0.83f, 0.26f, 1.6f, 0.7f, 2.25f)
                lineToRelative(5.55f, -5.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.25f, 3.3f)
                close()
                moveTo(17.5f, 21.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, -6.25f)
                lineToRelative(-5.55f, 5.56f)
                curveToRelative(0.64f, 0.44f, 1.42f, 0.69f, 2.25f, 0.69f)
                close()
            }
        }
        return _videoProhibited!!
    }

private var _videoProhibited: ImageVector? = null
