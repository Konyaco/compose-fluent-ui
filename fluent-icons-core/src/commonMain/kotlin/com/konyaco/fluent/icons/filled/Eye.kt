

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = fluentIcon(name = "Filled.Eye") {
            fluentPath {
                moveTo(12.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
                moveTo(12.0f, 5.5f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.7f, 7.56f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.45f, 0.37f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -16.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.45f, -0.36f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 5.5f)
                close()
            }
        }
        return _eye!!
    }

private var _eye: ImageVector? = null
