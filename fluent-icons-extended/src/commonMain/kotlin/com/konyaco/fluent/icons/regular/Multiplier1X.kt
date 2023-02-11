

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Multiplier1X: ImageVector
    get() {
        if (_multiplier1X != null) {
            return _multiplier1X!!
        }
        _multiplier1X = fluentIcon(name = "Regular.Multiplier1X") {
            fluentPath {
                moveTo(10.0f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.39f, -0.4f)
                verticalLineToRelative(0.01f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, true, -0.15f, 0.22f)
                arcToRelative(6.88f, 6.88f, 0.0f, false, true, -2.1f, 2.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.78f, 1.28f)
                curveToRelative(0.52f, -0.31f, 0.98f, -0.69f, 1.36f, -1.06f)
                verticalLineToRelative(6.42f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(13.28f, 12.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.22f, 1.22f)
                lineToRelative(-1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.22f, -1.22f)
                lineToRelative(1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineToRelative(-1.22f, -1.22f)
                lineToRelative(1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.22f, 1.22f)
                lineToRelative(-1.22f, -1.22f)
                close()
            }
        }
        return _multiplier1X!!
    }

private var _multiplier1X: ImageVector? = null
