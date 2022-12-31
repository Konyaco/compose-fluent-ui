

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataLine: ImageVector
    get() {
        if (_dataLine != null) {
            return _dataLine!!
        }
        _dataLine = fluentIcon(name = "Regular.DataLine") {
            fluentPath {
                moveTo(19.0f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(16.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 2.52f, 2.96f)
                lineToRelative(-2.03f, 3.36f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.75f, 3.65f)
                lineTo(8.0f, 17.84f)
                lineTo(8.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -0.47f, -1.6f)
                lineToRelative(3.54f, -1.77f)
                arcTo(3.01f, 3.01f, 0.0f, false, true, 14.0f, 11.0f)
                curveToRelative(0.48f, 0.0f, 0.94f, 0.11f, 1.34f, 0.32f)
                lineToRelative(1.8f, -2.97f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 6.0f)
                close()
                moveTo(14.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(5.0f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        return _dataLine!!
    }

private var _dataLine: ImageVector? = null
