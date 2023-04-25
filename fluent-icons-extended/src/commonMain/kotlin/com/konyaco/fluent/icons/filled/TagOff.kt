

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TagOff: ImageVector
    get() {
        if (_tagOff != null) {
            return _tagOff!!
        }
        _tagOff = fluentIcon(name = "Filled.TagOff") {
            fluentPath {
                moveToRelative(16.0f, 17.06f)
                lineToRelative(4.72f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineTo(6.94f, 8.0f)
                lineTo(3.5f, 11.46f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.0f, 4.6f)
                lineToRelative(4.46f, 4.45f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 4.6f, 0.0f)
                lineTo(16.0f, 17.06f)
                close()
                moveTo(21.05f, 12.01f)
                lineTo(18.06f, 15.0f)
                lineTo(9.0f, 5.94f)
                lineTo(12.0f, 2.95f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.3f, -0.95f)
                horizontalLineToRelative(5.46f)
                curveTo(21.0f, 2.0f, 22.0f, 3.0f, 22.0f, 4.25f)
                verticalLineToRelative(5.46f)
                curveToRelative(0.0f, 0.86f, -0.34f, 1.69f, -0.95f, 2.3f)
                close()
                moveTo(17.0f, 5.51f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        return _tagOff!!
    }

private var _tagOff: ImageVector? = null
