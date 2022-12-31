

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextDescription: ImageVector
    get() {
        if (_textDescription != null) {
            return _textDescription!!
        }
        _textDescription = fluentIcon(name = "Regular.TextDescription") {
            fluentPath {
                moveTo(2.75f, 17.0f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(12.6f)
                horizontalLineToRelative(-12.5f)
                close()
                moveTo(2.75f, 13.0f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(18.6f)
                horizontalLineToRelative(-18.5f)
                close()
                moveTo(2.75f, 9.0f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(18.6f)
                horizontalLineToRelative(-18.5f)
                close()
                moveTo(2.75f, 5.0f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(18.6f)
                horizontalLineToRelative(-18.5f)
                close()
            }
        }
        return _textDescription!!
    }

private var _textDescription: ImageVector? = null
