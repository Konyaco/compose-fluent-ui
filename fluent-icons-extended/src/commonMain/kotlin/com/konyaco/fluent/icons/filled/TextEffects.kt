

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextEffects: ImageVector
    get() {
        if (_textEffects != null) {
            return _textEffects!!
        }
        _textEffects = fluentIcon(name = "Filled.TextEffects") {
            fluentPath {
                moveTo(14.76f, 3.82f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.52f, 0.0f)
                lineToRelative(-4.26f, 9.94f)
                lineToRelative(-0.05f, 0.12f)
                lineToRelative(-1.69f, 3.94f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 5.52f, 2.36f)
                lineTo(9.69f, 18.0f)
                horizontalLineToRelative(4.62f)
                lineToRelative(0.93f, 2.18f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 5.52f, -2.36f)
                lineToRelative(-1.69f, -3.94f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -0.05f, -0.12f)
                lineToRelative(-4.26f, -9.94f)
                close()
                moveTo(12.92f, 4.61f)
                lineTo(17.2f, 14.59f)
                lineTo(17.21f, 14.63f)
                lineTo(18.92f, 18.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.84f, 0.78f)
                lineTo(15.63f, 16.0f)
                lineTo(8.37f, 16.0f)
                lineToRelative(-1.45f, 3.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.84f, -0.8f)
                lineToRelative(1.7f, -3.97f)
                lineToRelative(0.02f, -0.04f)
                lineToRelative(4.28f, -9.98f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.84f, 0.0f)
                close()
                moveTo(14.77f, 14.0f)
                lineTo(9.23f, 14.0f)
                lineTo(12.0f, 7.54f)
                lineTo(14.77f, 14.0f)
                close()
            }
        }
        return _textEffects!!
    }

private var _textEffects: ImageVector? = null
