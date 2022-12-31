

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataLine: ImageVector
    get() {
        if (_dataLine != null) {
            return _dataLine!!
        }
        _dataLine = fluentIcon(name = "Filled.DataLine") {
            fluentPath {
                moveTo(16.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 2.52f, 2.96f)
                lineToRelative(-2.03f, 3.36f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.75f, 3.65f)
                lineTo(8.0f, 17.84f)
                verticalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -0.47f, -1.6f)
                lineToRelative(3.54f, -1.77f)
                arcTo(3.01f, 3.01f, 0.0f, false, true, 14.0f, 11.0f)
                curveToRelative(0.48f, 0.0f, 0.94f, 0.11f, 1.34f, 0.32f)
                lineToRelative(1.8f, -2.97f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 6.0f)
                close()
            }
        }
        return _dataLine!!
    }

private var _dataLine: ImageVector? = null
