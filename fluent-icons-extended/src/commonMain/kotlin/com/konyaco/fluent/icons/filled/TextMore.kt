

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextMore: ImageVector
    get() {
        if (_textMore != null) {
            return _textMore!!
        }
        _textMore = fluentIcon(name = "Filled.TextMore") {
            fluentPath {
                moveTo(10.67f, 2.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.84f, 0.0f)
                lineToRelative(-6.75f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.84f, 0.78f)
                lineTo(5.77f, 15.0f)
                horizontalLineToRelative(7.96f)
                lineTo(15.0f, 18.05f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, 2.49f, 0.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.08f, -0.39f)
                lineToRelative(-6.75f, -16.0f)
                close()
                moveTo(12.88f, 13.0f)
                lineTo(6.62f, 13.0f)
                lineToRelative(3.13f, -7.43f)
                lineTo(12.88f, 13.0f)
                close()
                moveTo(10.5f, 22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(17.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(22.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        return _textMore!!
    }

private var _textMore: ImageVector? = null
