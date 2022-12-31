

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = fluentIcon(name = "Filled.Backpack") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -3.74f, 3.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.5f)
                lineTo(4.0f, 14.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.26f, -7.08f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(20.0f, 15.71f)
                lineTo(9.5f, 15.71f)
                verticalLineToRelative(1.54f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.54f)
                lineTo(4.0f, 15.71f)
                verticalLineToRelative(3.04f)
                curveTo(4.0f, 20.55f, 5.46f, 22.0f, 7.25f, 22.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-3.04f)
                close()
                moveTo(12.0f, 4.5f)
                curveToRelative(-0.7f, 0.0f, -1.37f, 0.09f, -2.02f, 0.26f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 4.04f, 0.0f)
                arcTo(8.01f, 8.01f, 0.0f, false, false, 12.0f, 4.5f)
                close()
                moveTo(8.0f, 10.42f)
                arcTo(2.42f, 2.42f, 0.0f, false, true, 10.42f, 8.0f)
                horizontalLineToRelative(3.16f)
                arcTo(2.42f, 2.42f, 0.0f, false, true, 16.0f, 10.42f)
                curveToRelative(0.0f, 0.87f, -0.7f, 1.58f, -1.58f, 1.58f)
                lineTo(9.58f, 12.0f)
                curveTo(8.71f, 12.0f, 8.0f, 11.3f, 8.0f, 10.42f)
                close()
                moveTo(10.42f, 9.5f)
                curveToRelative(-0.51f, 0.0f, -0.92f, 0.41f, -0.92f, 0.92f)
                curveToRelative(0.0f, 0.04f, 0.04f, 0.08f, 0.08f, 0.08f)
                horizontalLineToRelative(4.84f)
                curveToRelative(0.04f, 0.0f, 0.08f, -0.04f, 0.08f, -0.08f)
                curveToRelative(0.0f, -0.51f, -0.41f, -0.92f, -0.92f, -0.92f)
                horizontalLineToRelative(-3.16f)
                close()
            }
        }
        return _backpack!!
    }

private var _backpack: ImageVector? = null
