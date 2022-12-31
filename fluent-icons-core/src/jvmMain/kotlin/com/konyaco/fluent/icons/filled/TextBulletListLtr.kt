

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextBulletListLtr: ImageVector
    get() {
        if (_textBulletListLtr != null) {
            return _textBulletListLtr!!
        }
        _textBulletListLtr = fluentIcon(name = "Filled.TextBulletListLtr") {
            fluentPath {
                moveTo(3.5f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(7.5f, 17.0f)
                lineTo(21.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(7.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(21.0f, 17.0f)
                lineTo(7.5f, 17.0f)
                close()
                moveTo(3.5f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(7.5f, 11.0f)
                lineTo(21.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(7.5f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(21.0f, 11.0f)
                lineTo(7.5f, 11.0f)
                close()
                moveTo(3.5f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(7.5f, 5.0f)
                lineTo(21.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(7.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(21.0f, 5.0f)
                lineTo(7.5f, 5.0f)
                close()
            }
        }
        return _textBulletListLtr!!
    }

private var _textBulletListLtr: ImageVector? = null
