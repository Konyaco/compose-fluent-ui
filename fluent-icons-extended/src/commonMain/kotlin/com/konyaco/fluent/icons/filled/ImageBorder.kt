

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageBorder: ImageVector
    get() {
        if (_imageBorder != null) {
            return _imageBorder!!
        }
        _imageBorder = fluentIcon(name = "Filled.ImageBorder") {
            fluentPath {
                moveTo(10.4f, 12.66f)
                lineTo(8.0f, 15.06f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.07f)
                lineToRelative(-2.4f, -2.41f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.2f, 0.0f)
                close()
                moveTo(14.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(12.53f, 13.72f)
                lineTo(14.81f, 16.0f)
                lineTo(9.2f, 16.0f)
                lineToRelative(2.28f, -2.28f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(7.25f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-9.5f)
                close()
            }
        }
        return _imageBorder!!
    }

private var _imageBorder: ImageVector? = null
