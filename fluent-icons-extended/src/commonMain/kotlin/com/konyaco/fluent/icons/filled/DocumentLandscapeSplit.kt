

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentLandscapeSplit: ImageVector
    get() {
        if (_documentLandscapeSplit != null) {
            return _documentLandscapeSplit!!
        }
        _documentLandscapeSplit = fluentIcon(name = "Filled.DocumentLandscapeSplit") {
            fluentPath {
                moveTo(10.5f, 4.0f)
                lineTo(4.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.5f)
                lineTo(10.5f, 4.0f)
                close()
                moveTo(12.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(16.0f, 10.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-6.0f, -6.0f)
                lineTo(15.5f, 10.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
        }
        return _documentLandscapeSplit!!
    }

private var _documentLandscapeSplit: ImageVector? = null
