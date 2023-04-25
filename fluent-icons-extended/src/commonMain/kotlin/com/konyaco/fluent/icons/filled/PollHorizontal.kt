

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PollHorizontal: ImageVector
    get() {
        if (_pollHorizontal != null) {
            return _pollHorizontal!!
        }
        _pollHorizontal = fluentIcon(name = "Filled.PollHorizontal") {
            fluentPath {
                moveTo(22.0f, 11.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                lineTo(4.75f, 14.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, -5.5f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 11.75f)
                close()
                moveTo(17.0f, 18.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, -5.5f)
                horizontalLineToRelative(9.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 17.0f, 18.75f)
                close()
                moveTo(12.0f, 4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 9.25f, 7.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, -5.5f)
                horizontalLineToRelative(4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 12.0f, 4.75f)
                close()
            }
        }
        return _pollHorizontal!!
    }

private var _pollHorizontal: ImageVector? = null
