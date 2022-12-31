

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentCopy: ImageVector
    get() {
        if (_documentCopy != null) {
            return _documentCopy!!
        }
        _documentCopy = fluentIcon(name = "Filled.DocumentCopy") {
            fluentPath {
                moveTo(13.0f, 6.75f)
                lineTo(13.0f, 2.0f)
                lineTo(8.75f, 2.0f)
                curveTo(7.51f, 2.0f, 6.5f, 3.0f, 6.5f, 4.25f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(20.0f, 9.0f)
                horizontalLineToRelative(-4.75f)
                curveTo(14.01f, 9.0f, 13.0f, 8.0f, 13.0f, 6.75f)
                close()
                moveTo(14.5f, 6.75f)
                lineTo(14.5f, 2.5f)
                lineToRelative(5.0f, 5.0f)
                horizontalLineToRelative(-4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(5.5f, 4.63f)
                curveTo(4.63f, 4.93f, 4.0f, 5.77f, 4.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 8.75f, 22.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.97f, 0.0f, 1.8f, -0.62f, 2.12f, -1.5f)
                lineTo(8.75f, 20.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.25f, -3.25f)
                lineTo(5.5f, 4.63f)
                close()
            }
        }
        return _documentCopy!!
    }

private var _documentCopy: ImageVector? = null
