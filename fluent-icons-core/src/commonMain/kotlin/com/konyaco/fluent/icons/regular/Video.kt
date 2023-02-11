

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = fluentIcon(name = "Regular.Video") {
            fluentPath {
                moveTo(13.75f, 4.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(0.17f)
                lineToRelative(3.86f, -2.31f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.14f, 0.64f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.58f, -0.64f, 0.94f, -1.14f, 0.64f)
                lineTo(17.0f, 16.07f)
                verticalLineToRelative(0.18f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-8.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.25f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 5.95f, 3.46f, 4.5f, 5.25f, 4.5f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(13.75f, 6.0f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(20.5f, 7.57f)
                lineTo(17.0f, 9.67f)
                verticalLineToRelative(4.66f)
                lineToRelative(3.5f, 2.1f)
                lineTo(20.5f, 7.57f)
                close()
            }
        }
        return _video!!
    }

private var _video: ImageVector? = null
