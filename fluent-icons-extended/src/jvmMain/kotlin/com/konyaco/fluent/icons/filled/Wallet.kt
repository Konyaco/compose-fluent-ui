

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = fluentIcon(name = "Filled.Wallet") {
            fluentPath {
                moveTo(3.0f, 5.0f)
                verticalLineToRelative(12.75f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-8.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 19.0f, 6.09f)
                verticalLineToRelative(-0.84f)
                curveTo(19.0f, 4.01f, 18.0f, 3.0f, 16.75f, 3.0f)
                lineTo(5.25f, 3.0f)
                curveToRelative(-1.16f, 0.0f, -2.11f, 0.88f, -2.24f, 2.0f)
                lineTo(3.0f, 5.0f)
                close()
                moveTo(5.25f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(17.5f, 6.0f)
                lineTo(5.25f, 6.0f)
                close()
                moveTo(16.25f, 13.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        return _wallet!!
    }

private var _wallet: ImageVector? = null
