

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CloudWords: ImageVector
    get() {
        if (_cloudWords != null) {
            return _cloudWords!!
        }
        _cloudWords = fluentIcon(name = "Filled.CloudWords") {
            fluentPath {
                moveTo(11.75f, 5.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -5.66f, 4.75f)
                lineTo(6.0f, 9.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineToRelative(-0.09f)
                arcTo(5.75f, 5.75f, 0.0f, false, false, 11.75f, 5.0f)
                close()
                moveTo(9.75f, 9.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(5.0f, 13.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(13.75f, 13.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        return _cloudWords!!
    }

private var _cloudWords: ImageVector? = null
