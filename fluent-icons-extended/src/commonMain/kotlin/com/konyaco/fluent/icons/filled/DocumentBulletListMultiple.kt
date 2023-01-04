

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentBulletListMultiple: ImageVector
    get() {
        if (_documentBulletListMultiple != null) {
            return _documentBulletListMultiple!!
        }
        _documentBulletListMultiple = fluentIcon(name = "Filled.DocumentBulletListMultiple") {
            fluentPath {
                moveTo(4.0f, 4.25f)
                curveTo(4.0f, 3.01f, 5.0f, 2.0f, 6.25f, 2.0f)
                horizontalLineToRelative(4.25f)
                verticalLineToRelative(4.75f)
                curveTo(10.5f, 7.99f, 11.51f, 9.0f, 12.75f, 9.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(7.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(7.0f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                close()
                moveTo(10.0f, 12.25f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
                moveTo(10.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.05f)
                close()
                moveTo(12.0f, 6.75f)
                lineTo(12.0f, 2.47f)
                lineToRelative(0.22f, 0.19f)
                lineToRelative(4.62f, 4.62f)
                lineToRelative(0.2f, 0.22f)
                horizontalLineToRelative(-4.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(6.63f, 20.5f)
                curveToRelative(0.3f, 0.87f, 1.14f, 1.5f, 2.12f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 20.0f, 17.25f)
                verticalLineToRelative(-5.88f)
                curveToRelative(0.0f, -0.6f, -0.24f, -1.17f, -0.66f, -1.6f)
                lineToRelative(-0.84f, -0.83f)
                verticalLineToRelative(8.31f)
                curveToRelative(0.0f, 1.8f, -1.45f, 3.25f, -3.25f, 3.25f)
                lineTo(6.63f, 20.5f)
                close()
            }
        }
        return _documentBulletListMultiple!!
    }

private var _documentBulletListMultiple: ImageVector? = null
