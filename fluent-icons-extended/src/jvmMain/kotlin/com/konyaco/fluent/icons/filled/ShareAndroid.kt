

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShareAndroid: ImageVector
    get() {
        if (_shareAndroid != null) {
            return _shareAndroid!!
        }
        _shareAndroid = fluentIcon(name = "Filled.ShareAndroid") {
            fluentPath {
                moveTo(17.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.15f, 5.1f)
                lineTo(9.4f, 11.2f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 1.58f)
                lineToRelative(5.45f, 3.12f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 20.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -5.9f, -0.79f)
                lineTo(8.66f, 14.1f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 3.5f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.15f, -2.1f)
                lineTo(14.1f, 6.8f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 3.0f)
                close()
            }
        }
        return _shareAndroid!!
    }

private var _shareAndroid: ImageVector? = null
