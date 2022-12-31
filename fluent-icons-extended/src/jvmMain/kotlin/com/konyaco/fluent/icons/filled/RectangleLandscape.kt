

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RectangleLandscape: ImageVector
    get() {
        if (_rectangleLandscape != null) {
            return _rectangleLandscape!!
        }
        _rectangleLandscape = fluentIcon(name = "Filled.RectangleLandscape") {
            fluentPath {
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        return _rectangleLandscape!!
    }

private var _rectangleLandscape: ImageVector? = null
