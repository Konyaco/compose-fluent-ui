

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = fluentIcon(name = "Regular.Warning") {
            fluentPath {
                moveTo(13.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(12.74f, 9.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                lineToRelative(0.01f, 4.5f)
                verticalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, -0.1f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-0.01f, -0.1f)
                close()
                moveTo(13.97f, 3.65f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.94f, 0.0f)
                lineTo(2.3f, 17.67f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 4.26f, 21.0f)
                horizontalLineToRelative(15.49f)
                curveToRelative(1.71f, 0.0f, 2.8f, -1.84f, 1.96f, -3.34f)
                lineToRelative(-7.74f, -14.0f)
                close()
                moveTo(11.34f, 4.39f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.32f, 0.0f)
                lineToRelative(7.74f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.65f, 1.11f)
                lineTo(4.25f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.65f, -1.11f)
                lineToRelative(7.74f, -14.0f)
                close()
            }
        }
        return _warning!!
    }

private var _warning: ImageVector? = null
