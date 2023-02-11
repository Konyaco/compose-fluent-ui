

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ImageShadow: ImageVector
    get() {
        if (_imageShadow != null) {
            return _imageShadow!!
        }
        _imageShadow = fluentIcon(name = "Regular.ImageShadow") {
            fluentPath {
                moveTo(14.0f, 6.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 3.45f, 3.46f, 2.0f, 5.25f, 2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-9.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.25f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(5.25f, 3.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.23f, 0.04f, 0.45f, 0.13f, 0.65f)
                lineToRelative(4.58f, -4.29f)
                curveToRelative(0.87f, -0.8f, 2.21f, -0.8f, 3.08f, 0.0f)
                lineToRelative(4.58f, 4.3f)
                curveToRelative(0.09f, -0.2f, 0.13f, -0.43f, 0.13f, -0.66f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(14.77f, 15.92f)
                lineToRelative(-4.5f, -4.21f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.03f, 0.0f)
                lineToRelative(-4.5f, 4.21f)
                curveToRelative(0.16f, 0.05f, 0.33f, 0.08f, 0.51f, 0.08f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.18f, 0.0f, 0.35f, -0.03f, 0.52f, -0.08f)
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
