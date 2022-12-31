

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextBulletListRtl: ImageVector
    get() {
        if (_textBulletListRtl != null) {
            return _textBulletListRtl!!
        }
        _textBulletListRtl = fluentIcon(name = "Regular.TextBulletListRtl") {
            fluentPath {
                moveTo(20.75f, 17.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
                moveTo(17.25f, 18.0f)
                lineTo(2.75f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(14.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(20.75f, 11.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
                moveTo(17.25f, 11.5f)
                lineTo(2.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(14.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(20.75f, 4.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
                moveTo(17.25f, 5.0f)
                lineTo(2.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(14.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _textBulletListRtl!!
    }

private var _textBulletListRtl: ImageVector? = null
