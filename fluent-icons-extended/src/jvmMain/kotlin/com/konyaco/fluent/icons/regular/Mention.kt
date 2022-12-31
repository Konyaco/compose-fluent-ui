

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Mention: ImageVector
    get() {
        if (_mention != null) {
            return _mention!!
        }
        _mention = fluentIcon(name = "Regular.Mention") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                verticalLineToRelative(1.75f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -7.15f, 1.59f)
                arcTo(4.29f, 4.29f, 0.0f, false, true, 11.5f, 17.0f)
                curveTo(9.0f, 17.0f, 7.0f, 14.74f, 7.0f, 12.0f)
                reflectiveCurveToRelative(2.0f, -5.0f, 4.5f, -5.0f)
                curveToRelative(1.16f, 0.0f, 2.2f, 0.48f, 3.0f, 1.27f)
                verticalLineToRelative(-0.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(6.1f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 4.5f, 0.15f)
                verticalLineTo(12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -5.51f, 7.96f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.52f, 1.4f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 11.72f)
                lineToRelative(0.01f, 0.29f)
                verticalLineToRelative(1.75f)
                verticalLineTo(12.0f)
                close()
                moveTo(11.5f, 8.5f)
                curveToRelative(-1.63f, 0.0f, -3.0f, 1.55f, -3.0f, 3.5f)
                reflectiveCurveToRelative(1.37f, 3.5f, 3.0f, 3.5f)
                reflectiveCurveToRelative(3.0f, -1.55f, 3.0f, -3.5f)
                reflectiveCurveToRelative(-1.37f, -3.5f, -3.0f, -3.5f)
                close()
            }
        }
        return _mention!!
    }

private var _mention: ImageVector? = null
