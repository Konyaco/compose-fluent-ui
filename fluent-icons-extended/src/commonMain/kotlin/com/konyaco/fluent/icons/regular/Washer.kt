

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Washer: ImageVector
    get() {
        if (_washer != null) {
            return _washer!!
        }
        _washer = fluentIcon(name = "Regular.Washer") {
            fluentPath {
                moveTo(12.0f, 8.0f)
                arcToRelative(5.25f, 5.25f, 0.0f, true, false, 0.0f, 10.5f)
                arcTo(5.25f, 5.25f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(8.25f, 13.25f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 7.5f, -0.19f)
                curveToRelative(-0.18f, 0.17f, -0.39f, 0.34f, -0.7f, 0.47f)
                curveToRelative(-0.53f, 0.23f, -1.4f, 0.37f, -2.93f, -0.02f)
                curveToRelative(-1.7f, -0.42f, -2.84f, -0.17f, -3.64f, 0.33f)
                lineToRelative(-0.17f, 0.1f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, -0.06f, -0.69f)
                close()
                moveTo(9.0f, 6.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(12.75f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(6.25f, 19.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(4.5f, 6.25f)
                close()
            }
        }
        return _washer!!
    }

private var _washer: ImageVector? = null
