

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CatchUp: ImageVector
    get() {
        if (_catchUp != null) {
            return _catchUp!!
        }
        _catchUp = fluentIcon(name = "Filled.CatchUp") {
            fluentPath {
                moveTo(11.37f, 7.27f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.73f, 0.01f)
                lineToRelative(-1.2f, 3.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.47f, 0.32f)
                horizontalLineToRelative(-1.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.28f, 2.0f)
                horizontalLineToRelative(1.12f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.33f, -1.6f)
                lineTo(9.51f, 8.0f)
                lineToRelative(3.22f, 8.23f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.67f, 0.13f)
                lineToRelative(1.6f, -3.32f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.44f, -0.29f)
                horizontalLineToRelative(0.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.3f, -2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.25f, 1.42f)
                lineToRelative(-1.6f, 3.33f)
                lineToRelative(-3.22f, -8.23f)
                close()
            }
        }
        return _catchUp!!
    }

private var _catchUp: ImageVector? = null
