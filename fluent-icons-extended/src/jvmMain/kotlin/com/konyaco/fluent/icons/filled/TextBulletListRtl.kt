

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextBulletListRtl: ImageVector
    get() {
        if (_textBulletListRtl != null) {
            return _textBulletListRtl!!
        }
        _textBulletListRtl = fluentIcon(name = "Filled.TextBulletListRtl") {
            fluentPath {
                moveTo(20.5f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(16.5f, 17.0f)
                lineTo(3.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.12f, 2.0f)
                lineTo(16.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.12f, -2.0f)
                horizontalLineToRelative(-0.12f)
                close()
                moveTo(20.5f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(16.5f, 11.0f)
                lineTo(3.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.12f, 2.0f)
                lineTo(16.5f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.12f, -2.0f)
                horizontalLineToRelative(-0.12f)
                close()
                moveTo(20.5f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(16.5f, 5.0f)
                lineTo(3.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.12f, 2.0f)
                lineTo(16.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.12f, -2.0f)
                horizontalLineToRelative(-0.12f)
                close()
            }
        }
        return _textBulletListRtl!!
    }

private var _textBulletListRtl: ImageVector? = null
