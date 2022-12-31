

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.VideoOff: ImageVector
    get() {
        if (_videoOff != null) {
            return _videoOff!!
        }
        _videoOff = fluentIcon(name = "Regular.VideoOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.57f, 1.57f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.27f, 0.0f, 2.37f, -0.73f, 2.9f, -1.79f)
                lineToRelative(4.07f, 4.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(15.48f, 16.54f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.75f, 18.0f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.87f, 0.63f, -1.59f, 1.46f, -1.73f)
                lineToRelative(10.52f, 10.52f)
                close()
                moveTo(15.5f, 12.32f)
                lineTo(15.5f, 7.75f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(9.18f, 6.0f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(6.07f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(0.17f)
                lineToRelative(3.86f, -2.31f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.14f, 0.64f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.3f, -0.17f, 0.54f, -0.4f, 0.67f)
                lineToRelative(-1.1f, -1.1f)
                lineTo(20.5f, 7.57f)
                lineTo(17.0f, 9.67f)
                verticalLineToRelative(4.15f)
                lineToRelative(-1.5f, -1.5f)
                close()
            }
        }
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
