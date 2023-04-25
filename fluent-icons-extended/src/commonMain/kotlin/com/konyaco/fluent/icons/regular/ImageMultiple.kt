

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ImageMultiple: ImageVector
    get() {
        if (_imageMultiple != null) {
            return _imageMultiple!!
        }
        _imageMultiple = fluentIcon(name = "Regular.ImageMultiple") {
            fluentPath {
                moveTo(13.75f, 9.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.23f, -0.04f, 0.45f, -0.13f, 0.65f)
                lineToRelative(-4.58f, -4.29f)
                curveToRelative(-0.87f, -0.8f, -2.21f, -0.8f, -3.08f, 0.0f)
                lineToRelative(-4.58f, 4.3f)
                curveToRelative(-0.09f, -0.2f, -0.13f, -0.43f, -0.13f, -0.66f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(11.26f, 12.71f)
                lineTo(15.76f, 16.92f)
                curveToRelative(-0.16f, 0.05f, -0.33f, 0.08f, -0.51f, 0.08f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-0.18f, 0.0f, -0.35f, -0.03f, -0.52f, -0.08f)
                lineToRelative(4.5f, -4.21f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.03f, 0.0f)
                close()
                moveTo(8.75f, 21.0f)
                curveToRelative(-1.15f, 0.0f, -2.16f, -0.6f, -2.74f, -1.5f)
                horizontalLineToRelative(9.74f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 3.75f, -3.75f)
                lineTo(19.5f, 6.01f)
                curveToRelative(0.9f, 0.58f, 1.5f, 1.59f, 1.5f, 2.74f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        return _imageMultiple!!
    }

private var _imageMultiple: ImageVector? = null
