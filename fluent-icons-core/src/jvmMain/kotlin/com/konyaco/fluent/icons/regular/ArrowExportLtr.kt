

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowExportLtr: ImageVector
    get() {
        if (_arrowExportLtr != null) {
            return _arrowExportLtr!!
        }
        _arrowExportLtr = fluentIcon(name = "Regular.ArrowExportLtr") {
            fluentPath {
                moveTo(2.75f, 4.5f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.75f, 0.65f)
                verticalLineToRelative(13.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(2.0f, 5.26f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(15.65f, 6.3f)
                lineToRelative(0.07f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(5.0f, 5.0f)
                curveToRelative(0.26f, 0.26f, 0.29f, 0.68f, 0.07f, 0.97f)
                lineToRelative(-0.07f, 0.09f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.97f)
                lineToRelative(0.07f, -0.09f)
                lineToRelative(3.71f, -3.72f)
                lineTo(5.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.64f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.64f, -0.75f)
                lineTo(19.45f, 11.01f)
                lineToRelative(-3.73f, -3.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.98f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(-0.07f, 0.08f)
                close()
            }
        }
        return _arrowExportLtr!!
    }

private var _arrowExportLtr: ImageVector? = null
