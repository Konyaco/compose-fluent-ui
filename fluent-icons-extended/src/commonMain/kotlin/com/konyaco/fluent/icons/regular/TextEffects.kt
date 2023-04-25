

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextEffects: ImageVector
    get() {
        if (_textEffects != null) {
            return _textEffects!!
        }
        _textEffects = fluentIcon(name = "Regular.TextEffects") {
            fluentPath {
                moveTo(14.3f, 4.02f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.6f, 0.0f)
                lineToRelative(-4.26f, 9.94f)
                lineToRelative(-0.05f, 0.1f)
                lineToRelative(-1.69f, 3.96f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.6f, 1.96f)
                lineToRelative(1.06f, -2.48f)
                horizontalLineToRelative(5.28f)
                lineToRelative(1.06f, 2.48f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.6f, -1.96f)
                lineToRelative(-1.7f, -3.95f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, false, -0.04f, -0.1f)
                lineTo(14.3f, 4.01f)
                close()
                moveTo(12.5f, 12.5f)
                lineTo(12.0f, 11.35f)
                lineTo(11.5f, 12.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(12.92f, 4.6f)
                lineTo(17.2f, 14.59f)
                lineTo(17.21f, 14.63f)
                lineTo(18.92f, 18.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.84f, 0.78f)
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
