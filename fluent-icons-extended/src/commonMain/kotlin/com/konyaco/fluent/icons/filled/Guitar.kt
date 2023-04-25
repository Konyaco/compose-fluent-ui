

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = fluentIcon(name = "Filled.Guitar") {
            fluentPath {
                moveToRelative(18.5f, 3.43f)
                lineToRelative(1.18f, -1.18f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                lineToRelative(-1.18f, 1.18f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(17.42f, 4.5f)
                lineToRelative(-3.82f, 3.82f)
                lineToRelative(-0.16f, -0.16f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -4.4f, 0.72f)
                lineToRelative(-0.42f, 0.83f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.66f, 0.32f)
                lineToRelative(-0.07f, -0.01f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -4.7f, 1.8f)
                arcToRelative(6.03f, 6.03f, 0.0f, false, false, 0.57f, 7.87f)
                lineToRelative(0.6f, 0.6f)
                arcToRelative(6.03f, 6.03f, 0.0f, false, false, 7.87f, 0.56f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, 1.8f, -4.7f)
                lineToRelative(-0.02f, -0.06f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.32f, -0.67f)
                lineToRelative(0.84f, -0.41f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.71f, -4.4f)
                lineToRelative(-0.16f, -0.17f)
                lineToRelative(3.82f, -3.82f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(9.42f, 14.57f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.13f, -2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.12f, 2.12f)
                close()
            }
        }
        return _guitar!!
    }

private var _guitar: ImageVector? = null
