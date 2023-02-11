

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Note: ImageVector
    get() {
        if (_note != null) {
            return _note!!
        }
        _note = fluentIcon(name = "Filled.Note") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 13.0f)
                horizontalLineToRelative(-4.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 13.0f, 16.25f)
                lineTo(13.0f, 21.0f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(20.56f, 14.5f)
                lineToRelative(-6.06f, 6.06f)
                verticalLineToRelative(-4.31f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(4.31f)
                close()
            }
        }
        return _note!!
    }

private var _note: ImageVector? = null
