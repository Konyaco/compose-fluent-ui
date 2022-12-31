

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.NumberCircle1: ImageVector
    get() {
        if (_numberCircle1 != null) {
            return _numberCircle1!!
        }
        _numberCircle1 = fluentIcon(name = "Regular.NumberCircle1") {
            fluentPath {
                moveTo(13.5f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.49f, -0.15f)
                curveToRelative(-0.1f, 0.48f, -0.4f, 1.12f, -0.87f, 1.7f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -1.63f, 1.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.48f, 1.42f)
                arcTo(4.99f, 4.99f, 0.0f, false, false, 12.0f, 10.1f)
                verticalLineToRelative(6.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                close()
            }
        }
        return _numberCircle1!!
    }

private var _numberCircle1: ImageVector? = null
