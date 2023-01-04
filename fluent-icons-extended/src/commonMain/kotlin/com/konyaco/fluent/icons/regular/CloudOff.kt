

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CloudOff: ImageVector
    get() {
        if (_cloudOff != null) {
            return _cloudOff!!
        }
        _cloudOff = fluentIcon(name = "Regular.CloudOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(4.57f, 4.57f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -0.7f, 1.9f)
                lineTo(6.0f, 9.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(10.69f)
                lineToRelative(4.03f, 4.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(15.18f, 16.25f)
                lineTo(6.0f, 16.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                horizontalLineToRelative(0.76f)
                curveToRelative(0.4f, 0.0f, 0.73f, -0.31f, 0.75f, -0.71f)
                curveToRelative(0.02f, -0.57f, 0.16f, -1.1f, 0.39f, -1.58f)
                lineToRelative(7.29f, 7.29f)
                close()
                moveTo(20.0f, 13.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -1.04f, 2.03f)
                lineToRelative(1.07f, 1.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.53f, -7.1f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -8.49f, -4.0f)
                lineToRelative(1.12f, 1.1f)
                arcToRelative(4.24f, 4.24f, 0.0f, false, true, 5.95f, 3.69f)
                curveToRelative(0.02f, 0.4f, 0.35f, 0.71f, 0.75f, 0.71f)
                horizontalLineToRelative(0.76f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                close()
            }
        }
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
