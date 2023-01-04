

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.NumberCircle1: ImageVector
    get() {
        if (_numberCircle1 != null) {
            return _numberCircle1!!
        }
        _numberCircle1 = fluentIcon(name = "Filled.NumberCircle1") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                close()
                moveTo(13.5f, 7.25f)
                verticalLineToRelative(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(12.0f, 10.1f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, true, -2.01f, 1.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.48f, -1.42f)
                curveToRelative(0.57f, -0.2f, 1.15f, -0.64f, 1.63f, -1.23f)
                curveToRelative(0.47f, -0.59f, 0.78f, -1.23f, 0.87f, -1.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.49f, 0.14f)
                close()
            }
        }
        return _numberCircle1!!
    }

private var _numberCircle1: ImageVector? = null
