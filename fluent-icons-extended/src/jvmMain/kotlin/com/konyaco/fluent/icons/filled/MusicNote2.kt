

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MusicNote2: ImageVector
    get() {
        if (_musicNote2 != null) {
            return _musicNote2!!
        }
        _musicNote2 = fluentIcon(name = "Filled.MusicNote2") {
            fluentPath {
                moveTo(20.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.97f, -0.72f)
                lineToRelative(-10.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.53f, 0.72f)
                verticalLineToRelative(9.88f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 1.5f, 2.62f)
                verticalLineToRelative(-7.94f)
                lineToRelative(8.5f, -2.55f)
                verticalLineToRelative(5.87f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 1.5f, 2.62f)
                verticalLineTo(2.75f)
                close()
            }
        }
        return _musicNote2!!
    }

private var _musicNote2: ImageVector? = null
