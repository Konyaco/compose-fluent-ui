

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CloudWords: ImageVector
    get() {
        if (_cloudWords != null) {
            return _cloudWords!!
        }
        _cloudWords = fluentIcon(name = "Regular.CloudWords") {
            fluentPath {
                moveTo(7.5f, 10.79f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 9.0f, 0.0f)
                curveToRelative(0.01f, 0.4f, 0.34f, 0.71f, 0.74f, 0.71f)
                horizontalLineToRelative(0.26f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                horizontalLineToRelative(0.26f)
                curveToRelative(0.4f, 0.0f, 0.73f, -0.31f, 0.75f, -0.71f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.92f, 5.02f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 6.5f, 19.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.42f, -8.98f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 5.0f)
                close()
                moveTo(10.0f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(5.5f, 14.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(13.75f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        return _cloudWords!!
    }

private var _cloudWords: ImageVector? = null
