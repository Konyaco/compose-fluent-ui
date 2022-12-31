

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentHeart: ImageVector
    get() {
        if (_documentHeart != null) {
            return _documentHeart!!
        }
        _documentHeart = fluentIcon(name = "Filled.DocumentHeart") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(9.49f, 22.0f)
                lineToRelative(3.17f, -3.17f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, false, -5.65f, -6.87f)
                curveToRelative(-0.9f, -0.6f, -1.97f, -0.85f, -3.01f, -0.73f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.5f, 2.5f)
                lineTo(13.5f, 8.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(7.01f, 22.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.53f, -0.22f)
                lineToRelative(-4.4f, -4.4f)
                arcToRelative(3.47f, 3.47f, 0.0f, true, true, 4.9f, -4.91f)
                lineToRelative(0.03f, 0.04f)
                lineToRelative(0.04f, -0.04f)
                arcToRelative(3.47f, 3.47f, 0.0f, true, true, 4.9f, 4.9f)
                lineToRelative(-4.4f, 4.41f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, 0.22f)
                close()
            }
        }
        return _documentHeart!!
    }

private var _documentHeart: ImageVector? = null
