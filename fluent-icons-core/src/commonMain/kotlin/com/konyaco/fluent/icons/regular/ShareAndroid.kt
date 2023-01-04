

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShareAndroid: ImageVector
    get() {
        if (_shareAndroid != null) {
            return _shareAndroid!!
        }
        _shareAndroid = fluentIcon(name = "Regular.ShareAndroid") {
            fluentPath {
                moveTo(17.0f, 2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -2.6f, 5.85f)
                lineToRelative(-4.56f, 2.6f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 2.1f)
                lineToRelative(4.56f, 2.6f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 18.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -6.84f, -1.05f)
                lineToRelative(-4.56f, -2.6f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.0f, 12.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.1f, -2.35f)
                lineToRelative(4.56f, -2.6f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 2.5f)
                close()
                moveTo(17.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(6.5f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(17.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
            }
        }
        return _shareAndroid!!
    }

private var _shareAndroid: ImageVector? = null
