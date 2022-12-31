

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SearchInfo: ImageVector
    get() {
        if (_searchInfo != null) {
            return _searchInfo!!
        }
        _searchInfo = fluentIcon(name = "Regular.SearchInfo") {
            fluentPath {
                moveTo(10.0f, 9.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(10.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
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
        return _searchInfo!!
    }

private var _searchInfo: ImageVector? = null
