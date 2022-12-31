

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = fluentIcon(name = "Regular.Sticker") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(6.88f)
                curveToRelative(0.0f, 0.6f, -0.24f, 1.17f, -0.66f, 1.59f)
                lineToRelative(-5.62f, 5.62f)
                curveToRelative(-0.42f, 0.42f, -1.0f, 0.66f, -1.6f, 0.66f)
                lineTo(6.26f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(17.75f, 4.5f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(13.0f, 19.5f)
                verticalLineToRelative(-3.06f)
                curveToRelative(-0.22f, 0.03f, -0.45f, 0.05f, -0.67f, 0.06f)
                lineToRelative(-0.33f, 0.01f)
                arcToRelative(6.33f, 6.33f, 0.0f, false, true, -3.68f, -1.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.86f, -1.23f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, false, 4.15f, 0.7f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.7f, -1.83f)
                lineToRelative(0.22f, -0.01f)
                horizontalLineToRelative(3.25f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(18.44f, 14.5f)
                horizontalLineToRelative(-2.19f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                verticalLineToRelative(0.15f)
                lineToRelative(-0.01f, 2.19f)
                lineToRelative(3.94f, -3.94f)
                close()
                moveTo(9.0f, 7.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(15.0f, 7.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
            }
        }
        return _sticker!!
    }

private var _sticker: ImageVector? = null
