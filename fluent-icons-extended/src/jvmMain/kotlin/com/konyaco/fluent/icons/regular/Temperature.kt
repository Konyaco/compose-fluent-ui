

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Temperature: ImageVector
    get() {
        if (_temperature != null) {
            return _temperature!!
        }
        _temperature = fluentIcon(name = "Regular.Temperature") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.24f, 3.07f)
                lineToRelative(0.01f, 0.18f)
                verticalLineToRelative(7.95f)
                lineToRelative(0.08f, 0.07f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, true, 1.64f, 3.22f)
                lineToRelative(0.02f, 0.26f)
                lineToRelative(0.01f, 0.25f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -8.51f, -3.56f)
                lineToRelative(0.18f, -0.17f)
                lineToRelative(0.08f, -0.07f)
                lineTo(8.75f, 5.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 2.88f, -3.23f)
                lineToRelative(0.19f, -0.01f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.5f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                lineToRelative(-0.01f, 0.15f)
                verticalLineToRelative(8.7f)
                lineToRelative(-0.3f, 0.22f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 4.27f, 0.13f)
                lineToRelative(-0.16f, -0.13f)
                lineToRelative(-0.3f, -0.22f)
                lineToRelative(-0.01f, -8.7f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(5.86f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(11.25f, 8.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _temperature!!
    }

private var _temperature: ImageVector? = null
