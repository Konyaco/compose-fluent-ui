

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = fluentIcon(name = "Regular.Backpack") {
            fluentPath {
                moveTo(10.42f, 8.0f)
                arcTo(2.42f, 2.42f, 0.0f, false, false, 8.0f, 10.42f)
                curveToRelative(0.0f, 0.87f, 0.7f, 1.58f, 1.58f, 1.58f)
                horizontalLineToRelative(4.84f)
                curveToRelative(0.87f, 0.0f, 1.58f, -0.7f, 1.58f, -1.58f)
                arcTo(2.42f, 2.42f, 0.0f, false, false, 13.58f, 8.0f)
                horizontalLineToRelative(-3.16f)
                close()
                moveTo(9.5f, 10.42f)
                curveToRelative(0.0f, -0.51f, 0.41f, -0.92f, 0.92f, -0.92f)
                horizontalLineToRelative(3.16f)
                curveToRelative(0.51f, 0.0f, 0.92f, 0.41f, 0.92f, 0.92f)
                curveToRelative(0.0f, 0.04f, -0.04f, 0.08f, -0.08f, 0.08f)
                lineTo(9.58f, 10.5f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, -0.08f, -0.08f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -3.74f, 3.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.5f)
                verticalLineToRelative(6.25f)
                curveTo(4.0f, 20.55f, 5.46f, 22.0f, 7.25f, 22.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(20.0f, 12.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.26f, -7.08f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(18.5f, 14.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 13.0f, 0.0f)
                lineTo(18.5f, 14.0f)
                close()
                moveTo(8.0f, 17.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.54f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(3.04f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-3.04f)
                lineTo(8.0f, 15.71f)
                verticalLineToRelative(1.54f)
                close()
                moveTo(12.0f, 4.5f)
                curveToRelative(-0.7f, 0.0f, -1.37f, 0.09f, -2.02f, 0.26f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 4.04f, 0.0f)
                arcTo(8.01f, 8.01f, 0.0f, false, false, 12.0f, 4.5f)
                close()
            }
        }
        return _backpack!!
    }

private var _backpack: ImageVector? = null
