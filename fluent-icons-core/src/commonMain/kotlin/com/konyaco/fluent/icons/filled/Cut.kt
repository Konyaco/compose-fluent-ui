

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Cut: ImageVector
    get() {
        if (_cut != null) {
            return _cut!!
        }
        _cut = fluentIcon(name = "Filled.Cut") {
            fluentPath {
                moveTo(7.83f, 2.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.66f, 1.12f)
                lineToRelative(4.8f, 7.11f)
                lineToRelative(-2.33f, 3.68f)
                arcTo(3.99f, 3.99f, 0.0f, false, false, 3.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.2f, -2.4f)
                lineToRelative(1.98f, -3.12f)
                lineToRelative(1.89f, 2.8f)
                arcTo(3.99f, 3.99f, 0.0f, false, false, 17.0f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -1.25f, -7.8f)
                lineToRelative(-3.62f, -5.38f)
                lineToRelative(-4.3f, -6.38f)
                close()
                moveTo(5.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                close()
                moveTo(15.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                close()
                moveTo(14.52f, 8.79f)
                lineTo(17.85f, 3.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.7f, -1.07f)
                lineTo(13.3f, 6.98f)
                lineToRelative(1.22f, 1.81f)
                close()
            }
        }
        return _cut!!
    }

private var _cut: ImageVector? = null
