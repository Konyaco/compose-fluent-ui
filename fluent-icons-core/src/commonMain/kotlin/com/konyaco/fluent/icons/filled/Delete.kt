

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = fluentIcon(name = "Filled.Delete") {
            fluentPath {
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                close()
                moveTo(8.5f, 5.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                horizontalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.32f)
                lineToRelative(-1.17f, 12.11f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 15.03f, 22.0f)
                lineTo(8.97f, 22.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.73f, -3.39f)
                lineTo(4.07f, 6.5f)
                lineTo(2.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(8.5f, 5.0f)
                close()
                moveTo(10.5f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(14.25f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
            }
        }
        return _delete!!
    }

private var _delete: ImageVector? = null
