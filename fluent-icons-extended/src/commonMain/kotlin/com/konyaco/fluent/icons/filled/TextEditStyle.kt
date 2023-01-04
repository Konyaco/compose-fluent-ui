

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextEditStyle: ImageVector
    get() {
        if (_textEditStyle != null) {
            return _textEditStyle!!
        }
        _textEditStyle = fluentIcon(name = "Filled.TextEditStyle") {
            fluentPath {
                moveTo(20.06f, 8.45f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, 0.0f, 4.55f)
                lineToRelative(-7.11f, 7.1f)
                curveToRelative(-0.27f, 0.27f, -0.61f, 0.47f, -0.98f, 0.57f)
                lineToRelative(-4.61f, 1.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.92f, -0.94f)
                lineToRelative(1.38f, -4.54f)
                curveToRelative(0.11f, -0.35f, 0.3f, -0.67f, 0.56f, -0.93f)
                lineToRelative(7.13f, -7.12f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, 4.55f, 0.0f)
                close()
                moveTo(8.16f, 2.37f)
                lineToRelative(0.04f, 0.1f)
                lineToRelative(3.25f, 8.25f)
                lineToRelative(-1.15f, 1.16f)
                lineTo(9.56f, 10.0f)
                horizontalLineTo(5.44f)
                lineToRelative(-1.0f, 2.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.87f, 0.45f)
                lineToRelative(-0.1f, -0.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.45f, -0.87f)
                lineToRelative(0.03f, -0.1f)
                lineToRelative(3.76f, -9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.34f, -0.1f)
                close()
                moveTo(7.5f, 4.79f)
                lineTo(6.04f, 8.5f)
                horizontalLineToRelative(2.92f)
                lineTo(7.5f, 4.8f)
                close()
            }
        }
        return _textEditStyle!!
    }

private var _textEditStyle: ImageVector? = null
