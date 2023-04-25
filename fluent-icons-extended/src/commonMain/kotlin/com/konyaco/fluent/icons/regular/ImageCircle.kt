

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ImageCircle: ImageVector
    get() {
        if (_imageCircle != null) {
            return _imageCircle!!
        }
        _imageCircle = fluentIcon(name = "Regular.ImageCircle") {
            fluentPath {
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -6.51f, 13.96f)
                lineToRelative(4.93f, -4.84f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.16f, 0.0f)
                lineToRelative(4.93f, 4.84f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 12.0f, 3.5f)
                close()
                moveTo(17.45f, 18.52f)
                lineTo(12.53f, 13.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-4.92f, 4.83f)
                arcToRelative(8.47f, 8.47f, 0.0f, false, false, 10.9f, 0.0f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                close()
                moveTo(15.25f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(15.25f, 11.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f)
                close()
            }
        }
        return _imageCircle!!
    }

private var _imageCircle: ImageVector? = null
