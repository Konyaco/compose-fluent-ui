

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ReadingModeMobile: ImageVector
    get() {
        if (_readingModeMobile != null) {
            return _readingModeMobile!!
        }
        _readingModeMobile = fluentIcon(name = "Filled.ReadingModeMobile") {
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
                moveTo(12.25f, 13.0f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(12.35f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(16.25f, 10.0f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(16.25f, 7.0f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _readingModeMobile!!
    }

private var _readingModeMobile: ImageVector? = null
