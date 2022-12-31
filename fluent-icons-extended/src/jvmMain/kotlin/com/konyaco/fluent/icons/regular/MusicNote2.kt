

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MusicNote2: ImageVector
    get() {
        if (_musicNote2 != null) {
            return _musicNote2!!
        }
        _musicNote2 = fluentIcon(name = "Regular.MusicNote2") {
            fluentPath {
                moveTo(19.7f, 2.15f)
                curveToRelative(0.19f, 0.14f, 0.3f, 0.36f, 0.3f, 0.6f)
                lineTo(20.0f, 16.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.5f, -2.87f)
                lineTo(18.5f, 7.76f)
                lineTo(10.0f, 10.3f)
                verticalLineToRelative(8.19f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.5f, -2.87f)
                lineTo(8.5f, 5.75f)
                curveToRelative(0.0f, -0.33f, 0.22f, -0.62f, 0.53f, -0.72f)
                lineToRelative(10.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.67f, 0.12f)
                close()
                moveTo(10.0f, 8.75f)
                lineToRelative(8.5f, -2.56f)
                lineTo(18.5f, 3.76f)
                lineTo(10.0f, 6.3f)
                verticalLineToRelative(2.43f)
                close()
                moveTo(6.5f, 16.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(14.5f, 16.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
            }
        }
        return _musicNote2!!
    }

private var _musicNote2: ImageVector? = null
