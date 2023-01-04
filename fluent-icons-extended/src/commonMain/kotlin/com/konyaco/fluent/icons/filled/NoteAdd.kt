

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.NoteAdd: ImageVector
    get() {
        if (_noteAdd != null) {
            return _noteAdd!!
        }
        _noteAdd = fluentIcon(name = "Filled.NoteAdd") {
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
                moveTo(6.5f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 5.48f, -10.0f)
                horizontalLineToRelative(5.77f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 13.0f)
                horizontalLineToRelative(-4.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 13.0f, 16.25f)
                lineTo(13.0f, 21.0f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineToRelative(-5.77f)
                arcTo(6.47f, 6.47f, 0.0f, false, false, 6.5f, 13.0f)
                close()
                moveTo(20.56f, 14.5f)
                lineToRelative(-6.06f, 6.06f)
                verticalLineToRelative(-4.31f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(4.31f)
                close()
            }
        }
        return _noteAdd!!
    }

private var _noteAdd: ImageVector? = null
