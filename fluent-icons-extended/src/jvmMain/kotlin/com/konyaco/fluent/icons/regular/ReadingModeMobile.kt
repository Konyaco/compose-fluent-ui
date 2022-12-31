

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ReadingModeMobile: ImageVector
    get() {
        if (_readingModeMobile != null) {
            return _readingModeMobile!!
        }
        _readingModeMobile = fluentIcon(name = "Regular.ReadingModeMobile") {
            fluentPath {
                moveTo(17.75f, 2.0f)
                curveToRelative(1.2f, 0.0f, 2.17f, 0.93f, 2.24f, 2.1f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.19f, -0.93f, 2.16f, -2.1f, 2.24f)
                lineTo(6.25f, 21.99f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.09f)
                lineTo(4.0f, 19.75f)
                lineTo(4.0f, 4.25f)
                curveToRelative(0.0f, -1.19f, 0.93f, -2.16f, 2.1f, -2.24f)
                horizontalLineToRelative(11.65f)
                close()
                moveTo(17.75f, 3.5f)
                lineTo(6.25f, 3.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.74f)
                horizontalLineToRelative(11.6f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.27f, 0.74f, -0.64f)
                lineToRelative(0.01f, -0.1f)
                lineTo(18.5f, 4.25f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.65f, -0.74f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(12.25f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(4.6f)
                close()
                moveTo(16.25f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(8.6f)
                close()
                moveTo(16.25f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(8.6f)
                close()
            }
        }
        return _readingModeMobile!!
    }

private var _readingModeMobile: ImageVector? = null
