

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Autocorrect: ImageVector
    get() {
        if (_autocorrect != null) {
            return _autocorrect!!
        }
        _autocorrect = fluentIcon(name = "Filled.Autocorrect") {
            fluentPath {
                moveTo(13.6f, 4.72f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.94f, 0.95f)
                lineToRelative(2.87f, 4.58f)
                horizontalLineToRelative(4.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.75f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -4.0f, -2.0f)
                horizontalLineToRelative(0.3f)
                lineToRelative(-0.28f, -0.45f)
                lineToRelative(-1.92f, -3.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.63f, -0.1f)
                lineToRelative(-0.07f, 0.1f)
                lineTo(3.6f, 18.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.75f, -0.96f)
                lineToRelative(0.05f, -0.1f)
                lineTo(9.46f, 5.67f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.13f, -0.95f)
                close()
                moveTo(14.75f, 12.25f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        return _autocorrect!!
    }

private var _autocorrect: ImageVector? = null
