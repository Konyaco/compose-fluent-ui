

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = fluentIcon(name = "Filled.Search") {
            fluentPath {
                moveTo(10.0f, 2.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 5.96f, 12.05f)
                lineToRelative(4.75f, 4.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.5f)
                lineToRelative(-0.1f, -0.08f)
                lineToRelative(-4.74f, -4.75f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 10.0f, 2.5f)
                close()
                moveTo(10.0f, 4.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -11.0f)
                close()
            }
        }
        return _search!!
    }

private var _search: ImageVector? = null
