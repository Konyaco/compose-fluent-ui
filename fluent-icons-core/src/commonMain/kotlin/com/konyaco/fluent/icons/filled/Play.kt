

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = fluentIcon(name = "Filled.Play") {
            fluentPath {
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
