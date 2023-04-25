

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataArea: ImageVector
    get() {
        if (_dataArea != null) {
            return _dataArea!!
        }
        _dataArea = fluentIcon(name = "Regular.DataArea") {
            fluentPath {
                moveTo(3.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(6.26f)
                lineToRelative(3.65f, -1.92f)
                curveToRelative(0.23f, -0.12f, 0.5f, -0.12f, 0.73f, 0.01f)
                lineToRelative(3.82f, 2.25f)
                lineToRelative(5.6f, -4.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.2f, 0.6f)
                lineTo(19.5f, 19.5f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(3.0f, 3.75f)
                close()
                moveTo(4.5f, 11.7f)
                verticalLineToRelative(7.8f)
                lineTo(18.0f, 19.5f)
                lineTo(18.0f, 8.25f)
                lineToRelative(-4.8f, 3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.83f, 0.05f)
                lineTo(8.48f, 9.6f)
                lineTo(4.5f, 11.7f)
                close()
            }
        }
        return _dataArea!!
    }

private var _dataArea: ImageVector? = null
