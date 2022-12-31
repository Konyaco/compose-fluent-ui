

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowExportRtl: ImageVector
    get() {
        if (_arrowExportRtl != null) {
            return _arrowExportRtl!!
        }
        _arrowExportRtl = fluentIcon(name = "Regular.ArrowExportRtl") {
            fluentPath {
                moveTo(21.24f, 4.5f)
                curveToRelative(-0.38f, 0.0f, -0.69f, 0.28f, -0.74f, 0.65f)
                verticalLineToRelative(13.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.49f, 0.1f)
                verticalLineTo(5.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(8.35f, 6.3f)
                lineToRelative(-0.07f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, -0.07f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.07f, 0.97f)
                lineToRelative(0.07f, 0.09f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.13f, -0.97f)
                lineToRelative(-0.07f, -0.09f)
                lineToRelative(-3.71f, -3.72f)
                horizontalLineToRelative(13.67f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.75f, -0.64f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.64f, -0.75f)
                horizontalLineTo(4.55f)
                lineToRelative(3.73f, -3.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.07f, -0.98f)
                lineToRelative(-0.07f, -0.08f)
                lineToRelative(0.07f, 0.08f)
                close()
            }
        }
        return _arrowExportRtl!!
    }

private var _arrowExportRtl: ImageVector? = null
