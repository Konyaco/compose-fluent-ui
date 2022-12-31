

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentBulletListMultiple: ImageVector
    get() {
        if (_documentBulletListMultiple != null) {
            return _documentBulletListMultiple!!
        }
        _documentBulletListMultiple = fluentIcon(name = "Regular.DocumentBulletListMultiple") {
            fluentPath {
                moveTo(7.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(7.0f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(10.0f, 12.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(3.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(10.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.05f)
                close()
                moveTo(6.25f, 2.0f)
                curveTo(5.01f, 2.0f, 4.0f, 3.0f, 4.0f, 4.25f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(17.5f, 8.87f)
                curveToRelative(0.0f, -0.6f, -0.24f, -1.17f, -0.66f, -1.6f)
                lineToRelative(-4.62f, -4.61f)
                curveToRelative(-0.42f, -0.42f, -1.0f, -0.66f, -1.59f, -0.66f)
                lineTo(6.25f, 2.0f)
                close()
                moveTo(5.5f, 4.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.25f)
                verticalLineToRelative(3.25f)
                curveTo(10.5f, 7.99f, 11.51f, 9.0f, 12.75f, 9.0f)
                lineTo(16.0f, 9.0f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(12.0f, 6.75f)
                lineTo(12.0f, 4.56f)
                lineToRelative(2.94f, 2.94f)
                horizontalLineToRelative(-2.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(8.75f, 22.0f)
                curveToRelative(-0.98f, 0.0f, -1.81f, -0.63f, -2.12f, -1.5f)
                horizontalLineToRelative(8.62f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(18.5f, 8.94f)
                lineToRelative(0.84f, 0.84f)
                curveToRelative(0.42f, 0.42f, 0.66f, 1.0f, 0.66f, 1.59f)
                verticalLineToRelative(5.88f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 15.25f, 22.0f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        return _documentBulletListMultiple!!
    }

private var _documentBulletListMultiple: ImageVector? = null
