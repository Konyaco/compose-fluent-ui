

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentLandscape: ImageVector
    get() {
        if (_documentLandscape != null) {
            return _documentLandscape!!
        }
        _documentLandscape = fluentIcon(name = "Filled.DocumentLandscape") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(14.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(21.5f, 10.5f)
                lineTo(16.0f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(15.5f, 4.5f)
                lineToRelative(6.0f, 6.0f)
                close()
            }
        }
        return _documentLandscape!!
    }

private var _documentLandscape: ImageVector? = null
