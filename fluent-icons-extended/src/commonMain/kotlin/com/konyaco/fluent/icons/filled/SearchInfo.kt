

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SearchInfo: ImageVector
    get() {
        if (_searchInfo != null) {
            return _searchInfo!!
        }
        _searchInfo = fluentIcon(name = "Filled.SearchInfo") {
            fluentPath {
                moveTo(17.25f, 10.0f)
                arcToRelative(7.25f, 7.25f, 0.0f, true, false, -2.68f, 5.63f)
                lineToRelative(4.9f, 4.9f)
                lineToRelative(0.08f, 0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.98f, -1.13f)
                lineToRelative(-4.9f, -4.9f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 17.25f, 10.0f)
                close()
                moveTo(11.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(10.0f, 9.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _searchInfo!!
    }

private var _searchInfo: ImageVector? = null
