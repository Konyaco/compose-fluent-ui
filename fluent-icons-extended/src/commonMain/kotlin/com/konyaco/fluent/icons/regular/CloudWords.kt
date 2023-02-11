

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
                moveTo(9.75f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(5.0f, 13.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(13.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(11.75f, 5.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -5.66f, 4.75f)
                lineTo(6.0f, 9.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineToRelative(-0.09f)
                arcTo(5.75f, 5.75f, 0.0f, false, false, 11.75f, 5.0f)
                close()
                moveTo(7.51f, 10.54f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 8.48f, 0.0f)
                curveToRelative(0.02f, 0.4f, 0.35f, 0.71f, 0.75f, 0.71f)
                horizontalLineToRelative(0.76f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                lineTo(6.0f, 16.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                horizontalLineToRelative(0.76f)
                curveToRelative(0.4f, 0.0f, 0.73f, -0.31f, 0.75f, -0.71f)
                close()
            }
        }
        return _cloudWords!!
    }

private var _cloudWords: ImageVector? = null
