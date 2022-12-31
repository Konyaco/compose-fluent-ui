

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = fluentIcon(name = "Regular.Play") {
            fluentPath {
                moveTo(7.6f, 4.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.1f, 0.66f)
                verticalLineToRelative(13.46f)
                curveToRelative(0.0f, 0.56f, 0.6f, 0.93f, 1.1f, 0.65f)
                lineToRelative(12.37f, -6.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.32f)
                lineTo(7.61f, 4.61f)
                close()
                moveTo(5.0f, 5.27f)
                curveToRelative(0.0f, -1.7f, 1.83f, -2.79f, 3.33f, -1.97f)
                lineToRelative(12.36f, 6.72f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 3.96f)
                lineTo(8.33f, 20.7f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 5.0f, 18.73f)
                verticalLineTo(5.27f)
                close()
            }
        }
        return _play!!
    }

private var _play: ImageVector? = null
