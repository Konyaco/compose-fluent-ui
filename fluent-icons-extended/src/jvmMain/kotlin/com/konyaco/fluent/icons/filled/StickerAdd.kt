

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.StickerAdd: ImageVector
    get() {
        if (_stickerAdd != null) {
            return _stickerAdd!!
        }
        _stickerAdd = fluentIcon(name = "Filled.StickerAdd") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(17.5f, 14.0f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.4f)
                lineToRelative(-0.01f, 0.1f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(-2.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.41f)
                verticalLineToRelative(0.18f)
                curveToRelative(0.04f, 0.2f, 0.2f, 0.36f, 0.4f, 0.4f)
                lineToRelative(0.1f, 0.01f)
                lineTo(17.0f, 18.0f)
                verticalLineToRelative(2.6f)
                curveToRelative(0.05f, 0.2f, 0.2f, 0.36f, 0.41f, 0.4f)
                horizontalLineToRelative(0.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.4f)
                lineToRelative(0.01f, -0.1f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(2.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.41f)
                verticalLineToRelative(-0.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, -0.4f)
                lineToRelative(-0.1f, -0.01f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-2.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.41f, -0.4f)
                horizontalLineToRelative(-0.09f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(5.77f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -9.5f, 2.96f)
                arcToRelative(4.78f, 4.78f, 0.0f, false, true, -2.32f, -0.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.86f, 1.23f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 2.77f, 1.08f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.93f, 4.55f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
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
        return _stickerAdd!!
    }

private var _stickerAdd: ImageVector? = null
