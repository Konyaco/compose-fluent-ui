

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MusicNote1: ImageVector
    get() {
        if (_musicNote1 != null) {
            return _musicNote1!!
        }
        _musicNote1 = fluentIcon(name = "Filled.MusicNote1") {
            fluentPath {
                moveTo(11.51f, 2.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.01f, 0.7f)
                verticalLineToRelative(12.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 1.5f, 3.37f)
                verticalLineTo(8.83f)
                lineToRelative(6.99f, 2.62f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.01f, -0.7f)
                verticalLineTo(7.48f)
                curveToRelative(0.0f, -1.35f, -0.84f, -2.56f, -2.1f, -3.04f)
                lineToRelative(-6.39f, -2.4f)
                close()
            }
        }
        return _musicNote1!!
    }

private var _musicNote1: ImageVector? = null
