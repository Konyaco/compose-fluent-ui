

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Patch: ImageVector
    get() {
        if (_patch != null) {
            return _patch!!
        }
        _patch = fluentIcon(name = "Filled.Patch") {
            fluentPath {
                moveToRelative(9.8f, 3.24f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-6.57f, 6.55f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, -4.59f)
                lineTo(5.2f, 3.24f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 4.6f, 0.0f)
                close()
                moveTo(14.2f, 20.76f)
                lineTo(12.7f, 19.26f)
                lineTo(19.27f, 12.71f)
                lineTo(20.77f, 14.21f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, 4.59f)
                lineToRelative(-1.97f, 1.96f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -4.6f, 0.0f)
                close()
                moveTo(3.24f, 14.2f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.0f, 4.6f)
                lineToRelative(1.96f, 1.96f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 4.6f, 0.0f)
                lineTo(20.76f, 9.8f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.0f, -4.6f)
                lineTo(18.8f, 3.24f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -4.6f, 0.0f)
                lineTo(3.24f, 14.2f)
                close()
                moveTo(12.75f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(9.0f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(12.0f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(15.75f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(12.0f, 15.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
            }
        }
        return _patch!!
    }

private var _patch: ImageVector? = null
