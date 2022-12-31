

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AttachText: ImageVector
    get() {
        if (_attachText != null) {
            return _attachText!!
        }
        _attachText = fluentIcon(name = "Filled.AttachText") {
            fluentPath {
                moveTo(7.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 4.78f)
                lineTo(12.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.18f)
                lineTo(6.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                lineTo(8.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.12f)
                lineTo(10.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, -0.18f)
                lineTo(4.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                lineTo(2.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                close()
                moveTo(15.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(15.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(15.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineToRelative(5.62f)
                lineTo(15.0f, 13.0f)
                close()
                moveTo(15.0f, 9.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(15.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineToRelative(5.62f)
                lineTo(15.0f, 9.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(15.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineToRelative(5.62f)
                lineTo(15.0f, 5.0f)
                close()
            }
        }
        return _attachText!!
    }

private var _attachText: ImageVector? = null
