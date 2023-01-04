

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = fluentIcon(name = "Filled.Backspace") {
            fluentPath {
                moveTo(18.75f, 4.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.24f, 3.07f)
                lineToRelative(0.01f, 0.18f)
                verticalLineToRelative(9.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.07f, 3.24f)
                lineToRelative(-0.18f, 0.01f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.77f, 0.0f, -1.5f, -0.27f, -2.09f, -0.76f)
                lineToRelative(-0.15f, -0.13f)
                lineToRelative(-5.0f, -4.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -0.11f, -4.6f)
                lineTo(3.0f, 9.64f)
                lineToRelative(5.0f, -4.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.03f, -0.88f)
                lineToRelative(0.2f, -0.01f)
                horizontalLineToRelative(8.51f)
                close()
                moveTo(11.45f, 8.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.05f, 1.05f)
                lineToRelative(0.07f, 0.08f)
                lineTo(12.94f, 12.0f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(-0.07f, 0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.05f, 1.05f)
                lineToRelative(0.08f, -0.07f)
                lineTo(14.0f, 13.06f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(0.08f, 0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.05f, -1.05f)
                lineToRelative(-0.07f, -0.08f)
                lineTo(15.06f, 12.0f)
                lineToRelative(2.47f, -2.47f)
                lineToRelative(0.07f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.05f, -1.05f)
                lineToRelative(-0.08f, 0.07f)
                lineTo(14.0f, 10.94f)
                lineToRelative(-2.47f, -2.47f)
                lineToRelative(-0.08f, -0.07f)
                close()
            }
        }
        return _backspace!!
    }

private var _backspace: ImageVector? = null
