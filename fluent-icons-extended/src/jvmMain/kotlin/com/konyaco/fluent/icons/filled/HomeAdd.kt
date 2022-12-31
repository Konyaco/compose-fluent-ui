

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HomeAdd: ImageVector
    get() {
        if (_homeAdd != null) {
            return _homeAdd!!
        }
        _homeAdd = fluentIcon(name = "Filled.HomeAdd") {
            fluentPath {
                moveTo(10.55f, 2.53f)
                curveToRelative(0.84f, -0.7f, 2.06f, -0.7f, 2.9f, 0.0f)
                lineToRelative(6.75f, 5.7f)
                curveToRelative(0.5f, 0.43f, 0.8f, 1.06f, 0.8f, 1.72f)
                verticalLineToRelative(2.07f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -8.62f, 9.48f)
                lineTo(4.75f, 21.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.8f)
                curveToRelative(0.0f, -0.66f, 0.3f, -1.3f, 0.8f, -1.72f)
                lineToRelative(6.75f, -5.7f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(18.0f, 18.0f)
                close()
            }
        }
        return _homeAdd!!
    }

private var _homeAdd: ImageVector? = null
