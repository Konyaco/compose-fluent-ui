

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowExportUp: ImageVector
    get() {
        if (_arrowExportUp != null) {
            return _arrowExportUp!!
        }
        _arrowExportUp = fluentIcon(name = "Regular.ArrowExportUp") {
            fluentPath {
                moveTo(12.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineTo(11.0f, 4.56f)
                verticalLineToRelative(13.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(4.56f)
                lineToRelative(3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-5.0f, -5.0f)
                close()
                moveTo(5.25f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-13.0f)
                close()
            }
        }
        return _arrowExportUp!!
    }

private var _arrowExportUp: ImageVector? = null
