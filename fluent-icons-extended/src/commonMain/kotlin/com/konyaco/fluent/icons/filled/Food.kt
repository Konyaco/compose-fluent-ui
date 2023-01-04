

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Food: ImageVector
    get() {
        if (_food != null) {
            return _food!!
        }
        _food = fluentIcon(name = "Filled.Food") {
            fluentPath {
                moveTo(18.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                lineTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                lineTo(17.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                lineTo(15.0f, 8.0f)
                curveToRelative(0.0f, -2.2f, 1.5f, -5.0f, 3.0f, -5.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                lineTo(13.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 3.87f)
                lineTo(10.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                verticalLineToRelative(-7.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, -3.66f)
                lineTo(5.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(7.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, 1.73f)
                lineTo(8.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(10.0f, 10.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, -1.56f)
                lineTo(11.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _food!!
    }

private var _food: ImageVector? = null
