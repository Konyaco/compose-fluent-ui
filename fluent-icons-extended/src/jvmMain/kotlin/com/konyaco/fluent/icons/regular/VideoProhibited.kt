

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.VideoProhibited: ImageVector
    get() {
        if (_videoProhibited != null) {
            return _videoProhibited!!
        }
        _videoProhibited = fluentIcon(name = "Regular.VideoProhibited") {
            fluentPath {
                moveTo(13.75f, 5.0f)
                curveTo(15.55f, 5.0f, 17.0f, 6.46f, 17.0f, 8.25f)
                verticalLineToRelative(0.17f)
                lineToRelative(3.86f, -2.31f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.14f, 0.64f)
                verticalLineToRelative(6.06f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, -1.5f, -1.08f)
                lineTo(20.5f, 8.07f)
                lineToRelative(-3.5f, 2.1f)
                verticalLineToRelative(0.85f)
                curveToRelative(-0.52f, 0.04f, -1.02f, 0.14f, -1.5f, 0.3f)
                lineTo(15.5f, 8.24f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(5.83f)
                curveToRelative(0.08f, 0.52f, 0.22f, 1.03f, 0.42f, 1.5f)
                lineTo(5.25f, 19.99f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.75f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 6.45f, 3.46f, 5.0f, 5.25f, 5.0f)
                horizontalLineToRelative(8.5f)
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
