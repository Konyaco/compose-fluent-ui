

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EraserTool: ImageVector
    get() {
        if (_eraserTool != null) {
            return _eraserTool!!
        }
        _eraserTool = fluentIcon(name = "Regular.EraserTool") {
            fluentPath {
                moveTo(3.75f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(4.5f, 7.0f)
                horizontalLineToRelative(15.0f)
                lineTo(19.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(14.5f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 16.25f, 22.0f)
                horizontalLineToRelative(-8.5f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 3.0f, 17.25f)
                lineTo(3.0f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(19.5f, 8.5f)
                horizontalLineToRelative(-15.0f)
                lineTo(4.5f, 12.0f)
                horizontalLineToRelative(15.0f)
                lineTo(19.5f, 8.5f)
                close()
                moveTo(4.5f, 17.25f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(19.5f, 13.5f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(3.75f)
                close()
            }
        }
        return _eraserTool!!
    }

private var _eraserTool: ImageVector? = null
