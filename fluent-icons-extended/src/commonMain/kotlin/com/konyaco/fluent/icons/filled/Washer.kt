

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Washer: ImageVector
    get() {
        if (_washer != null) {
            return _washer!!
        }
        _washer = fluentIcon(name = "Filled.Washer") {
            fluentPath {
                moveTo(8.25f, 13.75f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 7.45f, -0.64f)
                curveToRelative(-0.17f, 0.15f, -0.37f, 0.3f, -0.64f, 0.42f)
                curveToRelative(-0.54f, 0.23f, -1.42f, 0.37f, -2.94f, -0.02f)
                curveToRelative(-1.7f, -0.42f, -2.84f, -0.17f, -3.64f, 0.33f)
                lineToRelative(-0.22f, 0.15f)
                lineToRelative(-0.01f, -0.24f)
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
                moveTo(8.0f, 7.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(12.0f, 6.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(12.0f, 8.5f)
                arcTo(5.25f, 5.25f, 0.0f, true, true, 12.0f, 19.0f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, 0.0f, -10.5f)
                close()
            }
        }
        return _washer!!
    }

private var _washer: ImageVector? = null
