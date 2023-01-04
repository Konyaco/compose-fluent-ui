

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TagError: ImageVector
    get() {
        if (_tagError != null) {
            return _tagError!!
        }
        _tagError = fluentIcon(name = "Filled.TagError") {
            fluentPath {
                moveTo(19.75f, 2.0f)
                curveTo(20.99f, 2.0f, 22.0f, 3.0f, 22.0f, 4.25f)
                verticalLineToRelative(5.46f)
                curveToRelative(0.0f, 0.86f, -0.34f, 1.69f, -0.95f, 2.3f)
                lineToRelative(-0.03f, 0.03f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 12.0f, 20.96f)
                curveToRelative(-1.25f, 0.8f, -2.94f, 0.65f, -4.04f, -0.45f)
                lineTo(3.5f, 16.06f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, -4.6f)
                lineToRelative(8.5f, -8.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.3f, -0.96f)
                horizontalLineToRelative(5.46f)
                close()
                moveTo(17.0f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(17.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(17.5f, 21.13f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, false, 0.0f, -1.25f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, 0.0f, 1.25f)
                close()
            }
        }
        return _tagError!!
    }

private var _tagError: ImageVector? = null
