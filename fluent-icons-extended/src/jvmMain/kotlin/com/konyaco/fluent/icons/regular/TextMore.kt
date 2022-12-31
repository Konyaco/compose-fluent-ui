

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextMore: ImageVector
    get() {
        if (_textMore != null) {
            return _textMore!!
        }
        _textMore = fluentIcon(name = "Regular.TextMore") {
            fluentPath {
                moveTo(9.75f, 2.0f)
                curveToRelative(0.3f, 0.0f, 0.57f, 0.18f, 0.7f, 0.46f)
                lineToRelative(6.96f, 16.43f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.0f, -0.89f)
                lineToRelative(-1.49f, -3.5f)
                lineTo(5.58f, 14.5f)
                lineToRelative(-2.14f, 5.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.38f, -0.58f)
                lineToRelative(7.0f, -16.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.75f, 2.0f)
                close()
                moveTo(13.28f, 13.0f)
                lineTo(9.75f, 4.67f)
                lineTo(6.22f, 13.0f)
                horizontalLineToRelative(7.06f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(15.5f, 22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(20.5f, 22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
        }
        return _textMore!!
    }

private var _textMore: ImageVector? = null
