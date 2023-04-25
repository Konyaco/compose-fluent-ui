

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextBulletListLtrRotate270: ImageVector
    get() {
        if (_textBulletListLtrRotate270 != null) {
            return _textBulletListLtrRotate270!!
        }
        _textBulletListLtrRotate270 = fluentIcon(name = "Regular.TextBulletListLtrRotate270") {
            fluentPath {
                moveTo(17.5f, 20.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                close()
                moveTo(18.0f, 17.25f)
                lineTo(18.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(14.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-0.1f)
                close()
                moveTo(11.0f, 20.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                close()
                moveTo(11.5f, 17.25f)
                lineTo(11.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(14.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-0.1f)
                close()
                moveTo(4.5f, 20.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                close()
                moveTo(5.0f, 17.25f)
                lineTo(5.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(14.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-0.1f)
                close()
            }
        }
        return _textBulletListLtrRotate270!!
    }

private var _textBulletListLtrRotate270: ImageVector? = null
