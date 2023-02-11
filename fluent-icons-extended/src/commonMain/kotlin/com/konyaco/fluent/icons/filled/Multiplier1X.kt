

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Multiplier1X: ImageVector
    get() {
        if (_multiplier1X != null) {
            return _multiplier1X!!
        }
        _multiplier1X = fluentIcon(name = "Filled.Multiplier1X") {
            fluentPath {
                moveTo(10.0f, 7.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.85f, -0.52f)
                lineToRelative(-0.08f, 0.12f)
                curveToRelative(-0.4f, 0.67f, -0.84f, 1.4f, -2.08f, 2.14f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 11.36f)
                curveToRelative(0.38f, -0.23f, 0.7f, -0.46f, 0.99f, -0.69f)
                lineTo(7.99f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(9.99f, 7.9f)
                close()
                moveTo(13.7f, 12.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, 1.4f)
                lineToRelative(0.79f, 0.8f)
                lineToRelative(-0.8f, 0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 1.4f)
                lineToRelative(0.79f, -0.78f)
                lineToRelative(0.8f, 0.79f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, -1.42f)
                lineToRelative(-0.79f, -0.79f)
                lineToRelative(0.8f, -0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.4f)
                lineToRelative(-0.79f, 0.79f)
                lineToRelative(-0.8f, -0.8f)
                close()
            }
        }
        return _multiplier1X!!
    }

private var _multiplier1X: ImageVector? = null
