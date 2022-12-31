

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageShadow: ImageVector
    get() {
        if (_imageShadow != null) {
            return _imageShadow!!
        }
        _imageShadow = fluentIcon(name = "Filled.ImageShadow") {
            fluentPath {
                moveTo(5.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.64f, 0.19f, 1.24f, 0.5f, 1.74f)
                lineToRelative(5.7f, -5.37f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.1f, 0.0f)
                lineTo(17.0f, 16.0f)
                curveToRelative(0.31f, -0.5f, 0.5f, -1.1f, 0.5f, -1.74f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(12.75f, 8.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 2.5f)
                close()
                moveTo(5.25f, 17.5f)
                curveToRelative(-0.61f, 0.0f, -1.18f, -0.17f, -1.67f, -0.46f)
                lineToRelative(5.66f, -5.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.02f, 0.0f)
                lineToRelative(5.66f, 5.33f)
                curveToRelative(-0.49f, 0.3f, -1.06f, 0.46f, -1.67f, 0.46f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(6.5f, 18.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(0.25f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.25f, -3.25f)
                close()
            }
        }
        return _imageShadow!!
    }

private var _imageShadow: ImageVector? = null
