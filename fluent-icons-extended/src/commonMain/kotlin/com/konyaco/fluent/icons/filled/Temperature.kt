

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Temperature: ImageVector
    get() {
        if (_temperature != null) {
            return _temperature!!
        }
        _temperature = fluentIcon(name = "Filled.Temperature") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 3.8f)
                lineTo(16.0f, 12.73f)
                lineToRelative(0.06f, 0.06f)
                curveToRelative(0.8f, 0.86f, 1.3f, 1.97f, 1.41f, 3.16f)
                lineToRelative(0.02f, 0.27f)
                lineToRelative(0.01f, 0.28f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -9.73f, -3.51f)
                lineToRelative(0.17f, -0.2f)
                lineToRelative(0.06f, -0.06f)
                lineTo(8.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.6f, -3.98f)
                lineToRelative(0.2f, -0.02f)
                horizontalLineToRelative(0.2f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 1.85f)
                verticalLineToRelative(7.75f)
                lineToRelative(-0.33f, 0.3f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.49f, -5.96f)
                lineToRelative(-0.16f, -0.15f)
                lineToRelative(-0.33f, -0.3f)
                lineTo(14.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.2f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _temperature!!
    }

private var _temperature: ImageVector? = null
