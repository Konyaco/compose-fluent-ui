

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = fluentIcon(name = "Filled.Sticker") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 13.0f)
                horizontalLineToRelative(-4.96f)
                curveToRelative(-1.2f, 0.08f, -2.22f, 0.81f, -2.72f, 1.84f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, true, -4.14f, -0.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.86f, 1.23f)
                arcToRelative(6.33f, 6.33f, 0.0f, false, false, 4.35f, 1.1f)
                lineToRelative(0.33f, -0.03f)
                lineTo(13.0f, 21.0f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(20.35f, 14.72f)
                lineTo(14.72f, 20.34f)
                lineTo(14.5f, 20.54f)
                lineTo(14.5f, 16.1f)
                curveToRelative(0.08f, -0.85f, 0.75f, -1.53f, 1.6f, -1.6f)
                lineToRelative(0.15f, -0.01f)
                horizontalLineToRelative(4.28f)
                lineToRelative(-0.19f, 0.22f)
                close()
                moveTo(9.0f, 7.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
                moveTo(15.0f, 7.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
            }
        }
        return _sticker!!
    }

private var _sticker: ImageVector? = null
