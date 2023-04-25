

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ImageReflection: ImageVector
    get() {
        if (_imageReflection != null) {
            return _imageReflection!!
        }
        _imageReflection = fluentIcon(name = "Regular.ImageReflection") {
            fluentPath {
                moveTo(16.25f, 7.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(16.92f, 16.99f)
                lineTo(16.75f, 17.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(18.5f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -1.0f, -0.46f, -1.9f, -1.17f, -2.5f)
                curveToRelative(0.71f, -0.6f, 1.17f, -1.5f, 1.17f, -2.5f)
                verticalLineToRelative(-9.0f)
                curveTo(20.0f, 4.45f, 18.54f, 3.0f, 16.75f, 3.0f)
                horizontalLineToRelative(-9.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 4.0f, 6.25f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.0f, 0.46f, 1.9f, 1.17f, 2.5f)
                curveToRelative(-0.71f, 0.6f, -1.17f, 1.5f, -1.17f, 2.5f)
                lineTo(4.0f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(7.08f, 17.0f)
                lineToRelative(4.4f, -4.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.04f, 0.0f)
                lineToRelative(4.4f, 4.3f)
                close()
                moveTo(7.25f, 4.5f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.34f, -0.1f, 0.66f, -0.27f, 0.93f)
                lineToRelative(-4.66f, -4.55f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.14f, 0.0f)
                lineToRelative(-4.66f, 4.55f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, true, -0.27f, -0.93f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                close()
                moveTo(11.25f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        return _imageReflection!!
    }

private var _imageReflection: ImageVector? = null
