

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoAdd: ImageVector
    get() {
        if (_videoAdd != null) {
            return _videoAdd!!
        }
        _videoAdd = fluentIcon(name = "Filled.VideoAdd") {
            fluentPath {
                moveTo(16.0f, 16.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-0.06f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 2.0f, 12.81f)
                lineTo(2.0f, 7.75f)
                curveTo(2.0f, 5.95f, 3.46f, 4.5f, 5.25f, 4.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(21.76f, 5.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.24f, 0.65f)
                verticalLineToRelative(10.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.65f, 0.76f)
                lineTo(17.0f, 15.37f)
                lineTo(17.0f, 8.63f)
                lineToRelative(3.35f, -2.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.11f)
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
