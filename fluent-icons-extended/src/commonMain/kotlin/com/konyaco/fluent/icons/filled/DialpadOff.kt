

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DialpadOff: ImageVector
    get() {
        if (_dialpadOff != null) {
            return _dialpadOff!!
        }
        _dialpadOff = fluentIcon(name = "Filled.DialpadOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(4.5f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.76f, 1.76f)
                lineToRelative(3.24f, 3.24f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.75f, 1.75f)
                lineToRelative(7.25f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(18.5f, 14.25f)
                curveToRelative(0.0f, 0.3f, -0.1f, 0.58f, -0.25f, 0.82f)
                lineToRelative(-2.07f, -2.08f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.32f, 1.26f)
                close()
                moveTo(13.5f, 9.25f)
                curveToRelative(0.0f, 0.3f, -0.09f, 0.59f, -0.25f, 0.82f)
                lineTo(11.18f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.32f, 1.25f)
                close()
                moveTo(8.5f, 4.25f)
                curveToRelative(0.0f, 0.3f, -0.09f, 0.59f, -0.24f, 0.83f)
                lineTo(6.18f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 4.25f)
                close()
                moveTo(12.0f, 17.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(7.0f, 12.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(17.0f, 7.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(12.0f, 2.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(17.0f, 2.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        return _dialpadOff!!
    }

private var _dialpadOff: ImageVector? = null
