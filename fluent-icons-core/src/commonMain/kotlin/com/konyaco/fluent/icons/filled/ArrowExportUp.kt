

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowExportUp: ImageVector
    get() {
        if (_arrowExportUp != null) {
            return _arrowExportUp!!
        }
        _arrowExportUp = fluentIcon(name = "Filled.ArrowExportUp") {
            fluentPath {
                moveTo(12.7f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 1.4f)
                lineTo(11.0f, 5.42f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(5.41f)
                lineToRelative(3.3f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, -1.42f)
                lineToRelative(-5.0f, -5.0f)
                close()
                moveTo(5.26f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        return _arrowExportUp!!
    }

private var _arrowExportUp: ImageVector? = null
