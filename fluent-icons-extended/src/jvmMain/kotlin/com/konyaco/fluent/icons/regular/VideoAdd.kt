

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.VideoAdd: ImageVector
    get() {
        if (_videoAdd != null) {
            return _videoAdd!!
        }
        _videoAdd = fluentIcon(name = "Regular.VideoAdd") {
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
                horizontalLineToRelative(-1.06f)
                curveToRelative(0.15f, -0.48f, 0.25f, -0.98f, 0.3f, -1.5f)
                horizontalLineToRelative(0.76f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(3.98f)
                curveToRelative(-0.55f, 0.29f, -1.06f, 0.65f, -1.5f, 1.08f)
                lineTo(2.0f, 7.75f)
                curveTo(2.0f, 5.95f, 3.46f, 4.5f, 5.25f, 4.5f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(20.5f, 7.57f)
                lineTo(17.0f, 9.67f)
                verticalLineToRelative(4.66f)
                lineToRelative(3.5f, 2.1f)
                lineTo(20.5f, 7.57f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(6.0f, 18.0f)
                lineTo(3.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(7.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(7.0f, 18.0f)
                close()
            }
        }
        return _videoAdd!!
    }

private var _videoAdd: ImageVector? = null
