

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageCircle: ImageVector
    get() {
        if (_imageCircle != null) {
            return _imageCircle!!
        }
        _imageCircle = fluentIcon(name = "Filled.ImageCircle") {
            fluentPath {
                moveTo(19.56f, 18.54f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -15.13f, 0.0f)
                lineToRelative(5.99f, -5.9f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.16f, 0.0f)
                lineToRelative(5.98f, 5.9f)
                close()
                moveTo(18.5f, 19.6f)
                lineToRelative(-5.97f, -5.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineTo(5.5f, 19.6f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, false, 13.0f, 0.0f)
                close()
                moveTo(17.5f, 8.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        return _imageCircle!!
    }

private var _imageCircle: ImageVector? = null
