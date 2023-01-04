

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = fluentIcon(name = "Regular.Wallet") {
            fluentPath {
                moveTo(15.5f, 13.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.13f, -1.12f, 1.08f, -2.0f, 2.24f, -2.0f)
                horizontalLineToRelative(11.5f)
                curveTo(17.99f, 3.0f, 19.0f, 4.0f, 19.0f, 5.25f)
                verticalLineToRelative(0.84f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.5f, 3.16f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-12.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 5.0f)
                close()
                moveTo(18.25f, 7.5f)
                lineTo(4.5f, 7.5f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(17.5f, 6.0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(5.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(17.5f, 6.0f)
                close()
            }
        }
        return _wallet!!
    }

private var _wallet: ImageVector? = null
