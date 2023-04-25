

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowExportRtl: ImageVector
    get() {
        if (_arrowExportRtl != null) {
            return _arrowExportRtl!!
        }
        _arrowExportRtl = fluentIcon(name = "Filled.ArrowExportRtl") {
            fluentPath {
                moveTo(21.25f, 4.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.29f, -0.75f, 0.65f)
                verticalLineToRelative(13.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.49f, 0.1f)
                verticalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.74f, -0.75f)
                close()
                moveTo(8.79f, 6.4f)
                lineToRelative(-0.09f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, -0.08f)
                lineToRelative(-0.1f, 0.08f)
                lineToRelative(-4.99f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.08f, 1.32f)
                lineToRelative(0.08f, 0.1f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.5f, -1.32f)
                lineToRelative(-0.09f, -0.1f)
                lineTo(5.42f, 13.0f)
                horizontalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.99f, -0.88f)
                verticalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.88f, -1.0f)
                horizontalLineTo(5.41f)
                lineToRelative(3.3f, -3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.08f, -1.31f)
                lineToRelative(-0.09f, -0.1f)
                lineToRelative(0.09f, 0.1f)
                close()
            }
        }
        return _arrowExportRtl!!
    }

private var _arrowExportRtl: ImageVector? = null
