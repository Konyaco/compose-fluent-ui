

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EraserTool: ImageVector
    get() {
        if (_eraserTool != null) {
            return _eraserTool!!
        }
        _eraserTool = fluentIcon(name = "Filled.EraserTool") {
            fluentPath {
                moveTo(4.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(14.5f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 7.75f, 22.0f)
                horizontalLineToRelative(8.5f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 21.0f, 17.25f)
                lineTo(21.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                lineTo(19.5f, 7.0f)
                horizontalLineToRelative(-15.0f)
                lineTo(4.5f, 2.75f)
                close()
                moveTo(4.5f, 8.5f)
                horizontalLineToRelative(15.0f)
                lineTo(19.5f, 12.0f)
                horizontalLineToRelative(-15.0f)
                lineTo(4.5f, 8.5f)
                close()
            }
        }
        return _eraserTool!!
    }

private var _eraserTool: ImageVector? = null
