

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Fluent: ImageVector
    get() {
        if (_fluent != null) {
            return _fluent!!
        }
        _fluent = fluentIcon(name = "Regular.Fluent") {
            fluentPath {
                moveTo(12.41f, 2.5f)
                horizontalLineToRelative(0.13f)
                lineToRelative(0.11f, 0.02f)
                lineToRelative(0.07f, 0.03f)
                lineToRelative(6.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.9f)
                lineTo(13.62f, 9.0f)
                lineToRelative(5.1f, 2.55f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.9f)
                lineToRelative(-5.76f, 2.84f)
                lineToRelative(0.04f, 5.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.75f, 0.44f)
                lineToRelative(-6.0f, -3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 17.5f)
                lineTo(6.0f, 5.96f)
                lineToRelative(0.02f, -0.1f)
                lineToRelative(0.02f, -0.06f)
                lineToRelative(0.01f, -0.03f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.06f, -0.09f)
                lineToRelative(0.07f, -0.06f)
                lineToRelative(0.07f, -0.05f)
                lineToRelative(6.08f, -3.04f)
                lineToRelative(0.08f, -0.02f)
                close()
                moveTo(7.0f, 12.82f)
                verticalLineToRelative(4.4f)
                lineToRelative(5.0f, 2.92f)
                lineToRelative(-0.04f, -4.82f)
                lineTo(7.0f, 12.81f)
                close()
                moveTo(7.62f, 12.02f)
                lineTo(12.0f, 14.2f)
                lineTo(12.0f, 9.83f)
                lineTo(7.61f, 12.0f)
                close()
                moveTo(12.99f, 9.82f)
                verticalLineToRelative(4.34f)
                lineTo(17.39f, 12.0f)
                lineToRelative(-4.39f, -2.2f)
                close()
                moveTo(7.0f, 11.19f)
                lineToRelative(4.37f, -2.17f)
                lineTo(7.0f, 6.82f)
                verticalLineToRelative(4.37f)
                close()
                moveTo(12.0f, 3.81f)
                lineTo(7.62f, 6.01f)
                lineTo(11.99f, 8.21f)
                verticalLineToRelative(-4.4f)
                close()
                moveTo(13.0f, 8.19f)
                lineTo(17.37f, 6.0f)
                lineTo(13.0f, 3.8f)
                verticalLineToRelative(4.4f)
                close()
            }
        }
        return _fluent!!
    }

private var _fluent: ImageVector? = null
