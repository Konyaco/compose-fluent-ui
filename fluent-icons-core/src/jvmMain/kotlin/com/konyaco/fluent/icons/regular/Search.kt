

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = fluentIcon(name = "Regular.Search") {
            fluentPath {
                moveTo(10.0f, 2.75f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, true, 5.63f, 11.82f)
                lineToRelative(4.9f, 4.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.98f, 1.13f)
                lineToRelative(-0.08f, -0.07f)
                lineToRelative(-4.9f, -4.9f)
                arcTo(7.25f, 7.25f, 0.0f, true, true, 10.0f, 2.75f)
                close()
                moveTo(10.0f, 4.25f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 0.0f, 11.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 0.0f, -11.5f)
                close()
            }
        }
        return _search!!
    }

private var _search: ImageVector? = null
