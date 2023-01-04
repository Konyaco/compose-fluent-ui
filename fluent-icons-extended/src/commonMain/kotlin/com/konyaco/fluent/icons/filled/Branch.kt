

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Branch: ImageVector
    get() {
        if (_branch != null) {
            return _branch!!
        }
        _branch = fluentIcon(name = "Filled.Branch") {
            fluentPath {
                moveTo(4.0f, 5.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 4.49f, 3.36f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.26f, 3.89f)
                horizontalLineToRelative(0.33f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.33f)
                arcToRelative(6.99f, 6.99f, 0.0f, false, true, -5.5f, -2.67f)
                verticalLineToRelative(3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineTo(8.92f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 5.5f)
                close()
            }
        }
        return _branch!!
    }

private var _branch: ImageVector? = null
