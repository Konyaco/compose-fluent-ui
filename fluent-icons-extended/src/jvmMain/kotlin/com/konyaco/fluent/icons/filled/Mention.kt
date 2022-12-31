

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Mention: ImageVector
    get() {
        if (_mention != null) {
            return _mention!!
        }
        _mention = fluentIcon(name = "Filled.Mention") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 9.72f)
                verticalLineToRelative(1.81f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.41f, 2.05f)
                arcToRelative(4.26f, 4.26f, 0.0f, false, true, -3.09f, 1.35f)
                curveToRelative(-2.52f, 0.0f, -4.5f, -2.25f, -4.5f, -4.96f)
                curveTo(7.0f, 9.25f, 8.98f, 7.0f, 11.5f, 7.0f)
                curveToRelative(0.94f, 0.0f, 1.8f, 0.31f, 2.51f, 0.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.98f, 0.04f)
                lineTo(16.0f, 8.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.15f)
                lineTo(20.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -5.33f, 7.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.67f, 1.89f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 2.0f)
                close()
                moveTo(11.65f, 9.0f)
                horizontalLineToRelative(-0.15f)
                curveTo(10.15f, 9.0f, 9.0f, 10.3f, 9.0f, 11.97f)
                curveToRelative(0.0f, 1.66f, 1.15f, 2.96f, 2.5f, 2.96f)
                curveToRelative(1.3f, 0.0f, 2.41f, -1.2f, 2.5f, -2.78f)
                verticalLineToRelative(-0.22f)
                curveToRelative(-0.02f, -1.59f, -1.08f, -2.83f, -2.35f, -2.92f)
                lineTo(11.5f, 9.0f)
                horizontalLineToRelative(0.15f)
                close()
            }
        }
        return _mention!!
    }

private var _mention: ImageVector? = null
