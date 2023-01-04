

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentOnePage: ImageVector
    get() {
        if (_documentOnePage != null) {
            return _documentOnePage!!
        }
        _documentOnePage = fluentIcon(name = "Filled.DocumentOnePage") {
            fluentPath {
                moveTo(17.75f, 2.0f)
                curveToRelative(1.2f, 0.0f, 2.17f, 0.93f, 2.24f, 2.1f)
                lineToRelative(0.01f, 0.16f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.19f, -0.93f, 2.16f, -2.1f, 2.24f)
                lineTo(6.25f, 22.0f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.09f)
                lineTo(4.0f, 19.76f)
                lineTo(4.0f, 4.26f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.25f)
                horizontalLineToRelative(11.65f)
                close()
                moveTo(7.75f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(7.0f, 11.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
                moveTo(7.75f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-8.5f)
                close()
            }
        }
        return _documentOnePage!!
    }

private var _documentOnePage: ImageVector? = null
