

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageReflection: ImageVector
    get() {
        if (_imageReflection != null) {
            return _imageReflection!!
        }
        _imageReflection = fluentIcon(name = "Filled.ImageReflection") {
            fluentPath {
                moveTo(4.0f, 6.25f)
                curveTo(4.0f, 4.45f, 5.46f, 3.0f, 7.25f, 3.0f)
                horizontalLineToRelative(9.5f)
                curveTo(18.55f, 3.0f, 20.0f, 4.46f, 20.0f, 6.25f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.0f, -0.46f, 1.9f, -1.17f, 2.5f)
                curveToRelative(0.71f, 0.6f, 1.17f, 1.5f, 1.17f, 2.5f)
                lineTo(20.0f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, -1.0f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(0.04f, 0.08f, 0.05f, 0.16f, 0.05f, 0.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, -1.0f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(5.5f, 21.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 21.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -1.0f, 0.46f, -1.9f, 1.17f, -2.5f)
                arcTo(3.27f, 3.27f, 0.0f, false, true, 4.0f, 15.25f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(5.78f, 16.2f)
                curveToRelative(0.29f, 0.45f, 0.78f, 0.75f, 1.33f, 0.8f)
                lineToRelative(4.37f, -4.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.05f, 0.0f)
                lineTo(16.92f, 17.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.31f, -0.81f)
                lineToRelative(-4.66f, -4.54f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.14f, 0.0f)
                lineTo(5.78f, 16.2f)
                close()
                moveTo(15.0f, 9.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.0f, 9.0f)
                close()
            }
        }
        return _imageReflection!!
    }

private var _imageReflection: ImageVector? = null
