

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextBulletListAdd: ImageVector
    get() {
        if (_textBulletListAdd != null) {
            return _textBulletListAdd!!
        }
        _textBulletListAdd = fluentIcon(name = "Filled.TextBulletListAdd") {
            fluentPath {
                moveTo(5.0f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(12.02f, 17.0f)
                lineTo(7.38f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.12f, 2.0f)
                horizontalLineToRelative(4.67f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, -0.15f, -2.0f)
                close()
                moveTo(13.81f, 13.0f)
                lineTo(7.5f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(18.5f, 11.0f)
                curveToRelative(-1.84f, 0.0f, -3.5f, 0.77f, -4.69f, 2.0f)
                close()
                moveTo(5.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(5.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(21.0f, 5.0f)
                lineTo(7.38f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.12f, 2.0f)
                horizontalLineToRelative(13.62f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 5.0f)
                close()
                moveTo(24.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(19.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(19.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(19.0f, 18.0f)
                close()
            }
        }
        return _textBulletListAdd!!
    }

private var _textBulletListAdd: ImageVector? = null
