

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PhotoFilter: ImageVector
    get() {
        if (_photoFilter != null) {
            return _photoFilter!!
        }
        _photoFilter = fluentIcon(name = "Filled.PhotoFilter") {
            fluentPath {
                moveTo(9.5f, 2.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.18f, 5.32f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, -9.36f, 9.36f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 9.5f, 2.0f)
                close()
                moveTo(17.0f, 9.6f)
                verticalLineToRelative(-0.1f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 9.6f, 17.0f)
                arcTo(5.5f, 5.5f, 0.0f, true, false, 17.0f, 9.6f)
                close()
                moveTo(9.5f, 4.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 7.0f, 14.4f)
                verticalLineToRelative(0.1f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 14.4f, 7.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -4.9f, -3.0f)
                close()
            }
        }
        return _photoFilter!!
    }

private var _photoFilter: ImageVector? = null
