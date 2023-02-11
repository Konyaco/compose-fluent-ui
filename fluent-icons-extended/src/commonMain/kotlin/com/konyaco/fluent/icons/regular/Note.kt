

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Note: ImageVector
    get() {
        if (_note != null) {
            return _note!!
        }
        _note = fluentIcon(name = "Regular.Note") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(6.88f)
                curveToRelative(0.0f, 0.6f, -0.24f, 1.17f, -0.66f, 1.59f)
                lineToRelative(-5.62f, 5.62f)
                curveToRelative(-0.42f, 0.42f, -1.0f, 0.66f, -1.6f, 0.66f)
                lineTo(6.26f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(17.75f, 4.5f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(13.0f, 19.5f)
                verticalLineToRelative(-3.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.07f, -3.24f)
                lineToRelative(0.18f, -0.01f)
                horizontalLineToRelative(3.25f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(18.44f, 14.5f)
                horizontalLineToRelative(-2.19f)
                curveToRelative(-0.92f, 0.0f, -1.67f, 0.7f, -1.74f, 1.6f)
                lineToRelative(-0.01f, 0.15f)
                verticalLineToRelative(2.19f)
                lineToRelative(3.94f, -3.94f)
                close()
            }
        }
        return _note!!
    }

private var _note: ImageVector? = null
