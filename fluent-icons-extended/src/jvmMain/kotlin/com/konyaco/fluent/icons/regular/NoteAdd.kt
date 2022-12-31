

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.NoteAdd: ImageVector
    get() {
        if (_noteAdd != null) {
            return _noteAdd!!
        }
        _noteAdd = fluentIcon(name = "Regular.NoteAdd") {
            fluentPath {
                moveTo(12.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(7.0f, 7.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(6.0f, 7.0f)
                lineTo(3.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(6.0f, 6.0f)
                lineTo(6.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                lineTo(7.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineToRelative(-5.06f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -0.71f, -1.5f)
                horizontalLineToRelative(5.77f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(6.88f)
                curveToRelative(0.0f, 0.6f, -0.24f, 1.17f, -0.66f, 1.59f)
                lineToRelative(-5.62f, 5.62f)
                curveToRelative(-0.42f, 0.42f, -1.0f, 0.66f, -1.6f, 0.66f)
                lineTo(6.26f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineToRelative(-5.77f)
                curveToRelative(0.46f, 0.3f, 0.97f, 0.53f, 1.5f, 0.7f)
                verticalLineToRelative(5.07f)
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
        return _noteAdd!!
    }

private var _noteAdd: ImageVector? = null
