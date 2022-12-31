

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MyLocation: ImageVector
    get() {
        if (_myLocation != null) {
            return _myLocation!!
        }
        _myLocation = fluentIcon(name = "Filled.MyLocation") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                lineTo(13.0f, 4.31f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 6.69f, 6.7f)
                lineTo(21.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(19.69f, 13.0f)
                arcTo(7.75f, 7.75f, 0.0f, false, true, 13.0f, 19.69f)
                lineTo(13.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                lineTo(11.0f, 19.69f)
                arcTo(7.75f, 7.75f, 0.0f, false, true, 4.31f, 13.0f)
                lineTo(3.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(4.31f, 11.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 6.7f, -6.69f)
                lineTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(12.0f, 6.25f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 0.0f, 11.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 0.0f, -11.5f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
            }
        }
        return _myLocation!!
    }

private var _myLocation: ImageVector? = null
