

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Blur: ImageVector
    get() {
        if (_blur != null) {
            return _blur!!
        }
        _blur = fluentIcon(name = "Regular.Blur") {
            fluentPath {
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 13.98f, -7.5f)
                lineTo(12.0f, 4.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 0.0f, 15.0f)
                lineTo(12.0f, 18.0f)
                horizontalLineToRelative(6.7f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 12.0f)
                close()
                moveTo(18.23f, 5.5f)
                lineTo(12.0f, 5.5f)
                lineTo(12.0f, 7.0f)
                horizontalLineToRelative(7.48f)
                arcToRelative(9.05f, 9.05f, 0.0f, false, false, -1.25f, -1.5f)
                close()
                moveTo(12.0f, 8.0f)
                horizontalLineToRelative(8.06f)
                curveToRelative(0.24f, 0.48f, 0.44f, 0.98f, 0.59f, 1.5f)
                lineTo(12.0f, 9.5f)
                lineTo(12.0f, 8.0f)
                close()
                moveTo(20.88f, 10.5f)
                lineTo(12.0f, 10.5f)
                lineTo(12.0f, 12.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.0f, -0.51f, -0.04f, -1.01f, -0.12f, -1.5f)
                close()
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(8.95f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, true, -0.3f, 1.5f)
                lineTo(12.0f, 14.5f)
                lineTo(12.0f, 13.0f)
                close()
                moveTo(20.3f, 15.5f)
                lineTo(12.0f, 15.5f)
                lineTo(12.0f, 17.0f)
                horizontalLineToRelative(7.48f)
                curveToRelative(0.32f, -0.47f, 0.6f, -0.97f, 0.81f, -1.5f)
                close()
            }
        }
        return _blur!!
    }

private var _blur: ImageVector? = null
