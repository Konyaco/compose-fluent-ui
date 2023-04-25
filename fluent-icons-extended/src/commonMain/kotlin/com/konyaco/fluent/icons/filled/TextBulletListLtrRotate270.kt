

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextBulletListLtrRotate270: ImageVector
    get() {
        if (_textBulletListLtrRotate270 != null) {
            return _textBulletListLtrRotate270!!
        }
        _textBulletListLtrRotate270 = fluentIcon(name = "Filled.TextBulletListLtrRotate270") {
            fluentPath {
                moveTo(16.5f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(17.0f, 16.5f)
                lineTo(17.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(19.0f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                verticalLineToRelative(-0.12f)
                close()
                moveTo(10.5f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(11.0f, 16.5f)
                lineTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(13.0f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                verticalLineToRelative(-0.12f)
                close()
                moveTo(4.5f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(5.0f, 16.5f)
                lineTo(5.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(7.0f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                verticalLineToRelative(-0.12f)
                close()
            }
        }
        return _textBulletListLtrRotate270!!
    }

private var _textBulletListLtrRotate270: ImageVector? = null
